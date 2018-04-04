package com.redli.sell.repository;

import com.redli.sell.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author redLi
 * @package com.redli.sell.repository
 * @time 2018/03/31 22:43
 * @description:
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
