package crud;

import data.Product;
import data.ProductManager;

import java.util.ArrayList;
import java.util.List;

public class Reader {

    static public void displayProducts(){
        //any additional operations
        ProductManager.readAll();
    }
    static public void displayByExpDate(){
        ProductManager.getProductList().forEach(product -> ProductManager.readOne(product));
    }

}
