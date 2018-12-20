package cn.worthy.designpatternstudy.proxy.statics;

/***************************************************************************
 * @Description - TODO
 *
 * @author yaowx001 2018年12月20日
 * @version 1.0
 **************************************************************************/
public class FoodServiceProxy implements FoodService{

    private FoodServiceImpl foodServiceImpl;

    public FoodServiceProxy(FoodServiceImpl foodService){
        this.foodServiceImpl=foodService;
    }

    @Override
    public void makeChicken() {
        System.out.println("要开始做炸鸡了");
        foodServiceImpl.makeChicken();
    }

    @Override
    public void makeNoddle() {
        System.out.println("要开始做面条了");
        foodServiceImpl.makeNoddle();
    }

    public static void main(String[] args) {
        FoodServiceImpl foodService=new FoodServiceImpl();
        FoodServiceProxy foodServiceProxy=new FoodServiceProxy(foodService);
        foodServiceProxy.makeChicken();
        foodServiceProxy.makeNoddle();
    }
}
