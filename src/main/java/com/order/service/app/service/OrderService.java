package com.order.service.app.service;

import com.order.service.app.domain.entity.Order;
import com.order.service.app.model.request.OrderRequest;
import com.order.service.app.model.response.OrderResponse;
import com.pantry.commons.service.BaseService;

public interface OrderService extends BaseService<OrderResponse, OrderRequest, Order> {
}
