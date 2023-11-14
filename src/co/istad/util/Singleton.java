package co.istad.util;

import co.istad.controller.MenuController;
import co.istad.controller.ProductController;
import co.istad.service.ProductServiceImp;

import java.util.Scanner;

public class Singleton {
//    1. Create static reference type
    private static Scanner scanner;
    private static MenuController menuController;
    private static ProductController productcontroller;
    private static ProductServiceImp productServiceImpl;
//    2. Create get instance of scanner
    public static Scanner scanner () {
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }
        return scanner;
    }
    public static MenuController menuController() {
        if (menuController == null){
            menuController = new MenuController();
        }
        return menuController;
    }

    public static ProductServiceImp getProductServiceImpl() {
        if (productServiceImpl == null) {
            productServiceImpl = new ProductServiceImp();
        }
        return productServiceImpl;
    }

    public static ProductController productController() {
        if (productcontroller == null) {
            productcontroller = new ProductController();
        }
        return productcontroller;
    }


}
