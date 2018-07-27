package com.redli.sell.form;

import lombok.Data;

/**
 * @author redLi
 * @package com.redli.sell.form
 * @time 2018/05/17 21:08
 * @description:
 */
@Data
public class CategoryForm {
    private Integer categoryId;

    /**
     * 类目名字.
     */
    private String categoryName;

    /**
     * 类目编号.
     */
    private Integer categoryType;
}
