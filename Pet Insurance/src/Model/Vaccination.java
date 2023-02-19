/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author tianshiyun
 */
public class Vaccination {
    private String vaccineName;
    private Boolean courseCompleted;

    
    public Vaccination(){
        
    }
    
    public Vaccination(String vaccineName, Boolean courseCompleted ){
        this.vaccineName = vaccineName;
        this.courseCompleted = courseCompleted;
    }
    /**
     * @return the vaccineName
     */
    public String getVaccineName() {
        return vaccineName;
    }

    /**
     * @param vaccineName the vaccineName to set
     */
    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    /**
     * @return the courseCompleted
     */
    public Boolean getCourseCompleted() {
        return courseCompleted;
    }

    /**
     * @param courseCompleted the courseCompleted to set
     */
    public void setCourseCompleted(Boolean courseCompleted) {
        this.courseCompleted = courseCompleted;
    }
    
    
}
