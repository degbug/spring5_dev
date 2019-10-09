package com.degbug.spring.hello;

import org.springframework.context.annotation.ComponentScan;

/**
 * @author jianhua.lei
 */
@ComponentScan//@ComponentScan指明自动扫描指定包下的@Component注解，并注册为bean，包括其子注解（@Service，@Controller，@Repository等）
public class Application {
}
