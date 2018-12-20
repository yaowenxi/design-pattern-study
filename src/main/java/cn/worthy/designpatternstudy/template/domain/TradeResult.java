package cn.worthy.designpatternstudy.template.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/***************************************************************************
 * @Description - TODO
 *
 * @author yaowx001 2018年12月20日
 * @version 1.0
 **************************************************************************/
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TradeResult<T> {

    /**
     * 响应码
     */
    private String code;

    /**
     * 响应描述
     */
    private String message;

    /**
     * 响应数据
     */
    private String data;
}
