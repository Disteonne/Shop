package com.shop.project.repository;


import com.shop.project.entity.*;

import org.springframework.data.repository.CrudRepository;

public interface ProductRep extends CrudRepository<Product,Long> {
}
