package com.degbug.spring;

import com.degbug.spring.hello.Application;
import com.degbug.spring.hello.MessagePrinter;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author jianhua.lei
 */
public class ApplicationTest {

    @Test
    public void main(){
        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        //获取bean
        MessagePrinter messagePrinter = context.getBean(MessagePrinter.class);
        //输出Hello World
        messagePrinter.printMessage();
    }
}
