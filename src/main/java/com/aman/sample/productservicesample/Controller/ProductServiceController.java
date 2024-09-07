package com.aman.sample.productservicesample.Controller;

import com.aman.sample.productservicesample.DTOs.CreateProductRequestDto;
import com.aman.sample.productservicesample.DTOs.UpdateProductRequestDto;
import com.aman.sample.productservicesample.Exceptions.ProductNotFoundException;
import com.aman.sample.productservicesample.Models.Product;
import com.aman.sample.productservicesample.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Products")
public class ProductServiceController {
    @Autowired
    @Qualifier ("DBImpl")
    public ProductService ProductService;
    @GetMapping("/{ProductId}")
    public ResponseEntity<Product> getproductbyId(@PathVariable ("ProductId") long id)
    throws ProductNotFoundException {
//        if(id < 1 || id > 20)
//        {
//            //String error = "Product Id must be between 1 and 20";
//            /*
//            not able to return bcz return type in response entity is Product , not String
//            we have to convert the return type .
//            or try some other methode
//            Try exception handeling for showing error in string formate.
//             */
//            return new ResponseEntity<>(HttpStatusCode.valueOf(400));
//        }
        Product product = ProductService.getproductbyId(id);
        return new ResponseEntity<>(product, HttpStatusCode.valueOf(200));
    }

    @PostMapping()
    public Product createProduct(@RequestBody CreateProductRequestDto requestDto) throws ProductNotFoundException {
         System.out.println(requestDto);
         // add basic validation
        if(requestDto.getName() == ""){
            throw new ProductNotFoundException("Product name is required");
        }
        if(requestDto.getName() == null){
            throw new ProductNotFoundException("Product name is required");
        }

        return ProductService.creatProduct(requestDto.getName(), requestDto.getDescription(),
                requestDto.getPrice(), requestDto.getCategory(), requestDto.getImage());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable ("id") long id, @RequestBody UpdateProductRequestDto requestDto) throws ProductNotFoundException{


        Product product = ProductService.updateProduct(id,requestDto.getName(), requestDto.getDescription(),
                requestDto.getPrice(), requestDto.getCategory(), requestDto.getImage());
        return new ResponseEntity<>(product, HttpStatusCode.valueOf(200));
    }
}
