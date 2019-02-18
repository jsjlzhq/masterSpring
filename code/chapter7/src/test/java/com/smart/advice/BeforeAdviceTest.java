package com.smart.advice;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

/**
 * Created by zhiqin.li on 2019/1/30.
 */
public class BeforeAdviceTest {

    @Test
    public void test1() {
        Waiter target = new NaiveWaiter();
        BeforeAdvice advice = new GreetingBeforeAdvice();

        ProxyFactory pf = new ProxyFactory();

        pf.setTarget(target);

        pf.addAdvice(advice);

        Waiter proxy = (Waiter)pf.getProxy();
        proxy.greetTo("John");
        proxy.serveTo("Tom");
    }


    @Test
    public void test2() {
        String configPath = "com/smart/advice/beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
        Waiter waiter = (Waiter)ctx.getBean("waiter");
        waiter.greetTo("John");
    }

    @Test
    public void test3(){
        String configPath = "com/smart/advice/beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
        ForumService forumService = (ForumService)ctx.getBean("forumService");
        try {
            forumService.removeForum(5);
        } catch(Exception e){
            System.out.println("removeForum Exception");
        }

        try {
            Forum forum = new Forum();
            forumService.updateForum(forum);
        } catch(Exception e) {
            System.out.println("updateForum Exception");
        }
    }
}
