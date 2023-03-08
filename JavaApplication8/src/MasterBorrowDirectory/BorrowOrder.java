/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MasterBorrowDirectory;

import Branch.Branch;
import Material.Book;
import Business.UserAccount;
import Material.Magazine;
import java.util.ArrayList;

/**
 *
 * @author tianshiyun
 */
public class BorrowOrder {
    private String status;
    private Book book;
    private Magazine magazine;
    private UserAccount userAccount;
    private String duration;
    private int price;
    private Branch branch;
    
    public BorrowOrder(){
        
    }
    
    public BorrowOrder(String status,Book book,UserAccount userAccount, String duration, int price,Branch branch){
        this.book = book;
        this.status = status;
        this.userAccount = userAccount;
        this.duration = duration;
        this.price = price;
        this.branch = branch;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the book
     */
    public Book getBook() {
        return book;
    }

    /**
     * @param book the book to set
     */
    public void setBook(Book book) {
        this.book = book;
    }

    /**
     * @return the borrowBookList
     */
    

    /**
     * @param borrowBookList the borrowBookList to set
     */
    

    /**
     * @return the customer
     */
    

    /**
     * @return the duration
     */
    public String getDuration() {
        return duration;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * @return the userAccount
     */
    public UserAccount getUserAccount() {
        return userAccount;
    }

    /**
     * @param userAccount the userAccount to set
     */
    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    /**
     * @return the branch
     */
    public Branch getBranch() {
        return branch;
    }

    /**
     * @param branch the branch to set
     */
    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    /**
     * @return the magazine
     */
    public Magazine getMagazine() {
        return magazine;
    }

    /**
     * @param magazine the magazine to set
     */
    public void setMagazine(Magazine magazine) {
        this.magazine = magazine;
    }
    
    
    
}
