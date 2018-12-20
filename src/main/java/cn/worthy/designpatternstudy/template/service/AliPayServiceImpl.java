package cn.worthy.designpatternstudy.template.service;

import cn.worthy.designpatternstudy.template.AbstractPaymentService;
import cn.worthy.designpatternstudy.template.domain.TradeContext;
import org.springframework.stereotype.Service;

/***************************************************************************
 * @Description - TODO
 *
 * @author yaowx001 2018年12月20日
 * @version 1.0
 **************************************************************************/
@Service
public class AliPayServiceImpl extends AbstractPaymentService {
    @Override
    protected void prePayment(TradeContext tradeContext) {
        System.out.println("拼接微信支付的实际参数");
    }

    @Override
    protected void doPayment(TradeContext tradeContext) {
        System.out.println("调用微信支付，进行实际支付");
    }

    @Override
    protected void afterPayment(TradeContext tradeContext) {
        System.out.println("接受微信支付的返回参数，进行实际落地处理");
    }
}
