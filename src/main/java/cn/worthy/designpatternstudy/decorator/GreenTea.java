package cn.worthy.designpatternstudy.decorator;

/**
 * @author: Yaowenxi
 * @Date: 2018/12/24
 */
public class GreenTea extends BaseBeverage {
    @Override
    public String getDescription() {
        return "绿茶";
    }

    @Override
    public double cost() {
        return 15;
    }
}
