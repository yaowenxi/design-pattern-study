package cn.worthy.designpatternstudy.decorator;

/**
 * @author: Yaowenxi
 * @Date: 2018/12/24
 */
public class Lemon extends Condiment{

    private BaseBeverage baseBeverage;

    /**
     * 这里很关键，需要传入具体的饮料，如需要传入没有被装饰的红茶或绿茶，当然也可以传入已经装饰好的芒果绿茶，这样可以做芒果柠檬绿茶
     * @param baseBeverage
     */
    public Lemon(BaseBeverage baseBeverage){
        this.baseBeverage=baseBeverage;
    }

    @Override
    public String getDescription() {
        return this.baseBeverage.getDescription()+"加柠檬";
    }

    @Override
    public double cost() {
        return this.baseBeverage.cost()+5;
    }
}
