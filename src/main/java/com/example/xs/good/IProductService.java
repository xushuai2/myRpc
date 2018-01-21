package com.example.xs.good;

import com.example.xs.bean.Product;

public interface IProductService {
    public Product queryById(long id);
    public String hello(String name);
}
