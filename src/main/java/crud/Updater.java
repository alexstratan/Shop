package crud;

import data.Product;
import data.ProductManager;

import java.util.ArrayList;
import java.util.List;

public class Updater {

    public static void update(int ID,Product product){
        List<Product> productList = ProductManager.getProductList();
        for(int i=0;i<productList.size();i++){
            if(productList.get(i).getID()==ID){

                productList.get(i).setName(product.getName());
                productList.get(i).setBuyingPrice(product.getBuyingPrice());
                productList.get(i).setSellingPrice(product.getSellingPrice());
                productList.get(i).setDescription(product.getDescription());
                productList.get(i).setExpirationDate(product.getExpirationDate());
                productList.get(i).setStock(product.getStock());

            }
        }
    }

}
