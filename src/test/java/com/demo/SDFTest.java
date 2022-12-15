package com.demo;

import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SDFTest {
    @Test
    void A(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        Calendar calendar= Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_WEEK,-17);
        String time = sdf.format(calendar.getTime());
        System.out.println(time);
    }
}
