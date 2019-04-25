package com.lura.springcloudexample.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;

public interface MqMessageSource {

    String INPUT = "mq_input";

    /**
     * @return output channel
     */
    @Input(MqMessageSource.INPUT)
    MessageChannel input();
}
