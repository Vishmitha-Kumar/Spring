package com.develop.demo.service;

import com.develop.demo.module.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products= Arrays.asList(
            new Product(101,"Iphone",500000),
            new Product (102,"Laptop",54000));
    public List<Product> getProducts(){
        return products;
    }


}
