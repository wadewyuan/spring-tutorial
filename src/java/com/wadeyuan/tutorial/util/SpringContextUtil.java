package com.wadeyuan.tutorial.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by wadey on 11/26/2016.
 */
public class SpringContextUtil implements ApplicationContextAware{

    private static ApplicationContext applicationContext = null;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Setting application context:" + SpringContextUtil.class.getName());
        this.applicationContext = applicationContext;
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public static java.lang.Object getBean(String name) {
        return applicationContext.getBean(name);
    }
}
