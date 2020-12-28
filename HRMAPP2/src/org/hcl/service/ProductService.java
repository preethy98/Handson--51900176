package org.hcl.service;

import java.util.List;

import org.hcl.model.Product;

public interface ProductService {
List<Product> getProducts();
boolean addProduct(Product product);
}
