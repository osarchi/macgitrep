package com.springboot.app.activemq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @author WJ
 * @create 2020-05-26 9:12 下午
 */
@Component
public class Consumer {


    @JmsListener(destination="text-queue")
    public void receive(String text) {
        System.out.println(text);
    }
}
