package com.degbug.spring.hello;

import com.degbug.spring.hello.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author jianhua.lei
 */
@Component //表示是一个组件
public class MessagePrinter {

    private MessageService messageService;

    @Autowired//setter注入
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }


    /**
     * 打印消息
     */
    public void printMessage() {
        System.out.println(this.messageService.getMessage());
    }
}