package com.redli.sell.converter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.redli.sell.dataobject.OrderDetail;
import com.redli.sell.dto.OrderDTO;
import com.redli.sell.enums.ResultEnum;
import com.redli.sell.exception.SellException;
import com.redli.sell.form.OrderForm;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @author redLi
 * @package com.redli.sell.converter
 * @time 2018/05/17 21:05
 * @description:
 */
@Slf4j
public class OrderFormToOrderDTOConverter {
    public static OrderDTO convert(OrderForm orderForm) {
        Gson gson = new Gson();
        OrderDTO orderDTO = new OrderDTO();

        orderDTO.setBuyerName(orderForm.getName());
        orderDTO.setBuyerPhone(orderForm.getPhone());
        orderDTO.setBuyerAddress(orderForm.getAddress());
        orderDTO.setBuyerOpenid(orderForm.getOpenid());

        List<OrderDetail> orderDetailList = new ArrayList<>();
        try{
            orderDetailList = gson.fromJson(orderForm.getItems(), new TypeToken<List<OrderDetail>>() {
            }.getType());
        } catch (Exception e){
            log.error("[对象转化]错误，String = {}", orderForm.getItems());
            throw new SellException(ResultEnum.PARAM_ERROR);
        }
        orderDTO.setOrderDetailList(orderDetailList);

        return orderDTO;
    }
}
