/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Customer;

import Personnel.Person;
import Services.Order;
import java.util.ArrayList;

/**
 *
 * @author tianshiyun
 */
public class Customer extends Person {
    private int ordesrTotal;
    private ArrayList<Order> customerOrderList;
    
    
    public Customer(){
        super();
        this.customerOrderList = new ArrayList<Order>();
    }

    /**
     * @return the ordesrTotal
     */
    public int getOrdesrTotal() {
        return ordesrTotal;
    }

    /**
     * @param ordesrTotal the ordesrTotal to set
     */
    public void setOrdesrTotal(int ordesrTotal) {
        this.ordesrTotal = ordesrTotal;
    }

    /**
     * @return the customerOrderList
     */
    public ArrayList<Order> getCustomerOrderList() {
        return customerOrderList;
    }

    /**
     * @param customerOrderList the customerOrderList to set
     */
    public void setCustomerOrderList(ArrayList<Order> customerOrderList) {
        this.customerOrderList = customerOrderList;
    }

    
    
}
