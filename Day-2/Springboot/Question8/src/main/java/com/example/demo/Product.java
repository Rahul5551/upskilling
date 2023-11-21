package com.example.demo;

import org.springframework.data.mongodb.core.mapping.Document;
 

@Document("product")
public class Product {
   
    private String id;
    private String name;
    private String price;
    public Product(String id, String name, String price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getPrice() {
        return price;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(String price) {
        this.price = price;
    }

}