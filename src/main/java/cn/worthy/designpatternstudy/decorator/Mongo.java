package cn.worthy.designpatternstudy.decorator;

/**
 * @author: Yaowenxi
 * @Date: 2018/12/24
 */
public class Mongo extends Condiment{


    private BaseBeverage baseBeverage;

    /**
     * 很多设计模式都是这种套路，A类里初始化B类，代理，适配器，我都已经看到了这种玩法
     * @param baseBeverage
     */
    public Mongo(BaseBeverage baseBeverage){
        this.baseBeverage=baseBeverage;
    }

    @Override
    public String getDescription() {
        return this.baseBeverage.getDescription()+"加芒果";
    }

    @Override
    public double cost() {
        return this.baseBeverage.cost()+3;
    }

    public static void main(String[] args) {
        // 首先，我们需要一个基础饮料，红茶、绿茶或咖啡
        BaseBeverage beverage = new GreenTea();
        // 开始装饰
        // 先加一份柠檬
        beverage = new Lemon(beverage);
        // 再加一份芒果
        beverage = new Mongo(beverage);

        System.out.println(beverage.getDescription() + " 价格：￥" + beverage.cost());
        //"绿茶, 加柠檬, 加芒果 价格：￥23"
    }
}
