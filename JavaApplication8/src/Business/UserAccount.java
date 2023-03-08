/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Customer.Customer;

/**
 *
 * @author tianshiyun
 */
public class UserAccount extends Role{
    private static int count = 0;
    private String accountId;
    private String username;
    private String password;
    private String role;
    Business business;
    String branch;
    String library;
    
    
    public UserAccount(){
        
    }
    public UserAccount(String username, String password, String role,String employeeId, String branch, String library){
        
        this.accountId = employeeId;
        this.username = username;
        this.password = password;
        this.role = role;
        this.business = business;
        this.branch = branch;
        this.library = library;
    }
    
    public UserAccount(String username, String password, String role){
       
        this.accountId = role +count++;
        this.username = username;
        this.password = password;
        this.role = role;
        this.business = business;
    }

    /**
     * @return the accountId
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * @param accountId the accountId to set
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the role
     */
    public String getRole() {
        return role;
    }

    /**
     * @param role the role to set
     */
    public void setRole(String role) {
        this.role = role;
    }
    
    
    public void changePassword(String password){
        this.setPassword(password);
        
    }
    
    public Customer findCustomer(){
        Customer cus = new Customer();
        for(Customer c : business.getCustomerDirectory().getCustomerDirectory()){
            if(this.accountId.equals(c.getId())){
                cus =  c;
            }
        }
        return cus;
    }
    
}
