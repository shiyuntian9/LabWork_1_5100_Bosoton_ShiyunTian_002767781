/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
/**
 *
 * @author tianshiyun
 */
public class Person {
    private String firstName;
    private String lastName;
    private String college;
    private String eMail;
    private String phoneNumber;
    private String iD;
    private Address address;
    private Contact contact;
    
    public Person (){
        this.address = address;
        this.college = "";
        this.eMail = "";
        this.firstName = "";
        this.lastName = "";
        this.iD = "";
        this.phoneNumber = "";
        this.contact = contact;
    }
    
    public void setContact(Contact contactInformation){
        this.contact = contactInformation;
        
    }
    
    public Contact getContact(){
        return contact;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the college
     */
    public String getCollege() {
        return college;
    }

    /**
     * @param college the college to set
     */
    public void setCollege(String college) {
        this.college = college;
    }

    /**
     * @return the address
     */
    public Address getAddress() {
       return address; 
    }

    /**
     * @param address the address to set
     */
    public void setAddress(Address address){
        this.address = address;
    }

    /**
     * @return the eMail
     */
    public String geteMail() {
        return eMail;
    }

    /**
     * @param eMail the eMail to set
     */
    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the iD
     */
    public String getiD() {
        return iD;
    }

    /**
     * @param iD the iD to set
     */
    public void setiD(String iD) {
        this.iD = iD;
    }
  
    
}
