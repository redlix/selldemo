package com.redli.sell.vo;

import lombok.Data;

/**
 * @author redLi
 * @package com.redli.sell.vo
 * @time 2018/04/07 23:27
 * @description:
 */
@Data
public class ResultVO<T> {
    /**
     * 错误码
     */
    private Integer code;

    /** 错误信息. */
    private String msg;

    /** 具体信息 */
    private T data;
}
