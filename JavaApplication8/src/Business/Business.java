/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Author.AuthorDirectory;
import Material.BookDirectory;
import Branch.BranchDirectory;
import Customer.CustomerDirectory;
import Genre.GenreDirectory;
import MasterBorrowDirectory.MasterBorrowDirectory;
import Material.MagazineDirectory;
import Material.MaterialDirectory;

/**
 *
 * @author tianshiyun
 */
public class Business {
    private UserAccountDirectory userAccountDirectory;
    
    private CustomerDirectory customerDirectory;
    private BookDirectory bookDirectory;
    private MagazineDirectory magazineDirectory;
    private GenreDirectory genreDirectory;
    private AuthorDirectory authorDirectory;
    private MasterBorrowDirectory masterBorrowDirectory;
    private BranchDirectory branchDirectory;
    private MaterialDirectory materialDirectory;
    
    
    public Business(){
        this.magazineDirectory = magazineDirectory;
        this.authorDirectory = authorDirectory;
        this.bookDirectory = bookDirectory;
        this.customerDirectory = customerDirectory;
        this.genreDirectory = genreDirectory;
        this.userAccountDirectory = userAccountDirectory;
        this.masterBorrowDirectory = masterBorrowDirectory;
        this.materialDirectory = materialDirectory;
        UserAccount user = userAccountDirectory.createUserAccount("shiyun", "password", "manager");
        
    }

    /**
     * @return the userAccountDirectory
     */
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    /**
     * @param userAccountDirectory the userAccountDirectory to set
     */
    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    /**
     * @return the customerDirectory
     */
    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    /**
     * @param customerDirectory the customerDirectory to set
     */
    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    /**
     * @return the bookDirectory
     */
    public BookDirectory getBookDirectory() {
        return bookDirectory;
    }

    /**
     * @param bookDirectory the bookDirectory to set
     */
    public void setBookDirectory(BookDirectory bookDirectory) {
        this.bookDirectory = bookDirectory;
    }

    /**
     * @return the genreDirectory
     */
    public GenreDirectory getGenreDirectory() {
        return genreDirectory;
    }

    /**
     * @param genreDirectory the genreDirectory to set
     */
    public void setGenreDirectory(GenreDirectory genreDirectory) {
        this.genreDirectory = genreDirectory;
    }

    /**
     * @return the authorDirectory
     */
    public AuthorDirectory getAuthorDirectory() {
        return authorDirectory;
    }

    /**
     * @param authorDirectory the authorDirectory to set
     */
    public void setAuthorDirectory(AuthorDirectory authorDirectory) {
        this.authorDirectory = authorDirectory;
    }

    /**
     * @return the masterBorrowDirectory
     */
    public MasterBorrowDirectory getMasterBorrowDirectory() {
        return masterBorrowDirectory;
    }

    /**
     * @param masterBorrowDirectory the masterBorrowDirectory to set
     */
    public void setMasterBorrowDirectory(MasterBorrowDirectory masterBorrowDirectory) {
        this.masterBorrowDirectory = masterBorrowDirectory;
    }

    /**
     * @return the magazineDirectory
     */
    public MagazineDirectory getMagazineDirectory() {
        return magazineDirectory;
    }

    /**
     * @param magazineDirectory the magazineDirectory to set
     */
    public void setMagazineDirectory(MagazineDirectory magazineDirectory) {
        this.magazineDirectory = magazineDirectory;
    }

    /**
     * @return the branchDirectory
     */
    public BranchDirectory getBranchDirectory() {
        return branchDirectory;
    }

    /**
     * @param branchDirectory the branchDirectory to set
     */
    public void setBranchDirectory(BranchDirectory branchDirectory) {
        this.branchDirectory = branchDirectory;
    }

    /**
     * @return the materialDirectory
     */
    public MaterialDirectory getMaterialDirectory() {
        return materialDirectory;
    }

    /**
     * @param materialDirectory the materialDirectory to set
     */
    public void setMaterialDirectory(MaterialDirectory materialDirectory) {
        this.materialDirectory = materialDirectory;
    }
    
    
    
    
    
}
