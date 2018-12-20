package cn.worthy.designpatternstudy.proxy.dynmic;

import cn.worthy.designpatternstudy.proxy.statics.FoodService;
import cn.worthy.designpatternstudy.proxy.statics.FoodServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/***************************************************************************
 * @Description - TODO
 *
 * @author yaowx001 2018年12月20日
 * @version 1.0
 **************************************************************************/
public class DynamicProxyMain {

    /**
     * 利用InvocationHandler接口和Proxy类来进行动态代理，其中，需要实现InvocationHandler接口实现需要代理中的逻辑，
     * 用Java的proxy类newInstance来Java运行时生成一个代理类
     * @param args
     */
    public static void main(String[] args) {
        FoodServiceImpl foodServiceImpl = new FoodServiceImpl();
        InvocationHandler invocationHandler = new DynamicProxyInvocationHandler(foodServiceImpl);
        FoodService foodService = (FoodService) Proxy.newProxyInstance(invocationHandler.getClass().getClassLoader(), foodServiceImpl.getClass().getInterfaces(), invocationHandler);
        foodService.makeChicken();
        foodService.makeNoddle();
    }
}
