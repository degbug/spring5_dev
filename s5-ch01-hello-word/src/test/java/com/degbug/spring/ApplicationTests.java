package com.degbug.spring;

import com.degbug.spring.hello.Application;
import com.degbug.spring.hello.MessagePrinter;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author jianhua.lei
 */
public class ApplicationTests {

    @Test
    public void main(){
        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        MessagePrinter messagePrinter = context.getBean(MessagePrinter.class);
        messagePrinter.printMessage();
    }
}
