package com.ecommerce.javaecommerce.model;

import com.ecommerce.javaecommerce.entity.OrderAggregate.ShippingAddress;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {
    private String basketId;
    private ShippingAddress shippingAddress;
    private Long subTotal;
    private Long deliveryFee;
    private LocalDateTime orderDate;
}