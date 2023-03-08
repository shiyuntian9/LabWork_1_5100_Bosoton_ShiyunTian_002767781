/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author tianshiyun
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountDirectory;
    
    public UserAccountDirectory(){
        
    }
    
    public UserAccountDirectory(ArrayList<UserAccount> useraccountlist){
        this.userAccountDirectory = new ArrayList<>();
        
    }
    
    public UserAccount createUserAccount(String username, String password, String role){
        UserAccount user = new UserAccount(username,password, role);
        userAccountDirectory.add(user);
        return user;
        
    }
    
    public UserAccount createUserAccount(String username, String password, String role, String id,String br, String lib){
        UserAccount user = new UserAccount(username,password, role, id, br, lib);
        userAccountDirectory.add(user);
        return user;
        
    }
    
    
    public UserAccount findById(String id){
        for(UserAccount u : this.userAccountDirectory){
            if(u.getAccountId().equals(id)){
                return u;
            }
        }
        return null;
    } 
    
    public UserAccount getUserAccount(String username, String password, String role){
        for(UserAccount u: this.userAccountDirectory){
            if(u.getUsername().equals(username)&& u.getPassword().equals(password)&& u.getRole().equals(role)){
                return u;
            }
        }
        return null;
    }
    
    public Boolean accountExists(String employeeId){
        Boolean a = true;
        for(UserAccount u: this.userAccountDirectory){
            if(u.getAccountId().equals(employeeId)){
                
                
            }else{
                a = false;
            }
        }
        return a;
    }
    
    
    public Boolean accountLogExists(String userName, String password, String role){
        Boolean a = true;
        for(UserAccount u: this.userAccountDirectory){
            if(u.getUsername().equals(userName)&& u.getPassword().equals(password)&&u.getRole().equals(role)){
                
                
            }else{
                a = false;
            }
        }
        return a;
    }
    
    public Boolean accountNameExists(String username){
        Boolean a = true;
        for(UserAccount u: this.userAccountDirectory){
            if(u.getUsername().equals(username)){
                
                
            }else{
                a = false;
            }
        }
        return a;
    }
    
    
    
    
    



    /**
     * @return the      */
    public ArrayList<UserAccount> userAccountDirectory() {
        return userAccountDirectory;
    }

    /**
     * @param useraccountlist the useraccountlist to set
     */
    public void setUseraccountlist(ArrayList<UserAccount> userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }
    
}
