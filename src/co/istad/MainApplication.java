package co.istad;


import co.istad.controller.MenuController;
import co.istad.controller.ProductController;
import co.istad.util.Singleton;

import java.util.Scanner;

public class MainApplication {
    private final Scanner scanner;
    private final MenuController menuController;
    private final ProductController productController;
    public MainApplication(){
        scanner = Singleton.scanner();
        menuController = Singleton.menuController();
        productController = Singleton.productController();
    }

    private void run() {
        menuController.index();

        System.out.println("Enter options : ");
        int option = Integer.parseInt(scanner.nextLine());

        switch (option) {
            case 1 -> productController.index();
            default -> throw new IllegalStateException();
        }
    }

    public static void main(String[] args) {
       new MainApplication().run();

    }
}
