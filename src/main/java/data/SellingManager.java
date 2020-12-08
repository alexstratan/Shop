package data;

import crud.Updater;

import java.util.List;

public class SellingManager {

    static public void sellProduct(int ID,int quantity){
        List<Product> productList = ProductManager.getProductList();
        for(Product pr: productList){
            if(pr.getID()==ID){
                pr.setStock(pr.getStock() - quantity);
                Profit.setTotalProfit(Profit.getTotalProfit()+((pr.getSellingPrice() - pr.getBuyingPrice()) * quantity));
                Updater.update(ID,pr);
            }
        }
    }

    static public void displayTotalProfit(){
        //additional operations or UI
        System.out.println(Profit.getTotalProfit());
    }
}
