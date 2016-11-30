package com.wadeyuan.tutorial.events.publisher;

import com.wadeyuan.tutorial.events.MyCustomEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * Created by wadey on 11/30/2016.
 */
public class MyCustomEventPublisher implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void publish() {
        MyCustomEvent customEvent = new MyCustomEvent(this);
        applicationEventPublisher.publishEvent(customEvent);
    }
}
