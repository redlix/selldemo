package com.redli.sell.enums;

import lombok.Getter;

/**
 * @author redLi
 * @package com.redli.sell.enums
 * @time 2018/04/11 0:04
 * @description:
 */
@Getter
public enum OrderStatusEnum implements CodeEnum {
    NEW(0, "新订单"),
    FINISHED(1, "完结"),
    CANCEL(2, "已取消"),;

    /**
     * code
     */
    private Integer code;

    /**
     * message
     */
    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
