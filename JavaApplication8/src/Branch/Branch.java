/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Branch;

import Business.UserAccountDirectory;

/**
 *
 * @author tianshiyun
 */
public class Branch {
    
    private String name;
    private UserAccountDirectory userAccountDirectory;

    private Library library;
    Librarian librarian;
    
    
    public Branch(){
        
    }
    
    public Branch(String name, UserAccountDirectory userAccountDirectory,Library library){
        this.name = name;
        this.library = library;
        this.userAccountDirectory = userAccountDirectory;
    }

    /**
     * @return the library
     */
    public Library getLibrary() {
        return library;
    }

    /**
     * @param library the library to set
     */
    public void setLibrary(Library library) {
        this.library = library;
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
    
    
    
}
