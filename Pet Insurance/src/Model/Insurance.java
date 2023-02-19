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
public class Insurance {
    private Long id;
    private String name;
    private int costPerMonth;
    private int costPerAnnum = costPerMonth*12;
    
    
    public Insurance(){
        
    }
    
    public Insurance(Long id, String name, int costPerMonth, int costPerAnnum){
        this.id = id;
        this.name = name;
        this.costPerMonth = costPerMonth;
        this.costPerAnnum = costPerAnnum;
        
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
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
     * @return the costPerMonth
     */
    public int getCostPerMonth() {
        return costPerMonth;
    }

    /**
     * @param costPerMonth the costPerMonth to set
     */
    public void setCostPerMonth(int costPerMonth) {
        this.costPerMonth = costPerMonth;
    }

    /**
     * @return the costPerAnnum
     */
    public int getCostPerAnnum() {
        
        return costPerAnnum;
    }

    /**
     * @param costPerAnnum the costPerAnnum to set
     */
    public void setCostPerAnnum(int costPerAnnum) {
        this.costPerAnnum = costPerAnnum;
    }

    /**
     * @return the insurancePlan
     */
    @Override
    public String toString(){
        return id.toString()+ name + "costPerMonth"+costPerMonth+ "costPerAnnum"+costPerAnnum;
    }
   
    
}
