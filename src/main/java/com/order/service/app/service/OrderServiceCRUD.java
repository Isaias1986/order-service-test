package com.order.service.app.service;

import com.order.service.app.model.request.OrderRequest;
import com.order.service.app.model.response.OrderResponse;
import org.springframework.data.domain.Page;

public interface OrderServiceCRUD extends OrderService {

    default Page<OrderResponse> list(OrderRequest u){
        throw new RuntimeException("Method Not Implement");
    }

}
