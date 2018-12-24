package cn.worthy.designpatternstudy.decorator;

/**
 * 咖啡
 * @author: Yaowenxi
 * @Date: 2018/12/24
 */
public class Coffee extends BaseBeverage {
    @Override
    public String getDescription() {
        return "咖啡";
    }

    @Override
    public double cost() {
        return 20;
    }
}
