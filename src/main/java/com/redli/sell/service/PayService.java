package com.redli.sell.service;

import com.lly835.bestpay.model.PayResponse;
import com.lly835.bestpay.model.RefundResponse;
import com.redli.sell.dto.OrderDTO;

/**
 * @author redLi
 * @package com.redli.sell.service
 * @time 2018/05/17 21:21
 * @description:
 */
public interface PayService {
    /**
     * 创建支付
     * @param orderDTO
     * @return
     */
    PayResponse create(OrderDTO orderDTO);

    /**
     * 微信异步通知
     * @param notifyData
     * @return
     */
    PayResponse notify(String notifyData);

    RefundResponse refund(OrderDTO orderDTO);
}
