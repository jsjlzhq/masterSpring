package com.smart.proxy;

import org.testng.annotations.Test;

import java.lang.reflect.Proxy;

/**
 * Created by zhiqin.li on 2019/1/28.
 */
public class TestForumService {
    public static void main(String[] args) {
        ForumServiceImpl target = new ForumServiceImpl();

        PerformanceHandler handler = new PerformanceHandler(target);
        ForumService proxy = (ForumService) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), handler);

        proxy.removeForum(10);
        proxy.removeTopic(1012);
    }

    @Test
    public void cglibTest() {
        CglibProxy proxy = new CglibProxy();
        ForumServiceImpl forumService = (ForumServiceImpl)proxy.getProxy(ForumServiceImpl.class);

        forumService.removeForum(10);
        forumService.removeTopic(1023);
    }
}
