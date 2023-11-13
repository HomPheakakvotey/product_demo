package co.istad.database;

import co.istad.model.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProductDatabase {
    private List<Product> products;

    public List<Product> getProducts() {
        return products;
    }
    public ProductDatabase() {
        products = new ArrayList<>();
        products.add(new Product(1L,"Coca",100,2500.0, LocalDate.now()));
        products.add(new Product(2L,"Virgo",150,3000.0, LocalDate.now()));
        products.add(new Product(3L,"Pepsi",50,2000.0, LocalDate.now()));
        products.add(new Product(4L,"Fanta",170,2000.0, LocalDate.now()));
        products.add(new Product(5L,"Sting",200,2500.0, LocalDate.now()));
    }
}


