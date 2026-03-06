package com.order.service.app.model.request;


import com.pantry.commons.model.BaseRequestDTO;
import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Builder
public class OrderRequest extends BaseRequestDTO {

    private Integer items;
    private BigDecimal price;
    private LocalDateTime dateAt;
    private Long customerId;
}
