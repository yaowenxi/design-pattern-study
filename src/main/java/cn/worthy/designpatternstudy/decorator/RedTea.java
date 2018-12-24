package cn.worthy.designpatternstudy.decorator;

/**
 * @author: Yaowenxi
 * @Date: 2018/12/24
 */
public class RedTea extends BaseBeverage {
    @Override
    public String getDescription() {
        return "红茶";
    }

    @Override
    public double cost() {
        return 10;
    }
}
