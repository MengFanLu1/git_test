package com.itheima.test;

import com.itheima.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Saturday {

    @Test
    public void testr(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        UserService service = ioc.getBean("userservice", UserService.class);

        service.smethod();

    }
}
