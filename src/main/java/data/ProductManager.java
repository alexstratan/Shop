package data;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductManager implements Comparator<Product> {
    private static List<Product> productList = new ArrayList(0);

    static public void setProductList(List<Product> _productList){
        ProductManager.productList = _productList;
    }

    static public List<Product> getProductList(){
        return ProductManager.productList;
    }

    static public void addOne(Product product){
        productList.add(product);
    }

    static public int getListSize(){
        return productList.size();
    }

    static public void readOne(Product product){
        System.out.println("\n");
        System.out.println(product.getName());
        System.out.println(product.getBuyingPrice());
        System.out.println(product.getSellingPrice());
        System.out.println(product.getExpirationDate());
        System.out.println(product.getDescription());
        System.out.println(product.getStock());
        System.out.println("\n");
    }

    static public void readAll(){
        if(productList.size()>0){
            for(int i=0;i<productList.size();i++){
                readOne(productList.get(i));
            }
        }else{
            System.out.println("We currently have no products");
        }
    }

    @Override
    public int compare(Product pr1, Product pr2) {
        return pr1.getExpirationDate().compareTo(pr2.getExpirationDate());
    }

}
