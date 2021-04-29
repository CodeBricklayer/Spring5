package com.tanp.spring.demo5.dao;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author CodeBricklayer
 * @ClassName MagicCglib
 * @Description cglib实现代理，Cglib动态代理的基础是建立一个目标类的子类，然后调用父类的方法，所以不能代理final修饰的类
 * @date 2021/4/27 23:28
 */
public class MagicCglib implements MethodInterceptor {

    /**
     * 创建代理对象
     * @param obj
     * @return
     */
    public Object createMagicCglib(Object obj){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(obj.getClass());
        enhancer.setCallback(this);
        Object o = enhancer.create();
        return o;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println(o.getClass());
        System.out.println("方法调用之前....." + method.getName() + ":参数为" + Arrays.toString(objects));
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("方法调用结束......");
        System.out.println(o.getClass());
        return result;
    }

    public static void main(String[] args) {
        MagicCglib magicCglib = new MagicCglib();
        MagicImpl magic = (MagicImpl) magicCglib.createMagicCglib(new MagicImpl());
        magic.attack();
    }
}
