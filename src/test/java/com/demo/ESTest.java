package com.demo;

import com.demo.entity.ServiceChain;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.jupiter.api.Test;
import org.noear.esearchx.EsContext;
import org.noear.esearchx.EsGlobal;
import org.noear.esearchx.model.EsData;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ESTest {
    @Test
    void a() throws IOException {
        EsGlobal.onCommandBefore(esCommandHolder -> System.out.println(esCommandHolder.getDsl()));
        EsContext context = new EsContext("172.32.150.246:9200");
        System.out.println("version:" + context.getVersion());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        Calendar calendar= Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR,-30);
        String time = sdf.format(calendar.getTime());
        System.out.println(time);
//        EsData<ServiceChain> data=context.indice("service_chain-*").limit(100).selectList(ServiceChain.class);
        EsData<ServiceChain> data = context.indice("service_chain-*").limit(100).where(c -> c.range("@timestamp", r -> r.gte(time))).selectList(ServiceChain.class);
        Gson gson = new GsonBuilder().setLenient().excludeFieldsWithoutExposeAnnotation().create();
        for (ServiceChain serviceChain : data.getList()) {
//            System.out.println("serviceChain:" + serviceChain);
            serviceChain.buildMessage(gson);
        }
        System.out.println(data);

    }

}
