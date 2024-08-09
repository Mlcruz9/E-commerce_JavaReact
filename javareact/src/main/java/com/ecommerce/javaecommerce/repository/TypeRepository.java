package com.ecommerce.javaecommerce.repository;

import com.ecommerce.javaecommerce.entity.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeRepository extends JpaRepository <Type, Integer>{ 
} 
