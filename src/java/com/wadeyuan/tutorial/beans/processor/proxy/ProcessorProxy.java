package com.wadeyuan.tutorial.beans.processor.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by wadey on 12/27/2016.
 */
public class ProcessorProxy implements InvocationHandler {

    private Object target;

    public Object bind(Object target) {
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Before executing - proxy");
        Object result = method.invoke(target, args);
        System.out.println("After executing - proxy");
        return result;
    }
}
