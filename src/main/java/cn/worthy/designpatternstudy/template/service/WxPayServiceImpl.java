package cn.worthy.designpatternstudy.template.service;

import cn.worthy.designpatternstudy.template.AbstractPaymentService;
import cn.worthy.designpatternstudy.template.domain.TradeContext;
import cn.worthy.designpatternstudy.template.domain.WxPayRequest;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/***************************************************************************
 * @Description - TODO
 *
 * @author yaowx001 2018年12月20日
 * @version 1.0
 **************************************************************************/
@Service
@Slf4j
public class WxPayServiceImpl extends AbstractPaymentService {


    @Override
    protected void prePayment(TradeContext tradeContext) {
        WxPayRequest request = (WxPayRequest) tradeContext.getBaseRequest();
        log.info("调用微信支付的请求实际入参为：{}", JSON.toJSONString(request));
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
