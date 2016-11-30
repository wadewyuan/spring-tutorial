package com.wadeyuan.tutorial.events;

import org.springframework.context.ApplicationEvent;

/**
 * Created by wadey on 11/30/2016.
 */
public class MyCustomEvent extends ApplicationEvent {
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public MyCustomEvent(Object source) {
        super(source);
    }

    @Override
    public String toString() {
        return "Custom event";
    }
}
