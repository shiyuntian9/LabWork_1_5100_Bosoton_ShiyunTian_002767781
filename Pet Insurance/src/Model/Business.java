/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author tianshiyun
 */
public class Business {
    private ArrayList<Insurance> insurancePlan = new ArrayList<>();
    private ArrayList<Owner> ownerList= new ArrayList<>();
    
    public Business(){
        
    }
    
    public Business(ArrayList<Insurance> insurancePlan,ArrayList<Owner> ownerList){
        this.insurancePlan = insurancePlan;
        this.ownerList = ownerList;
    }
    
    public void addInsurance(Insurance insurance){
        insurancePlan.add(insurance);
    }

    public void addOwner(Owner owner){
        ownerList.add(owner);
    }
    /**
     * @return the insurancePlan
     */
    public ArrayList<Insurance> getInsurancePlan() {
        return insurancePlan;
    }

    /**
     * @param insurancePlan the insurancePlan to set
     */
    public void setInsurancePlan(ArrayList<Insurance> insurancePlan) {
        this.insurancePlan = insurancePlan;
    }

    /**
     * @return the ownerList
     */
    public ArrayList<Owner> getOwnerList() {
        return ownerList;
    }

    /**
     * @param ownerList the ownerList to set
     */
    public void setOwnerList(ArrayList<Owner> ownerList) {
        this.ownerList = ownerList;
    }
}
