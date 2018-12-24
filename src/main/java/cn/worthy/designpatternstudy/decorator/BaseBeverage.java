package cn.worthy.designpatternstudy.decorator;

/**
 * @author: Yaowenxi
 * @Date: 2018/12/24
 */
public abstract class BaseBeverage {

    /**
     * 返回描述
     * @return
     */
    public abstract String getDescription();

    /**
     * 返回价格
     * @return
     */
    public abstract double cost();
}
