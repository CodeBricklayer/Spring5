package com.tanp.spring.demo5.dao;

import java.lang.reflect.Proxy;

/**
 * @author CodeBricklayer
 * @ClassName JDKProxy
 * @Description JDK动态代理演示
 * @date 2021/4/27 21:56
 */
public class JDKProxy {
    public static void main(String[] args) {
        //创建接口实现类代理对象
        Class[] interfaces = {UserDao.class};
//        Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new InvocationHandler() {
//            @Override
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                return null;
//            }
//        });
        UserDaoImpl userDao = new UserDaoImpl();
        UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));
        int add = dao.add(1, 2);
        System.out.println(add);
        String abc = dao.update("abc");
        System.out.println(abc);
    }
}
