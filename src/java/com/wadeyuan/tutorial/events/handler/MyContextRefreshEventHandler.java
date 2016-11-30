package com.wadeyuan.tutorial.events.handler;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * Created by wadey on 11/27/2016.
 */
public class MyContextRefreshEventHandler implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        /* This can be observed in console while starting web app container, refresh() method is called during the initialization of Root WebApplicationContext  */
        System.out.println("ContextRefreshedEvent Received");
    }
}
