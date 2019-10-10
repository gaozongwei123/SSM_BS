package org.gzw.dao;


import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.gzw.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDao {

    List<Product> Productfinall();

    Product Productfinbyid(int id);

    @Insert("INSERT INTO product(product_price,picdescp,pic,market_price,discount,product_descp,brand_id,somatotypeid,processorid,fuselagememoryid,runningmemoryid,stock,userid,product_remark)values(#{product_price},#{picdescp},#{pic},#{market_price},#{discount},#{product_descp},#{brand_id},#{somatotypeid},#{processorid},#{fuselagememoryid},#{runningmemoryid},#{stock},#{userid},#{product_remark})")
    void insertProduct(Product Product);

    @Update("update Product set product_price= #{product_price},picdescp=#{picdescp},pic=#{pic},market_price=#{market_price},discount=#{discount},product_descp=#{product_descp},brand_id=#{brand_id},somatotypeid=#{somatotypeid},processorid=#{processorid},fuselagememoryid=#{fuselagememoryid},runningmemoryid=#{runningmemoryid},stock=#{stock},userid=#{userid},product_remark=#{product_remark} where product_id= #{product_id}")
    void updateProduct(Product Product);

    @Delete("delete from Product where product_id= #{product_id}")
    void deleProduct(int id);

}
