package com.aman.sample.productservicesample.Service;

import com.aman.sample.productservicesample.Exceptions.ProductNotFoundException;
import com.aman.sample.productservicesample.Models.Product;
import com.aman.sample.productservicesample.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("DBImpl")
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public Product getproductbyId(long id) throws ProductNotFoundException {
        Product p = productRepository.findById(id);
        if (p == null) {
            throw new ProductNotFoundException("Product not found");
        }
        return p;
    }

    @Override
    public Product creatProduct(String name, String description, double price, String category, String image) {
       /*
       select * from products where name = {name}
       if the above query return a product, then do not create a new product
       or we can also do a check for id = {id}
        */
        Product p = productRepository.findByNameAndCategory(name,category);
        if (p != null)
        {
            return p;
        }
        Product product = new Product();
        product.setName(name);
        product.setDescription(description);
        product.setPrice(price);
        product.setCategory(category);
        product.setImage(image);
        product = productRepository.save(product);
        System.out.println(product.getId());
        return product;
    }


    @Override
    public Product updateProduct(long id, String name, String description,
                                 double price, String category, String image) throws ProductNotFoundException {
        Product p = productRepository.findById(id);
        if (p == null)
        {
            throw new ProductNotFoundException("Product with ProductId: " + id +
                    " was not found");
        }
        Product product = new Product();
        product.setId(id);
        product.setName(name);
        product.setDescription(description);
        product.setPrice(price);
        product.setCategory(category);
        product.setImage(image);
        product = productRepository.save(product);
        return product;
    }

    @Override
    public void deleteProduct(long id) throws ProductNotFoundException {

        if(productRepository.findById(id) == null)
        {
            throw new ProductNotFoundException("Product with ProductId: " + id +
                    " was not found");
        }
        productRepository.deleteById(id);
    }


}
