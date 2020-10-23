package com.tongluren.tlrweb.service;

import com.tongluren.tlrweb.controller.param.OrderReq;
import com.tongluren.tlrweb.domain.model.Order;

import java.util.List;

/**
 * @Description detail
 * Created by Hwhhhh on 2020/10/23 14:49
 */
public interface OrderService {
    /**
     * 用户下单时，需要创建订单。
     * @param orderParam 前端传送的关于order的相关数据
     * @return 1 表示创建成功； 0 表示创建失败
     */
    int createOrder(OrderReq orderParam);

    /**
     * 通过用户id找到用户相关订单，如，用户想查看自己的订单时需要查询。
     * @param userId
     * @return
     */
    List<Order> getOrdersById(int userId);

    /**
     * 根据订单id删除订单，只需将order的isEffective字段修改即可，无需真的删除。
     * @param id
     * @return
     */
    int deleteOrderById(int id);

    /**
     * 修改订单状态，如：用户申请取消订单
     * @param status 订单的状态
     * @return
     */
    int updateOrderStatus(int status);
}
