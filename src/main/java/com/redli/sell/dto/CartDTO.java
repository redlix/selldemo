package com.redli.sell.dto;

import lombok.Data;

/**
 * @author redLi
 * @package com.redli.sell.dto
 * @time 2018/04/11 23:13
 * @description:
 */
@Data
public class CartDTO {
    /**
     * 商品Id.
     */
    private String productId;

    /**
     * 数量.
     */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
