package com.aman.sample.productservicesample.Service;

import com.aman.sample.productservicesample.DTOs.FakeStoredto;
import com.aman.sample.productservicesample.Exceptions.ProductNotFoundException;
import com.aman.sample.productservicesample.Models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service("FakeStore")
public class FakeStoreProductService implements ProductService  {
    @Override
    public Product getproductbyId(long id) throws ProductNotFoundException {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://freetestapi.com/api/v1/products/" + id;
        FakeStoredto fakeStoredto = restTemplate.getForObject(url, FakeStoredto.class);
        if(fakeStoredto == null) {
            throw new ProductNotFoundException("Product with ProductId: " + id +
                    " was not found");
        }

        return convertfakeStoredtointoProduct (fakeStoredto);

    }

    @Override
    public Product creatProduct(String name, String description, double price, String category, String image) {
        return null;
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
