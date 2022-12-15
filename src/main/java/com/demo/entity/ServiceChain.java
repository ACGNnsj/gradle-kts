package com.demo.entity;

import com.google.gson.Gson;
import org.noear.snack.annotation.ONodeAttr;

import java.util.List;

public class ServiceChain {
    private List<String> tags;
    private String message;
    private Message messageEntity;
    @ONodeAttr(name = "@version")
    private String version;
    @ONodeAttr(name = "@timestamp")
    private String timestamp;

    /*    public ServiceChain(String tags, String message, Message messageEntity, String version, String timestamp) {
            this.tags = tags;
            this.message = message;
            this.messageEntity = messageEntity;
            this.version = version;
            this.timestamp = timestamp;
        }*/
//    private final static Gson GSON=new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
    public void buildMessage(Gson gson) {
        if (message == null || "".equals(message)) {
            this.messageEntity = new Message();
        } else {
            String message = this.message;
            message = message.substring(0, message.indexOf("attributes"));
            message = message.substring(0, message.lastIndexOf(","));
            this.messageEntity = gson.fromJson(message + '}', Message.class);
        }
    }

    @Override
    public String toString() {
        return "ServiceChain{" +
                "tags=" + tags +
                ", messageEntity=" + messageEntity +
                ", version='" + version + '\'' +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }
/*private static final class Factory implements Provider<ServiceChain> {
        private String tags;
        private String message;
        private Message messageEntity;
        @JsonAlias("@version")
        private String version;
        @JsonAlias("@timestamp")
        private String timestamp;

        public Factory(String tags, String message, Message messageEntity, String version, String timestamp) {
            this.tags = tags;
            this.message = message;
            this.messageEntity = messageEntity;
            this.version = version;
            this.timestamp = timestamp;
        }

        @Override
        public ServiceChain get() {
            // TODO Auto-generated method stub
            return new ServiceChain(tags, message, messageEntity, version, timestamp);
        }
    }*/
}
