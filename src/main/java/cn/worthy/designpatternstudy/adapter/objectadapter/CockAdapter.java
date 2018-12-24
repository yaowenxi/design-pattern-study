package cn.worthy.designpatternstudy.adapter.objectadapter;

/***************************************************************************
 * @Description - 鸡的适配器
 *
 * @author yaowx001 2018/12/24
 * @version 1.0
 **************************************************************************/
public class CockAdapter implements Duck{

    Cock cock;

    public CockAdapter(Cock cock){
        this.cock=cock;
    }



    @Override
    public void quack() {
        cock.gobble();
    }

    @Override
    public void fly() {
        cock.fly();
    }


    public static void main(String[] args) {
        //其实是只鸡，适配到鸭的方法
        //当我们需要一只鸭，但是我们只有一只鸡，这个时候就需要定义一个适配器，由这个适配器来充当鸭，但是适配器里面的方法还是由鸡来实现的。
        Cock wildCock=new WildCock();
        Duck wildDuck=new CockAdapter(wildCock);
        wildDuck.quack();
        wildDuck.fly();
    }
}
