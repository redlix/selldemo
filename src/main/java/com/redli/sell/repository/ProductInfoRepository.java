package com.redli.sell.repository;

import com.redli.sell.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author redLi
 * @package com.redli.sell.repository
 * @time 2018/04/07 9:59
 * @description:
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {
    List<ProductInfo> findByProductStatus(Integer productStatus);
}
