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
public class Customer {
    private ArrayList<BorrowOrder> borrowedBookList;
    private String name;
    private String id;
    private String password;
    Business business;
    
    public Customer(){
        
    }
    
    public Customer(String name, String id,String password,ArrayList<BorrowOrder> borrowedBookList){
        this.id = id;
        this.name = name;
        this.password = password;
        this.borrowedBookList  = new ArrayList<>();
        this.business = business;
        
        
        
    }
    
    public BorrowOrder getBorrowOrder(BorrowOrder borrowOrder){
        BorrowOrder o = new BorrowOrder();
        for(BorrowOrder bo:borrowedBookList){
            if(bo.equals(borrowOrder.getUserAccount().findCustomer())){
                o = bo;
            }
        }return o;
    }

    /**
     * @return the borrowedBookList
     */
    public ArrayList<BorrowOrder> getBorrowedBookList() {
        return borrowedBookList;
    }

    /**
     * @param borrowedBookList the borrowedBookList to set
     */
    public void setBorrowedBookList(ArrayList<BorrowOrder> borrowedBookList) {
        this.borrowedBookList = borrowedBookList;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
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
    
    
}
