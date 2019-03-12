package com.yuanman.muke.springboot.dubbo.quikstart;

import com.alibaba.dubbo.config.annotation.Service;
import com.yuanman.muke.springboot.dubbo.ServiceAPI;
import org.springframework.stereotype.Component;

@Component
@Service(interfaceClass = ServiceAPI.class)
public class quikstartServiceImpl implements ServiceAPI {
    @Override
    public String sendMessager(String msg) {
        return "hello provider "+msg;
    }
}
