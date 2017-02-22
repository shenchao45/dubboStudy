package com.shenchao;

import com.shenchao.dubbo.pojo.User;
import com.shenchao.dubbo.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


/**
 * Created by shenchao on 2017/2/22.
 */
public class UserServiceTest {

    private UserService userService;

    @Before
    public void setUp() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "classpath:dubbo-consumer.xml");
        this.userService = applicationContext.getBean(UserService.class);
    }

    @Test
    public void testQueryAll() throws InterruptedException {
         for(int i =0;i<600;i++) {
             List<User> users = this.userService.queryAll();
             for (User user : users) {
                 System.out.println(user);
             }
             Thread.sleep(100);
         }
    }

}

