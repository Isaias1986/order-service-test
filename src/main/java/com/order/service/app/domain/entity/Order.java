package com.order.service.app.domain.entity;

import com.pantry.commons.domain.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "order_service")
public class Order extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_generator")
    @SequenceGenerator(name = "order_generator", sequenceName = "order_service_seq", allocationSize = 1, initialValue = 1)
    private Long id;
    @Column(name = "items", nullable = false)
    private Integer items;
    @Column(name = "price", nullable = false)
    private BigDecimal price;
    @Column(name = "date_at", nullable = false)
    private LocalDateTime dateAt;
    @Column(name = "customer_id", nullable = false)
    private Long customerId;

}
