package com.rldnddl87.springioc;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class MyEventHandler{

    @EventListener
    public void onHandle(MyEvent event) {
        System.out.println(Thread.currentThread().toString());
        System.out.println("이벤트 받음. 데이터는 " +  event.getData());
    }


    //스프링에서 기본적으로 제공하는 이벤트
    @EventListener
    public void onHandle(ContextRefreshedEvent event) {
        System.out.println(Thread.currentThread().toString());
        System.out.println("ContextRefreshedEvent");
    }

    @EventListener
    public void onHandle(ContextClosedEvent event) {
        System.out.println(Thread.currentThread().toString());
        System.out.println("ContextClosedEvent");
    }

}
