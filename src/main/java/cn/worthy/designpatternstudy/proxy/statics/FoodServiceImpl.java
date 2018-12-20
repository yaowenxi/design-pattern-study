package cn.worthy.designpatternstudy.proxy.statics;

import org.springframework.stereotype.Service;

/***************************************************************************
 * @Description - TODO
 *
 * @author yaowx001 2018年12月20日
 * @version 1.0
 **************************************************************************/
@Service
public class FoodServiceImpl implements FoodService{
    @Override
    public void makeChicken() {
        System.out.println("做炸鸡");
    }

    @Override
    public void makeNoddle() {
        System.out.println("做面条");
    }
}
