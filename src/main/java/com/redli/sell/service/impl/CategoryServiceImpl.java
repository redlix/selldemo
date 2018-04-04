package com.redli.sell.service.impl;

import com.redli.sell.dataobject.ProductCategory;
import com.redli.sell.repository.ProductCategoryRepository;
import com.redli.sell.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author redLi
 * @package com.redli.sell.service.impl
 * @time 2018/04/04 15:06
 * @description:
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private ProductCategoryRepository repository;

    @Override
    public ProductCategory findOne(Integer categoryId) {
        return repository.findOne(categoryId);
    }

    @Override
    public List<ProductCategory> findAll() {
        return repository.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryList) {
        return repository.findByCategoryTypeIn(categoryList);
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return repository.save(productCategory);
    }
}
