package cn.worthy.designpatternstudy.template.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/***************************************************************************
 * @Description - 请求上下文
 *
 * @author yaowx001 2018年12月20日
 * @version 1.0
 **************************************************************************/
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TradeContext<T> {

    /**
     * 支付请求入参
     */
    private T baseRequest;


    /**
     * 支付类型
     */
    private PaymentEnum paymentEnum;

    /**
     * 支付最终返回接口结果
     */
    private TradeResult tradeResult=new TradeResult();


    /**
     * 构造函数
     * @param baseRequest
     * @param paymentEnum
     */
    public TradeContext(T baseRequest,PaymentEnum paymentEnum){
        this.baseRequest=baseRequest;
        this.paymentEnum=paymentEnum;
    }
}
