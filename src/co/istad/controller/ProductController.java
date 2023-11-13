package co.istad.controller;

import co.istad.model.Product;
import co.istad.service.ProductService;
import co.istad.service.ProductServiceImpl;
import co.istad.view.ProductView;

import java.util.List;

public class ProductController {

    private final ProductService productService;
    public ProductController() {

        productService = new ProductServiceImpl();
    }
    public void index() {
        List<Product> products = productService.select();
        ProductView.printProductList(products);
    }

}
