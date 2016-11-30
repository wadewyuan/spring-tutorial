package com.wadeyuan.tutorial.events.handler;

import com.wadeyuan.tutorial.events.MyCustomEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by wadey on 11/30/2016.
 */
public class MyCustomEventHandler implements ApplicationListener<MyCustomEvent> {
    @Override
    public void onApplicationEvent(MyCustomEvent event) {
        System.out.println(event.toString());
    }
}
