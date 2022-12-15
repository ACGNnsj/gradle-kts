package com.demo.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Message {
    @Expose
    private String traceid;
    @Expose
    @SerializedName("p-spanid")
    private String p_spanid;
    @Expose

    private String spanid;
    @Expose

    private String spanNode;
    @Expose

    private String spanname;
    @Expose

    private String start_time;
    @Expose
    private String end_time;
    @Expose
    private String status_code;
    
//    @JsonAdapter(RawStringJsonAdapter.class)
    @Expose(deserialize = false)
    private String attributes;

    @Override
    public String toString() {
        return "Message{" +
                "traceid='" + traceid + '\'' +
                ", p_spanid='" + p_spanid + '\'' +
                ", spanid='" + spanid + '\'' +
                ", spanNode='" + spanNode + '\'' +
                ", spanname='" + spanname + '\'' +
                ", start_time='" + start_time + '\'' +
                ", end_time='" + end_time + '\'' +
                ", status_code='" + status_code + '\'' +
                '}';
    }
}
