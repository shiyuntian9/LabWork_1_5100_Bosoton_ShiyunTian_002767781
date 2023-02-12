/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restuarant;

import java.util.ArrayList;

/**
 *
 * @author tianshiyun
 */
public class DeliveryAgentDirectory {
    private ArrayList<DeliveryAgent> agentList;
    
    
    public DeliveryAgentDirectory(){
        this.agentList = new ArrayList<DeliveryAgent>();
        
    }
    
    public DeliveryAgent findById(String id){
        for(DeliveryAgent d: this.getAgentList()){
            if(d.getPersonID().equals(id)){
                return d;
            }
        }
        return null;
    }
    
    
    public DeliveryAgent createAgent(String id, String name, String age){
        DeliveryAgent d = new DeliveryAgent();
        d.setAge(age);
        d.setName(name);
        d.setPersonID(id);
        this.getAgentList().add(d);
        return d;
    }

    /**
     * @return the agentList
     */
    public ArrayList<DeliveryAgent> getAgentList() {
        return agentList;
    }

    /**
     * @param agentList the agentList to set
     */
    public void setAgentList(ArrayList<DeliveryAgent> agentList) {
        this.agentList = agentList;
    }
}
