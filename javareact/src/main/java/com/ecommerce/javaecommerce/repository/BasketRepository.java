package com.ecommerce.javaecommerce.repository;

import com.ecommerce.javaecommerce.entity.Basket;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasketRepository extends CrudRepository<Basket, String> {
}