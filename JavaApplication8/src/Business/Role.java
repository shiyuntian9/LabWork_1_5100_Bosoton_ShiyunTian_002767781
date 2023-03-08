/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import javax.swing.JFrame;
import Branch.BranchJFrame;
import Customer.CustomerJFrame;
import SystemAdmin.SystemAdminJFrame;
import ui.LibrarianJFrame;

/**
 *
 * @author tianshiyun
 */
public abstract class Role {
     public  JFrame getWorkArea(String role, Business business, UserAccount useraccount){
        if(role.equals("System Manager")){
            return new SystemAdminJFrame(business );
        }
        if(role.equals("Customer")){
            return new CustomerJFrame(business);
        }
        if(role.equals("Branch Manager")){
            return new BranchJFrame(business);
        }
        if(role.equals("Librarian")){
            return new LibrarianJFrame(business);
        }
        return null;
    }
    
}
