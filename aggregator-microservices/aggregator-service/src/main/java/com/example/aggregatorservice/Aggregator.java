package com.example.aggregatorservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static java.util.Objects.requireNonNullElse;

@RestController
public class Aggregator {
    @Autowired
    private ProductInformationClient informationClient;

    @Autowired
    private ProductInventoryClient inventoryClient;


    @GetMapping("/product")
    public Product getProduct(){
        var product = new Product();
        var productTitle = informationClient.getProductTitle();
        var productInventory = inventoryClient.getProductInventories();
        product.setTitle(requireNonNullElse(productTitle,"Error: Fetching Product Title Failed"));
        product.setProductInventories(requireNonNullElse(productInventory,-1));
        return product;
    }

}
