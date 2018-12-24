package cn.worthy.designpatternstudy.adapter.classadapter;

import cn.worthy.designpatternstudy.adapter.objectadapter.Cock;

/***************************************************************************
 * @Description - 这是一只胖鸡，相较于普通鸡，更能吃
 *
 * @author yaowx001 2018/12/24
 * @version 1.0
 **************************************************************************/
public class FatCock extends CommonCock implements Cock {
    @Override
    public void eat() {
        System.out.println("胖鸡能吃");
    }
}
