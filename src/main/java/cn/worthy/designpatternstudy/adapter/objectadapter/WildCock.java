package cn.worthy.designpatternstudy.adapter.objectadapter;

import lombok.extern.slf4j.Slf4j;

/***************************************************************************
 * @Description - 野鸡
 *
 * @author yaowx001 2018/12/24
 * @version 1.0
 **************************************************************************/
@Slf4j
public class WildCock implements Cock{
    @Override
    public void gobble() {
      log.info("咕咕叫");
    }

    @Override
    public void fly() {
        log.info("野鸡起飞了");
    }

    @Override
    public void eat() {

    }
}
