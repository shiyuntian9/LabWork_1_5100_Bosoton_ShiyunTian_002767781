/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Customer;

import java.util.ArrayList;

/**
 *
 * @author tianshiyun
 */
public class CustomerDirectory {
    private ArrayList<Customer> customerlist;
    
    public CustomerDirectory(){
        this.customerlist = new ArrayList<Customer>();
    }
    
    public Customer findById(String id){
        for(Customer c:this.getCustomerlist()){
            if(c.getPersonID().equals(id)){
                return c;
            }
        }
        return null;
    
}
    
    public Customer createCustomers(String id, String name, String age){
        Customer c = new Customer();
        c.setName(name);
        c.setAge(age);
        c.setPersonID(id);
        
        this.getCustomerlist().add(c);
        return c;
    }

    /**
     * @return the customerlist
     */
    public ArrayList<Customer> getCustomerlist() {
        return customerlist;
    }

    /**
     * @param customerlist the customerlist to set
     */
    public void setCustomerlist(ArrayList<Customer> customerlist) {
        this.customerlist = customerlist;
    }
}
