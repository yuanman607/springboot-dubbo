package com.yuanman.muke.springboot.dubbo;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@EnableDubboConfiguration
@SpringBootApplication
public class ConsumerApplication {

    public static void main(String[] args) {
       ConfigurableApplicationContext run=
               SpringApplication.run(ConsumerApplication.class, args);
        QuikstartConsumer consumer=(QuikstartConsumer) run.getBean("quikstartConsumer");
        consumer.sendMessage("欢迎来到谁能成为百万富翁");
    }

}
