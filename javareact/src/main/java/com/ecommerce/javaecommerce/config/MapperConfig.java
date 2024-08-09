package com.ecommerce.javaecommerce.config;

import com.ecommerce.javaecommerce.mapper.OrderMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {
    @Bean
    public OrderMapper orderMapper(){
        return Mappers.getMapper(OrderMapper.class);
    }
}
