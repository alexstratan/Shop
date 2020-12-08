package crud;

import data.Product;
import data.ProductManager;

import java.util.List;

public class Deleter {

    static public void removeProd(int ID){
        List<Product> productList = ProductManager.getProductList();
        productList.removeIf(x->x.getID()==ID);
        ProductManager.setProductList(productList);
        }
    }
