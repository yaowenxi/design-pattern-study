package cn.worthy.designpatternstudy;

import cn.worthy.designpatternstudy.template.PaymentService;
import cn.worthy.designpatternstudy.template.domain.PaymentEnum;
import cn.worthy.designpatternstudy.template.domain.TradeContext;
import cn.worthy.designpatternstudy.template.domain.WxPayRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DesignPatternStudyApplicationTests {

    @Test
    public void contextLoads() {
    }
    @Autowired
    private PaymentService paymentService;



    @Test
    public void test001(){
        WxPayRequest wxPayRequest=WxPayRequest.builder().payAmount(BigDecimal.TEN).payName("abc").payIdNo("12345").build();
        TradeContext<WxPayRequest> tradeContext=new TradeContext<>(wxPayRequest, PaymentEnum.WX_PAY);
        paymentService.payment(tradeContext);
    }
}

