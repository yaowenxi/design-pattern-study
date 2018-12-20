package cn.worthy.designpatternstudy.template;

import cn.worthy.designpatternstudy.template.domain.TradeContext;
import cn.worthy.designpatternstudy.template.domain.TradeResult;

/***************************************************************************
 * @Description - 支付接口
 *
 * @author yaowx001 2018年12月20日
 * @version 1.0
 **************************************************************************/
public interface PaymentService {


    /**
     * 支付入口
     * @param tradeContext
     * @return
     */
    TradeResult payment(TradeContext tradeContext);
}
