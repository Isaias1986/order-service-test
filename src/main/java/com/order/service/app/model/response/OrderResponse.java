package com.order.service.app.model.response;


import com.pantry.commons.model.BaseResponseDTO;
import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Builder
public class OrderResponse extends BaseResponseDTO {

    private Long id;
    private Integer items;
    private BigDecimal price;
    private LocalDateTime dateAt;
    private Long customerId;
}
