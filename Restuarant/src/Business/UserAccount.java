/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import UI.CustomerJFrame.CustomerJFrame;
import UI.DeliveryAgent.AgentJFrame;
import UI.Mamager.ManagerJFrame;
import javax.swing.JFrame;

/**
 *
 * @author tianshiyun
 */
public class UserAccount {
    private static int count = 0;
    private String accountId;
    private String username;
    private String password;
    private String role;
    
    
    public UserAccount(){
        this.accountId = "ACC" + count++;
        this.username = username;
        this.password = password;
        this.role = role;
    }
    public UserAccount(String username, String password, String role){
        this.accountId = role +count++;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    /**
     * @return the count
     */
    public static int getCount() {
        return count;
    }

    /**
     * @param aCount the count to set
     */
    public static void setCount(int aCount) {
        count = aCount;
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
    
    
    public JFrame getWorkArea(String role, Business business, UserAccount useraccount){
        if(role.equals("Manager")){
            return new ManagerJFrame(business, useraccount);
        }
        if(role.equals("Customer")){
            return new CustomerJFrame(business,useraccount);
        }
        if(role.equals("Agent")){
            return new AgentJFrame(business,useraccount);
        }
        return null;
    }
}
