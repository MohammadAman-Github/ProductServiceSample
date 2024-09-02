package com.aman.sample.productservicesample.SampleController;

import com.aman.sample.productservicesample.Models.Product;
import com.aman.sample.productservicesample.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Product")
public class ProductServiceController {
    @Autowired
    public ProductService ProductService;
    @GetMapping("/{ProductId}")
    public ResponseEntity<Product> getproductbyId(@PathVariable ("ProductId") long id){
        if(id < 1 || id > 20)
        {
            //String error = "Product Id must be between 1 and 20";
            /*
            not able to return bcz return type in response entity is Product , not String
            we have to convert the return type .
            or try some other methode.
             */
            return new ResponseEntity<>(HttpStatusCode.valueOf(400));
        }
        Product product = ProductService.getproductbyId(id);
        return new ResponseEntity<>(product, HttpStatusCode.valueOf(200));
    }
}
