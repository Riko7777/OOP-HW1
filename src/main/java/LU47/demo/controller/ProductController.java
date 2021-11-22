package LU47.demo.controller;

import LU47.demo.model.Product;
import LU47.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

  @Autowired
  ProductService productManager;

  @GetMapping("/products")
  public List<Product> getProducts() {

    return productManager.getProducts();
  }
  @GetMapping("/keyword")
  public List<Product> getProducts(@RequestParam String keyword){

    return productManager.getProducts(keyword);
  }
}