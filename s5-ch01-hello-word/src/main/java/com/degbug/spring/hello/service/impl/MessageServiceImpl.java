package com.degbug.spring.hello.service.impl;

import com.degbug.spring.hello.service.MessageService;
import org.springframework.stereotype.Service;

/**
 * @author jianhua.lei
 */
@Service//表示是一个服务
public class MessageServiceImpl implements MessageService {

    public String getMessage() {
        return "Hello World";
    }
}
