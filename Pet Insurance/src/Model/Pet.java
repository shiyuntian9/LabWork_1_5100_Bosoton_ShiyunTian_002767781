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
public class Pet {
    private String name;
    private int age;
    private String gender;
    private String type;
    private String breed;
    private ArrayList<Vaccination> vaccineList;
    private Insurance insurance;

    
    public Pet(){
        
    }
    
    public Pet(String name, int age, String gender, String type, String breed, ArrayList<Vaccination> vaccineList, Insurance insurance){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.type = type;
        this.breed = breed;
        this.vaccineList = new ArrayList<>();
        this.insurance = new Insurance();
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
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * @param breed the breed to set
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * @return the vaccine
     */
    public ArrayList<Vaccination> getVaccine() {
        return vaccineList;
    }

    /**
     * @param vaccine the vaccine to set
     */
    public void setVaccine(ArrayList<Vaccination> vaccineList) {
        this.vaccineList = vaccineList;
    }

    /**
     * @return the insurance
     */
    public Insurance getInsurance() {
        return insurance;
    }

    /**
     * @param insurance the insurance to set
     */
    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }
    
    public void addVaccination(Vaccination vaccination){
        vaccineList.add(vaccination);
        
    }
}
