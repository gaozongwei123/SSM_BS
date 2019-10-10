package org.gzw.service.Impl;

import org.gzw.dao.ProductDao;
import org.gzw.entity.Product;
import org.gzw.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("productService")
public class ProductServiceimpl implements ProductService {

    @Autowired
    private ProductDao productDao;


    @Override
    public List<Product> Productfinall() {
        return productDao.Productfinall();
    }

    @Override
    public Product Productfinbyid(int id) {
        return productDao.Productfinbyid(id);
    }

    @Override
    public void insertProduct(Product Product) {
        productDao.insertProduct(Product);
    }

    @Override
    public void updateProduct(Product Product) {
        productDao.updateProduct(Product);
    }

    @Override
    public void deleProduct(int id) {
        productDao.deleProduct(id);
    }
}
