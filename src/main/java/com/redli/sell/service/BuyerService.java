package com.redli.sell.service;

import com.redli.sell.dto.OrderDTO;

/**
 * @author redLi
 * @package com.redli.sell.service
 * @time 2018/05/17 23:08
 * @description:
 */
public interface BuyerService {
    /**
     * 查询一个订单
     *
     * @param openid
     * @param orderId
     * @return
     */
    OrderDTO findOrderOne(String openid, String orderId);

    /**
     * 取消订单
     *
     * @param openid
     * @param orderId
     * @return
     */
    OrderDTO cancelOrder(String openid, String orderId);
}
