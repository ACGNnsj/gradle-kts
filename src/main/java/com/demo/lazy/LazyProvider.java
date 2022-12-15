package com.demo.lazy;

public class LazyProvider<T> implements Lazy<T> {

    private Provider<T> mInitializer;

    private final Object lock = new Object();

    // Represent a null object.
    private static final Object UNINITIALIZED = new Object();
    // Initialize the instace with null
    private static volatile Object INSTANCE = UNINITIALIZED;

    LazyProvider(Provider<T> initializer) {
        this.mInitializer = initializer;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get() {
        // If instance is not initialized.
        if( INSTANCE == UNINITIALIZED) {
            // lock
            synchronized (lock) {
                // again checked for initialization, if not initialized use eager initializer
                // to fetch the value.
                if( INSTANCE == UNINITIALIZED) {
                    INSTANCE = mInitializer.get();
                    // release the initializer.
                    mInitializer = null;
                }
            }
        }
        return (T) INSTANCE;
    }
}
