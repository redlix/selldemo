package com.redli.sell.service;

import com.redli.sell.dataobject.ProductInfo;
import com.redli.sell.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author redLi
 * @package com.redli.sell.service
 * @time 2018/04/07 10:14
 * @description:
 */
public interface ProductService {
    ProductInfo findOne(String productId);

    /**
     * 查询在架商品列表
     *
     * @return
     */
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    /**
     * 加库存
     *
     * @param cartDTOList
     */
    void increaseStock(List<CartDTO> cartDTOList);

    /**
     * 减库存
     *
     * @param cartDTOList
     */
    void decreaseStock(List<CartDTO> cartDTOList);

    /**
     * 上架.
     *
     * @param productId
     * @return
     */
    ProductInfo onSale(String productId);

    /**
     * 下架.
     *
     * @param productId
     * @return
     */
    ProductInfo offSale(String productId);
}
