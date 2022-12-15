package com.demo.model

import java.util.*

class LogDo {
    var log_id: Long = 0
    var logger: String? = null
    var trace_id: String? = null
    var level = 0
    var tag: String? = null
    var tag1: String? = null
    var tag2: String? = null
    var tag3: String? = null
    var summary: String? = null
    var content: String? = null
    var class_name: String? = null
    var thread_name: String? = null
    var from: String? = null
    var log_date = 0
    var log_fulltime: Date? = null
    var _score: Double? = null
    override fun toString(): String {
        return "LogDo{" +
                "log_id=" + log_id +
                ", logger='" + logger + '\'' +
                ", trace_id='" + trace_id + '\'' +
                ", level=" + level +
                ", tag='" + tag + '\'' +
                ", tag1='" + tag1 + '\'' +
                ", tag2='" + tag2 + '\'' +
                ", tag3='" + tag3 + '\'' +
                ", summary='" + summary + '\'' +
                ", content='" + content + '\'' +
                ", class_name='" + class_name + '\'' +
                ", thread_name='" + thread_name + '\'' +
                ", from='" + from + '\'' +
                ", log_date=" + log_date +
                ", log_fulltime=" + log_fulltime +
                ", _score=" + _score +
                '}'
    }
}