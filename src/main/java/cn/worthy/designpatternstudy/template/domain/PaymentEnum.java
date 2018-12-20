package cn.worthy.designpatternstudy.template.domain;

import cn.worthy.designpatternstudy.template.service.WxPayServiceImpl;
import lombok.AllArgsConstructor;
import lombok.Getter;

/***************************************************************************
 * @Description - 支付类型
 *
 * @author yaowx001 2018年12月20日
 * @version 1.0
 **************************************************************************/
@Getter
@AllArgsConstructor
public enum PaymentEnum {


    /**
     * 微信支付
     */
    WX_PAY("WX_PAY", "微信支付", WxPayServiceImpl.class),


    /**
     * 支付宝
     */
    ALI_PAY("ALI_PAY", "支付宝", WxPayServiceImpl.class);

    private String code;

    private String name;

    private Class serviceName;
}
