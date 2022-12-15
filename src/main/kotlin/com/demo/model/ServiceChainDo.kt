package com.demo.model

import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json


class ServiceChainDo {
    var tags: List<String> = ArrayList()

    //        var message: Map<String, String> = HashMap()
    /*var message: String by Delegates.observable("") { _, _, newValue ->
        messageEntity = Json.decodeFromString(newValue)
        println("newValue:$newValue")
        println("messageEntity:$messageEntity")
    }*/
    var message: String = ""

    //    var message: Message? = Message()
    val messageEntity: MessageDo by lazy {
//        println("lazy:$message")
        json.decodeFromString(message)
    }
    private val json = Json { ignoreUnknownKeys = true }
    var `@version`: String = ""
    var `@timestamp`: String = ""
    override fun toString(): String {
        return "ServiceChainDo(tags=$tags, message='$message', messageEntity=$messageEntity, `@version`='$`@version`', `@timestamp`='$`@timestamp`')"
    }


}