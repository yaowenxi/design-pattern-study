package cn.worthy.designpatternstudy.strategy;

/**
 * @author: Yaowenxi
 * @Date: 2018/12/25
 */
public class BluePen implements Strategy {

    @Override
    public void draw(int radius, int x, int y) {
        System.out.println("用蓝色笔画图，radius:" + radius);
    }
}
