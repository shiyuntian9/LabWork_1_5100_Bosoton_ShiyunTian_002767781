/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author tianshiyun
 */
public class Product {
    private String productID;
    private String productnName;
    private String productPrice;
    
    
    public Product(){
        this.productID = "";
        this.productPrice = "";
        this.productnName = "";
        
    }

    /**
     * @return the productID
     */
    public String getProductID() {
        return productID;
    }

    /**
     * @param productID the productID to set
     */
    public void setProductID(String productID) {
        this.productID = productID;
    }

    /**
     * @return the productnName
     */
    public String getProductnName() {
        return productnName;
    }

    /**
     * @param productnName the productnName to set
     */
    public void setProductnName(String productnName) {
        this.productnName = productnName;
    }

    /**
     * @return the productPrice
     */
    public String getProductPrice() {
        return productPrice;
    }

    /**
     * @param productPrice the productPrice to set
     */
    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }
    
    
}
