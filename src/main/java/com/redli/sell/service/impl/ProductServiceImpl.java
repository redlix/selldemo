package com.redli.sell.service.impl;

import com.redli.sell.dataobject.ProductInfo;
import com.redli.sell.repository.ProductInfoRepository;
import com.redli.sell.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author redLi
 * @package com.redli.sell.service
 * @time 2018/04/07 10:20
 * @description:
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductInfoRepository repository;

    @Override
    public ProductInfo findOne(String productId) {
        return repository.findOne(productId);
    }

    @Override
    public List<ProductInfo> findUpAll() {
        return repository.findByProductStatus(0);
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return repository.save(productInfo);
    }

    @Override
    public void increaseStock() {

    }

    @Override
    public void decreaseStock() {

    }

    @Override
    public ProductInfo onSale(String productId) {
        return null;
    }

    @Override
    public ProductInfo offSale(String productId) {
        return null;
    }
}
