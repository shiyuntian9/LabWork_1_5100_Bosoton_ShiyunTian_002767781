/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restuarant;

import Personnel.Person;
import Services.Order;
import java.util.ArrayList;

/**
 *
 * @author tianshiyun
 */
public class DeliveryAgent extends Person {
    private int orderCount;
    private ArrayList<Order> agentOrderlist;
    
    public DeliveryAgent(){
        super();
        this.agentOrderlist = new ArrayList<Order>();
    }

    /**
     * @return the orderCount
     */
    public int getOrderCount() {
        return orderCount;
    }

    /**
     * @param orderCount the orderCount to set
     */
    public void setOrderCount(int orderCount) {
        this.orderCount = orderCount;
    }

    /**
     * @return the agentOrderlist
     */
    public ArrayList<Order> getAgentOrderlist() {
        return agentOrderlist;
    }

    /**
     * @param agentOrderlist the agentOrderlist to set
     */
    public void setAgentOrderlist(ArrayList<Order> agentOrderlist) {
        this.agentOrderlist = agentOrderlist;
    }
    
    public Order addDeliveryOrder(Order o){
        agentOrderlist.add(o);
        return o;
    }
    
}
