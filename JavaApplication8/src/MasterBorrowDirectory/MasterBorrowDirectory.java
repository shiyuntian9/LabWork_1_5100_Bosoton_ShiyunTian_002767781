/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MasterBorrowDirectory;

import Business.Business;
import Business.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author tianshiyun
 */
public class MasterBorrowDirectory {
    private ArrayList<BorrowOrder> masterBorrowDirectory;
    Business business;
    
    
    
    public MasterBorrowDirectory(){
        this.masterBorrowDirectory = new ArrayList<>();
        this.business = business;
        
       
    }
    
    public BorrowOrder createOrder(BorrowOrder borrowOrder){
        getMasterBorrowDirectory().add(borrowOrder);
        return borrowOrder;
    }
    
    
    
    public ArrayList findOrder(UserAccount u){
        ArrayList<BorrowOrder> newList = new ArrayList<>();
        for(BorrowOrder bo : business.getMasterBorrowDirectory().getMasterBorrowDirectory()){
            if(bo.getUserAccount().equals(u)){
                newList.add(bo);
            }
        }return newList;
    }
    
    

    /**
     * @return the masterBorrowDirectory
     */
    public ArrayList<BorrowOrder> getMasterBorrowDirectory() {
        return masterBorrowDirectory;
    }

    /**
     * @param masterBorrowDirectory the masterBorrowDirectory to set
     */
    public void setMasterBorrowDirectory(ArrayList<BorrowOrder> masterBorrowDirectory) {
        this.masterBorrowDirectory = masterBorrowDirectory;
    }
}
