package com.wadeyuan.tutorial.events.handler;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

/**
 * Created by wadey on 11/27/2016.
 */
public class MyContextStopEventHandler implements ApplicationListener<ContextStoppedEvent> {
    @Override
    public void onApplicationEvent(ContextStoppedEvent event) {
        /* Event will be triggered when ConfigurableApplicationContext.stop() is invoked, which is inherited from LifeCycle */
        System.out.println("ContextStoppedEvent Received");
    }
}
