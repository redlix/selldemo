package com.redli.sell.enums;

import lombok.Getter;

/**
 * @author redLi
 * @package com.redli.sell.enums
 * @time 2018/04/07 15:03
 * @description:
 */
@Getter
public enum ProductStatusEnum implements CodeEnum {
    UP(0, "在架"),
    DOWN(1, "下架")
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
