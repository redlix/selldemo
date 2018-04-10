package com.redli.sell.service;

import com.redli.sell.dataobject.ProductInfo;
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

   /* void increaseStock();

    void decreaseStock();

    ProductInfo onSale(String productId);

    ProductInfo offSale(String productId);*/
}
