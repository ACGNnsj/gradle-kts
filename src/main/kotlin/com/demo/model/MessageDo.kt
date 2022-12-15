package com.demo.model

import kotlinx.serialization.Serializable

@Serializable
class MessageDo {
    var traceid: String = ""
    var `p-spanid`: String = ""
    var spanid: String = ""
    var spanNode: String = ""
    var spanname: String = ""
    var start_time: String = ""
    var end_time: String = ""
    var status_code: String = ""
//    var attributes: Map<String,String> = HashMap()
    override fun toString(): String {
        return "Message(traceid='$traceid', `p-spanid`='$`p-spanid`', spanid='$spanid', spanNode='$spanNode', spanname='$spanname', start_time='$start_time', end_time='$end_time', status_code='$status_code')"
    }

}