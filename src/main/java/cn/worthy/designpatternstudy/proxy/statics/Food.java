package cn.worthy.designpatternstudy.proxy.statics;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/***************************************************************************
 * @Description - 食物接口
 *
 * @author yaowx001 2018年12月20日
 * @version 1.0
 **************************************************************************/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Food {

    /**
     * 食物名称
     */
    private String foodName;
}
