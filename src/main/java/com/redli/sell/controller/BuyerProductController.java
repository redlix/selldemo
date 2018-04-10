package com.redli.sell.controller;

import com.redli.sell.dataobject.ProductCategory;
import com.redli.sell.dataobject.ProductInfo;
import com.redli.sell.service.CategoryService;
import com.redli.sell.service.ProductService;
import com.redli.sell.utils.ResultVOUtil;
import com.redli.sell.vo.ProductInfoVO;
import com.redli.sell.vo.ProductVO;
import com.redli.sell.vo.ResultVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 买家商品
 *
 * @author redLi
 * @package com.redli.sell.controller
 * @time 2018/04/07 22:50
 * @description:
 */
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {
    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/list")
    public ResultVO list() {
        //查询所有上架商品
        List<ProductInfo> productInfoList = productService.findUpAll();
        //查询类目
        //1.传统方法
/*        List<Integer> categoryTypeList = new ArrayList<>();
        for (ProductInfo productInfo : productInfoList) {
            categoryTypeList.add(productInfo.getCategoryType());
        }*/
        //2.精简方法(java8, lambda)
        List<Integer> categoryList = productInfoList.stream().map(e -> e.getCategoryType()).collect(Collectors.toList());
        List<ProductCategory> productCategoryList = categoryService.findByCategoryTypeIn(categoryList);

        //3.数据拼装
        List<ProductVO> productVOList = new ArrayList<>();

        for (ProductCategory productCategory : productCategoryList) {
            ProductVO productVO = new ProductVO();
            productVO.setCategoryName(productCategory.getCategoryName());
            productVO.setCategoryType(productCategory.getCategoryType());

            List<ProductInfoVO> productInfoVOList = new ArrayList<>();
            for (ProductInfo productInfo : productInfoList) {
                if (productInfo.getCategoryType().equals(productCategory.getCategoryType())) {
                    ProductInfoVO productInfoVO = new ProductInfoVO();
                    BeanUtils.copyProperties(productInfo, productInfoVO);
                    productInfoVOList.add(productInfoVO);
                }
            }
            productVO.setProductInfoVOSList(productInfoVOList);
            productVOList.add(productVO);
        }
        return ResultVOUtil.success(productVOList);
    }
}
