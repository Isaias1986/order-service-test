package com.order.service.app.facade;

import com.order.service.app.domain.entity.Order;
import com.order.service.app.domain.repository.OrderRepository;
import com.pantry.commons.facade.BaseFacade;
import org.springframework.stereotype.Component;

@Component
public class OrderFacade extends BaseFacade<Order> {

    private final OrderRepository repository;

    protected OrderFacade(OrderRepository repository) {
        super(repository);
        this.repository = repository;
    }
}
