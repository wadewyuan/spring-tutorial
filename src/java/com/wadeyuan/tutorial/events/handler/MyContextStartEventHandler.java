package com.wadeyuan.tutorial.events.handler;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

/**
 * Created by wadey on 11/27/2016.
 */
public class MyContextStartEventHandler implements ApplicationListener<ContextStartedEvent> {
    @Override
    public void onApplicationEvent(ContextStartedEvent event) {
        /* Event will be triggered when ConfigurableApplicationContext.start() is invoked, which is inherited from LifeCycle */
        System.out.println("ContextStartedEvent Received");
    }
}
