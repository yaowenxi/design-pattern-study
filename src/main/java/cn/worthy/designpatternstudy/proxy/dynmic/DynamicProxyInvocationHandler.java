package cn.worthy.designpatternstudy.proxy.dynmic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/***************************************************************************
 * @Description - TODO
 *
 * @author yaowx001 2018年12月20日
 * @version 1.0
 **************************************************************************/
public class DynamicProxyInvocationHandler implements InvocationHandler {

    /**
     * 需要代理的真是对象
     */
    private Object object;

    /**
     * InvocationHandler构造方法
     * @param object
     */
    public DynamicProxyInvocationHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我要开始代理了");
        method.invoke(object,args);
        System.out.println("我结束了代理");

        return null;
    }
}
