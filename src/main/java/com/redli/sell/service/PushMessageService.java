package com.redli.sell.service;

import com.redli.sell.dto.OrderDTO;

/**
 * @author redLi
 * @package com.redli.sell.service
 * @time 2018/05/17 21:26
 * @description:
 */
public interface PushMessageService {
    /**
     * 订单状态变更消息
     *
     * @param orderDTO
     */
    void orderStatus(OrderDTO orderDTO);
}
