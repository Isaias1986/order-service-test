package com.order.service.app.mapper;

import com.order.service.app.domain.entity.Order;
import com.order.service.app.model.request.OrderRequest;
import com.order.service.app.model.response.OrderResponse;
import com.pantry.commons.mapper.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderMapper extends BaseMapper<OrderResponse, OrderRequest, Order> {
}
