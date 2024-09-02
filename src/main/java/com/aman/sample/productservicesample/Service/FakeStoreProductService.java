package com.aman.sample.productservicesample.Service;

import com.aman.sample.productservicesample.DTOs.FakeStoredto;
import com.aman.sample.productservicesample.Models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FakeStoreProductService implements ProductService{
    @Override
    public Product getproductbyId(long id) {
        RestTemplate  restTemplate = new RestTemplate();
        String url = "https://fakestoreapi.com/products/" + id;
        FakeStoredto fakeStoredto = restTemplate.getForObject(url, FakeStoredto.class);
        return convertfakeStoredtointoProduct (fakeStoredto);

    }
    private Product convertfakeStoredtointoProduct (FakeStoredto fakeStoredto) {
        Product product = new Product();
        product.setId(fakeStoredto.getId());
        product.setName(fakeStoredto.getTitle());
        product.setDescription(fakeStoredto.getDescription());
        product.setCategory(fakeStoredto.getCategory());
        product.setPrice(Double.parseDouble(fakeStoredto.getPrice()));
        product.setImage(fakeStoredto.getImage());
        return product;
    }
}
