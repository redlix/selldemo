package com.redli.sell.exception;

import com.redli.sell.enums.ResultEnum;

/**
 * @author redLi
 * @package com.redli.sell.exception
 * @time 2018/04/11 23:00
 * @description:
 */
public class SellException extends RuntimeException {
    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
