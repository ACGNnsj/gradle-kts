package com.demo

import com.demo.model.MessageDo
import com.demo.model.ServiceChainDo
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

private val json = Json { ignoreUnknownKeys = true }

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

//    var serviceChainDo = ServiceChainDo()
//    serviceChainDo.message="{\"traceid\":\"123\",\"p-spanid\":\"123\",\"spanid\":\"123\",\"spanNode\":\"123\",\"spanname\":\"123\",\"start_time\":\"123\",\"end_time\":\"123\",\"status_code\":\"123\",\"attributes\":\"123\"}"
    var clazz = ServiceChainDo().javaClass
    var record = clazz.newInstance()
//    var field = clazz.getDeclaredField("message"+'$'+"delegate")
//    field.isAccessible = true
//    field.set(
//        record,
//        "{\"traceid\":\"123\",\"p-spanid\":\"123\",\"spanid\":\"123\",\"spanNode\":\"123\",\"spanname\":\"123\",\"start_time\":\"123\",\"end_time\":\"123\",\"status_code\":\"123\",\"attributes\":\"123\"}"
//    )
    for (declaredField in clazz.declaredFields) {
        println(declaredField)
    }
    
    var message:MessageDo= json.decodeFromString("{" +
            "  \"traceid\": \"BOS7bba9f33312b3dbb8b20221024141811\",\n" +
            "  \"p-spanid\": \"\",\n" +
            "  \"spanid\": \"BOSS086e83747d0e381e.1.1\",\n" +
            "  \"spanNode\": \"1.1\",\n" +
            "  \"spanname\": \" com.nl.xs.ability.admin.service.xxxClass::xxxMethod\",\n" +
            "  \"start_time\": \"2022-10-24 14:18:11 \",\n" +
            "  \"end_time\": \"2022-10-24 14:18:11 \",\n" +
            "  \"status_code\": \"ok\",\n" +
            "  \"attributes\": {\n" +
            "    \"user_id\": \" 123456789\"\n" +
            "    \"account_id\": \" 987654321\"\n" +
            "  }\n" +
            "}")
//    var message:Message=Json.decodeFromString("{\"traceid\":\"123\",\"p-spanid\":\"123\",\"spanid\":\"123\",\"spanNode\":\"123\",\"spanname\":\"123\",\"start_time\":\"123\",\"end_time\":\"123\",\"status_code\":\"123\",\"attributes\":\"123\"}")
    println(message)
}