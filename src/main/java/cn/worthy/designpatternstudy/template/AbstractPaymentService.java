package cn.worthy.designpatternstudy.template;

import cn.worthy.designpatternstudy.template.domain.TradeContext;
import cn.worthy.designpatternstudy.template.domain.TradeResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/***************************************************************************
 * @Description - TODO
 *
 * @author yaowx001 2018年12月20日
 * @version 1.0
 **************************************************************************/
@Slf4j
@Service
public abstract class AbstractPaymentService {


    /**
     * 主流程
     *
     * @param tradeContext
     * @return
     */
    protected final TradeResult doProcess(TradeContext tradeContext) {
        log.info("{}服务支付行动开始", tradeContext.getPaymentEnum().getName());
        prePayment(tradeContext);

        log.info("{}服务支付进行时", tradeContext.getPaymentEnum().getName());
        doPayment(tradeContext);

        log.info("{}服务支付结束", tradeContext.getPaymentEnum().getName());
        afterPayment(tradeContext);

        return tradeContext.getTradeResult();
    }

    /**
     * 支付前
     *
     * @param tradeContext
     */
    protected abstract void prePayment(TradeContext tradeContext);

    /**
     * 支付中
     *
     * @param tradeContext
     */
    protected abstract void doPayment(TradeContext tradeContext);

    /**
     * 支付后
     *
     * @param tradeContext
     */
    protected abstract void afterPayment(TradeContext tradeContext);
}
