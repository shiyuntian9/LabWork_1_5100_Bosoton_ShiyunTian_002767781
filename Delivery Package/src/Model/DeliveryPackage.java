/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.*;


/**
 *
 * @author tianshiyun
 */
public class DeliveryPackage {
    private String packageID;
    private String packageWeight;
    private Customer customer;
    
    private List<Product> productList = new ArrayList<>();

    
    public DeliveryPackage(){
        this.packageID = "";
        this.packageWeight  = "";
        this.customer = new Customer();
        
    }
    /**
     * @return the packageID
     */
    public String getPackageID() {
        return packageID;
    }

    /**
     * @param packageID the packageID to set
     */
    public void setPackageID(String packageID) {
        this.packageID = packageID;
    }

    /**
     * @return the packageWeight
     */
    public String getPackageWeight() {
        return packageWeight;
    }

    /**
     * @param packageWeight the packageWeight to set
     */
    public void setPackageWeight(String packageWeight) {
        this.packageWeight = packageWeight;
    }

    /**
     * @return the customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * @return the customerList
     */
    

    /**
     * @return the productList
     */
    public List<Product> getProductList() {
        return productList;
    }

    /**
     * @param productList the productList to set
     */
    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
    
    
    public void addProduct(String productID,String productnName, String productPrice){
        Product product = new Product();
        product.setProductID(productID);
        product.setProductPrice(productPrice);
        product.setProductnName(productnName);
        productList.add(product);
                  
    }
    
    public Product findProduct(String packageID){
        
        for(Product p : this.productList){
            if(p.getProductID().equals(packageID)){
                return p;
            }
                
     }
       return null;
    }   
    
    } 
    

    /**
     * @return the packageID
     */
   
    
    
    

