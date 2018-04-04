package com.redli.sell.service;

import com.redli.sell.dataobject.ProductCategory;

import java.util.List;

/**
 * @author redLi
 * @package com.redli.sell.service
 * @time 2018/04/04 15:02
 * @description:
 */
public interface CategoryService {

    /**
     * 根据类目id查找
     *
     * @param categoryId
     * @return
     */
    ProductCategory findOne(Integer categoryId);

    /**
     * 查找全部类目
     *
     * @return
     */
    List<ProductCategory> findAll();

    /**
     * 查找类目集合
     *
     * @param categoryList
     * @return
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryList);

    /**
     * 保存类目
     *
     * @param productCategory
     * @return
     */
    ProductCategory save(ProductCategory productCategory);
}
