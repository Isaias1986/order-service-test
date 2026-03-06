package com.order.service.app.service.impl;

import com.order.service.app.domain.entity.Order;
import com.order.service.app.enums.EnumBadRequest;
import com.order.service.app.facade.OrderFacade;
import com.order.service.app.mapper.OrderMapper;
import com.order.service.app.model.request.OrderRequest;
import com.order.service.app.model.response.OrderResponse;
import com.order.service.app.service.OrderServiceCRUD;
import com.pantry.commons.exception.BaseCustomException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderServiceCRUD {

    private final OrderFacade facade;
    private final OrderMapper customerMapper;

    @Override
    public OrderResponse save(OrderRequest request) {

        return customerMapper
                .toResponse(facade
                        .save(customerMapper
                                .toEntity(request)));

    }

    @Override
    public OrderResponse update(Long id, OrderRequest request) {
       Order up = facade.findById(id)
                .orElseThrow( () -> new BaseCustomException(null, EnumBadRequest.RECORD_NOT_FOUND));
       up.setCustomerId(request.getCustomerId());
       up.setPrice(request.getPrice());
       up.setItems(request.getItems());
       up.setDateAt(request.getDateAt());
       return customerMapper
                .toResponse(facade.update(up));
    }


    @Override
    public OrderResponse findById(Long id) {
        return customerMapper.toResponse(facade.findById(id)
                .orElseThrow( () -> new BaseCustomException(null, EnumBadRequest.RECORD_NOT_FOUND)));
    }


    public void deleteById(Long id) {
        this.findById(id);
        facade.delete(id);
    }
}
