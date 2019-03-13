package com.alan.sell.enums;

import lombok.Getter;

@Getter
public enum ResultEnum {

    SYSTEM_ERROR(-1, "系统异常"),
    PARAM_ERROR(1,"参数不正确"),
    PRODUCT_NOT_EXIST(10,"商品不存在"),
    PRODUCT_STOCK_NOT_ENOUGH(20,"商品库存不足"),
    ORDER_NOT_EXIST(30,"订单不存在"),
    ORDER_DETAIL_NOT_EXIST(40,"订单详情不存在"),
    ORDER_STATUS_WRONG(50,"订单状态错误"),
    ORDER_FINNISH_FAIL(60,"完成订单失败"),
    PAY_STATUS_WRONG(70,"支付状态错误"),
    WX_MP_ERROR(80,"微信公众号错误"),
    WXPAY_NOTIFY_MONEY_VERIFY_ERROR(90,"微信支付异步通知金额不通过"),

    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
