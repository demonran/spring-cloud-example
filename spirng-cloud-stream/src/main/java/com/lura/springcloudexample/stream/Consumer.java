package com.lura.springcloudexample.stream;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;

@EnableBinding({Sink.class, MqMessageSource.class})
public class Consumer {

    @StreamListener(Sink.INPUT)
    public  void receive(Message<String> message){
        System.out.println(message.getPayload());
    }

    @StreamListener(MqMessageSource.INPUT)
    public  void receive2(Message<String> message){
        System.out.println(message.getPayload() + 2);
    }
}
