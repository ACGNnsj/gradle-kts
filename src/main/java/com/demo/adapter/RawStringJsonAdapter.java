package com.demo.adapter;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

public class RawStringJsonAdapter extends TypeAdapter<String> {

    @Override
    public void write(JsonWriter out, String value) throws IOException {
        out.jsonValue("");
    }

    @Override
    public String read(JsonReader in) throws IOException {
        return "";
    }
}
