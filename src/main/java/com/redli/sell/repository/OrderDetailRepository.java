package com.redli.sell.repository;

import com.redli.sell.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author redLi
 * @package com.redli.sell.repository
 * @time 2018/04/11 0:13
 * @description:
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {
    List<OrderDetail> findByOrderId(String orderId);
}
