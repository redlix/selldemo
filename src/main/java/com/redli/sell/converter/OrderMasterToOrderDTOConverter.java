package com.redli.sell.converter;

import com.redli.sell.dataobject.OrderMaster;
import com.redli.sell.dto.OrderDTO;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author redLi
 * @package com.redli.sell.converter
 * @time 2018/05/17 21:19
 * @description:
 */
public class OrderMasterToOrderDTOConverter {
    public static OrderDTO convert(OrderMaster orderMaster) {

        OrderDTO orderDTO = new OrderDTO();
        BeanUtils.copyProperties(orderMaster, orderDTO);
        return orderDTO;
    }

    public static List<OrderDTO> convert(List<OrderMaster> orderMasterList) {
        return orderMasterList.stream().map(e ->
                convert(e)
        ).collect(Collectors.toList());
    }
}
