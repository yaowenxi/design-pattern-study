package cn.worthy.designpatternstudy.strategy;

/**
 * @author: Yaowenxi
 * @Date: 2018/12/25
 */
public class GreenPen implements Strategy {


    @Override
    public void draw(int radius, int x, int y) {
        System.out.println("用绿色笔画图");
    }
}
