package com.wadeyuan.tutorial.beans.processor.impl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by wadey on 12/27/2016.
 */
public class GammaProcessorProxy implements InvocationHandler {

    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Before executing - proxy");
        Object result = method.invoke(target, args);
        System.out.println("After executing - proxy");
        return result;
    }
}
