package com.shop.project.services;

import com.shop.project.entity.Product;
import com.shop.project.repository.ProductRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductServices {

    @Autowired
    ProductRep productRep;

    public void save(Product customer){
        productRep.save(customer);
    }
    public List<Product> listAll(){
        return  (List<Product>) productRep.findAll();
    }
    public Product get(Long id){
        return productRep.findById(id).get();
    }
    public void delete(Long id){
        productRep.deleteById(id);
    }
}
