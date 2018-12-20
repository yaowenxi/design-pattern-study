package cn.worthy.designpatternstudy.template;

import cn.worthy.designpatternstudy.template.domain.PaymentEnum;
import cn.worthy.designpatternstudy.template.domain.TradeContext;
import cn.worthy.designpatternstudy.template.domain.TradeResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

/***************************************************************************
 * @Description - TODO
 *
 * @author yaowx001 2018年12月20日
 * @version 1.0
 **************************************************************************/
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private ApplicationContext applicationContext;

    /**
     * 交易系统调用交易
     * @param tradeContext
     * @return
     */
    @Override
    public TradeResult payment(TradeContext tradeContext) {
        PaymentEnum paymentEnum=tradeContext.getPaymentEnum();
        AbstractPaymentService paymentService = (AbstractPaymentService) applicationContext.getBean(paymentEnum.getServiceName());
        return paymentService.doProcess(tradeContext);
    }
}
