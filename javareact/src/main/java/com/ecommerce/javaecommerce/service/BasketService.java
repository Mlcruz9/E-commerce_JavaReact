package com.ecommerce.javaecommerce.service;

import com.ecommerce.javaecommerce.entity.Basket;
import com.ecommerce.javaecommerce.model.BasketResponse;

import java.util.List;

public interface BasketService {
    List<BasketResponse> getAllBaskets();
    BasketResponse getBasketById(String basketId);
    void deleteBasketById(String basketId);
    BasketResponse createBasket(Basket basket);
}
