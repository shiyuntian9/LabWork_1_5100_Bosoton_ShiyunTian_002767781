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
public class VitalSignHistory {
    private ArrayList<Observation> vitalSignHistory;
    Application application;
    Observation observation;
    
    public VitalSignHistory(){
        
        
    }
    
    public VitalSignHistory(Application application){
        
        this.application = application;
        this.vitalSignHistory = vitalSignHistory;
        this.observation = observation;
        
        
    }

    /**
     * @return the vitalSignHistory
     */
    public ArrayList<Observation> getVitalSignHistory() {
        return vitalSignHistory;
    }

    /**
     * @param vitalSignHistory the vitalSignHistory to set
     */
    public void setVitalSignHistory(ArrayList<Observation> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    
   
    
    public void  createObservation(int observationId, double bloodPressure, double temperature){
         Observation observation = new Observation();
         observation.setObservationId(observationId);
         observation.setBloodPressure(bloodPressure);
         observation.setTemperature(temperature);
         
         //add the observation object into the arraylist
         this.vitalSignHistory.add(observation);
         
         
        
    }
    
    public Boolean checkObservationIdUnique(int id){
        for(Observation o:this.vitalSignHistory){
            if(o.getObservationId() == id){
                return false;
            }
        }return true;
    }
    
    
    
    public Observation findObservation(int id){
        for(Observation o:vitalSignHistory){
            if(o.getObservationId() == id){
                return o;
            }
        }
        return null;
    }
    
}
