package cn.worthy.designpatternstudy.strategy;

/**
 * @author: Yaowenxi
 * @Date: 2018/12/25
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }


    public void executeDraw(int radius, int x, int y) {
        strategy.draw(radius, x, y);
    }

    public static void main(String[] args) {
        // 使用绿色笔来画
        Context context = new Context(new BluePen());
        context.executeDraw(10, 0, 0);
    }

}
