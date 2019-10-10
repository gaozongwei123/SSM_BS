package org.gzw.service;

import org.gzw.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> Productfinall();

    Product Productfinbyid(int id);

    void insertProduct(Product Product);

    void updateProduct(Product Product);

    void deleProduct(int id);
}
