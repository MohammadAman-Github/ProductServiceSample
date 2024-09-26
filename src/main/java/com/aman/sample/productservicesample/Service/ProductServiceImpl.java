package com.aman.sample.productservicesample.Service;

import com.aman.sample.productservicesample.DTOs.updateProductpartiallyDto;
import com.aman.sample.productservicesample.Exceptions.ProductNotFoundException;
import com.aman.sample.productservicesample.Models.Product;
import com.aman.sample.productservicesample.Repositories.ProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("DBImpl")
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public Product getproductbyId(long id) throws ProductNotFoundException {
//        Product p = productRepository.findById(id);
//        if (p == null) {
//            throw new ProductNotFoundException("Product not found");
//        }
        Optional<Product> optionalProduct = productRepository.findById(id);
        if(optionalProduct.isPresent()){
            Product product = optionalProduct.get();
            return product;
        }
        else{
            throw new ProductNotFoundException("Product with Product_Id : " + id + " was not found");
        }

//        return p;
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
        Optional<Product> p = productRepository.findById(id);
        if (p.isEmpty())
        {
            throw new ProductNotFoundException("Product with ProductId: " + id +
                    " was not found");
        }
        else {
            Product product = p.get();
            product.setId(id);
            product.setName(name);
            product.setDescription(description);
            product.setPrice(price);
            product.setCategory(category);
            product.setImage(image);
            product = productRepository.save(product);
            return product;
        }


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

    @Override
    @Transactional
    public Product updateProductpartillay(long id, updateProductpartiallyDto requestDto) throws ProductNotFoundException {
//        if(productRepository.findById(id) == null)
//        {
//            throw new ProductNotFoundException("Product with ProductId: " + id +
//                    " was not found");
//        }

//
//        if (requestDto.getName() != null) {
//            product.setName(requestDto.getName());
//        }
//        if (requestDto.getDescription() != null) {
//            product.setDescription(requestDto.getDescription());
//        }
//        if (requestDto.getPrice() != 0) {
//            product.setPrice(requestDto.getPrice());
//        }
//        if (requestDto.getCategory() != null) {
//            product.setCategory(requestDto.getCategory());
//        }
//        if (requestDto.getImage() != null) {
//            product.setImage(requestDto.getImage());
//        }
//        return productRepository.save(product);

        /*
        We can use above written methode also or we can choose to write code with Optional mehtode as written below
        both will work
         */

        Optional<Product> p = productRepository.findById(id);
        if(p.isPresent())
        {
            Product product = p.get();
            // Update fields only if they are present in the request DTO
            if (requestDto.getName() != null) {
                product.setName(requestDto.getName());
            }
            if (requestDto.getDescription() != null) {
                product.setDescription(requestDto.getDescription());
            }
            if (requestDto.getPrice() != 0) {
                product.setPrice(requestDto.getPrice());
            }
            if (requestDto.getCategory() != null) {
                product.setCategory(requestDto.getCategory());
            }
            if (requestDto.getImage() != null) {
                product.setImage(requestDto.getImage());
            }

            // Save the updated product
            product =  productRepository.save(product);
            return product;
        }
        else{
            throw new ProductNotFoundException("Product not found");
        }

    }

}
