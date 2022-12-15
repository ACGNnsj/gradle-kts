package com.demo

import com.demo.model.BlogDo
import com.demo.model.LogDo
import com.demo.model.ServiceChainDo
import org.junit.jupiter.api.Test
import org.noear.esearchx.EsContext
import org.noear.esearchx.EsGlobal


class ESearchTest {
    var tableCreateDsl = "..."

    @Test
    fun a() {
        //执行前打印dsl
        EsGlobal.onCommandBefore { cmd -> println("dsl:::" + cmd.dsl) }

        //实例化上下文
//        val esx = EsContext("172.32.150.153:9200")
        val esx = EsContext("172.32.150.246:9200")
        println("version:${esx.version}")
//        val result = esx.indice("blog_1").selectJson()
//        val result = esx.indice("blog_1").selectList(BlogDo::class.java)
//        val result = esx.indice("service_chain-*").selectList(ServiceChainDo::class.java)
        val result = esx.indice("service_chain-*").limit(100).selectList(ServiceChainDo::class.java)
//        val result = esx.indice("service_chain-*").select("{\"size\":30}")
        println("result:$result")
    }
}