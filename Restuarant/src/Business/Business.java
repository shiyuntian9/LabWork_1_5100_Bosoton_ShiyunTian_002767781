/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Customer.CustomerDirectory;
import Services.MasterOrderDirectory;
import restuarant.DeliveryAgentDirectory;

/**
 *
 * @author tianshiyun
 */
public class Business {
    private UserAccountDirectory userAccountDirectory;
    private CustomerDirectory customerDirectory;
    private DeliveryAgentDirectory deliveryAgentDirectory;
    private MasterOrderDirectory masterOrderDirectory;
    
    
    public Business(){
        this.customerDirectory = new CustomerDirectory();
        this.deliveryAgentDirectory = new DeliveryAgentDirectory();
        this.masterOrderDirectory = new MasterOrderDirectory();
        this.userAccountDirectory = new UserAccountDirectory();
        UserAccount user = userAccountDirectory.createUserAccount("shiyun", "password", "manager");
    }

    
    public static Business getBusinessInstance(){
        return new Business();
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
     * @return the deliveryAgentDirectory
     */
    public DeliveryAgentDirectory getDeliveryAgentDirectory() {
        return deliveryAgentDirectory;
    }

    /**
     * @param deliveryAgentDirectory the deliveryAgentDirectory to set
     */
    public void setDeliveryAgentDirectory(DeliveryAgentDirectory deliveryAgentDirectory) {
        this.deliveryAgentDirectory = deliveryAgentDirectory;
    }

    /**
     * @return the masterOrderDirectory
     */
    public MasterOrderDirectory getMasterOrderDirectory() {
        return masterOrderDirectory;
    }

    /**
     * @param masterOrderDirectory the masterOrderDirectory to set
     */
    public void setMasterOrderDirectory(MasterOrderDirectory masterOrderDirectory) {
        this.masterOrderDirectory = masterOrderDirectory;
    }
    
    
    
}
