package com.spring5.sourcecode;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @Author: Jason
 * @Date: 2022/11/12 23:10 23 10
 */
public class JDKProxy {
    public static void main(String[] args) {
        // create proxy instance of the interface
        Class [] interfaces = {UserDao.class};

//        // invocationHandler: Use Anonymous Inner Class
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
    }
}


// build proxy class
class UserDaoProxy implements InvocationHandler {

    // pass the object that needs a proxy
    // constructor with args
    private Object obj;
    // Object: more general
    public UserDaoProxy(Object obj) {
        this.obj = obj;
    }

    // additional logic is written here
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // before execute reinforced function
        System.out.println("Running before invoking function... " + method.getName() + ": passed parameters... "
                + Arrays.toString(args));

        // run reinforced function
        Object invoke = method.invoke(obj, args);

        // after
        System.out.println("After invoking function... " + obj);
        return invoke;
    }
}


