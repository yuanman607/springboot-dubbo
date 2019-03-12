package com.yuanman.muke.springboot.dubbo;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

@Component
public class QuikstartConsumer {
    @Reference(interfaceClass = ServiceAPI.class)
    ServiceAPI serviceAPI;

    public void sendMessage(String msg){
        System.out.println(serviceAPI.sendMessager(msg));
    }
}
