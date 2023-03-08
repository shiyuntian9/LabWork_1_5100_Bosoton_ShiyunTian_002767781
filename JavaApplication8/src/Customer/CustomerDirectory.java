/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Customer;

import Business.Business;
import MasterBorrowDirectory.BorrowOrder;
import java.util.ArrayList;

/**
 *
 * @author tianshiyun
 */
public class CustomerDirectory {
    private ArrayList<Customer> customerDirectory;
    Business business;
    
    public CustomerDirectory(){
        
    }
    
    
    public CustomerDirectory(ArrayList<Customer> customerDirectory){
        this.customerDirectory = new ArrayList<>();
        this.business = business;
    }
    
    
    public Customer createCostomer(String name, String id,String password,ArrayList<BorrowOrder> borrowedBookList){
        Customer customer = new Customer(name, id, password, borrowedBookList);
        this.business.getCustomerDirectory().getCustomerDirectory().add(customer);
        return customer;
        
    }
    
    
    public Customer findById(String id){
        for(Customer c : this.getCustomerDirectory()){
            if(c.getId().equals(id)){
                return c;
            }
        }
        return null;
    } 
    
    public Customer getUserAccount(String username, String id, String password){
        for(Customer u: this.getCustomerDirectory()){
            if(u.getName().equals(username)&& u.getId().equals(id)&& u.getPassword().equals(password)){
                return u;
            }
        }
        return null;
    }
    
    public Boolean accountExists(String username, String id, String password){
        for(Customer u: this.getCustomerDirectory()){
            if(u.getName().equals(username)&& u.getId().equals(id)&& u.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }

    /**
     * @return the customerDirectory
     */
    public ArrayList<Customer> getCustomerDirectory() {
        return customerDirectory;
    }

    /**
     * @param customerDirectory the customerDirectory to set
     */
    public void setCustomerDirectory(ArrayList<Customer> customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
    
    
}

