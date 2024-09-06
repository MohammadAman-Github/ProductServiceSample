package com.aman.sample.productservicesample.Repositories;

import com.aman.sample.productservicesample.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    // select * from products where name = {name}
    Product findByName(String name);

    // find product by id --> SElect * form products where id = {id}
    Product findById(long id);

    // find product by id and name
    // Select * from products where id = {id} AND name = {name}
    Product findByNameAndId(String name, long id);

    Product findByCategory(String category);
    Product findByNameAndCategory(String name, String category);
    Product findByNameAndCategoryAndId(String name, String category, long id);

    // if we want all products , it should be list of all products
    // Select * from  products
    List<Product> findAll();

    // select * from products where name like %{name}%
    List<Product> findByNameContaining(String name);

}
