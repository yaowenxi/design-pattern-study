package cn.worthy.designpatternstudy.template.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/***************************************************************************
 * @Description - TODO
 *
 * @author yaowx001 2018年12月20日
 * @version 1.0
 **************************************************************************/
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class WxPayRequest {

    /**
     * 支付金额
     */
    private BigDecimal payAmount;


    /**
     * 支付者姓名
     */
    private String payName;

    /**
     * 支付者证件号
     */
    private String payIdNo;

}
