package crud;

import data.Product;
import data.ProductManager;

import java.time.LocalDate;
import java.util.Scanner;

public class Creator {
    public void createProduct(){

        Scanner sc = new Scanner(System.in);
        String name;
        double buyingPrice,sellingPrice;
        LocalDate expirationDate;
        String description;
        int stock;

        name= sc.nextLine();
        buyingPrice= sc.nextDouble();
        sellingPrice= sc.nextDouble();
        expirationDate = LocalDate.parse(sc.nextLine());
        description = sc.nextLine();
        stock = sc.nextInt();

        Product product = new Product(name,buyingPrice,sellingPrice,expirationDate,description,stock);

        ProductManager.addOne(product);
    }
}
