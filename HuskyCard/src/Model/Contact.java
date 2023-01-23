/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author tianshiyun
 */
public class Contact {
    private String officePhone;
    private String personalPhone;
    private String officeEmail;
    private String personalEmail;
    
    public Contact (){
        this.officePhone = "";
        this.personalPhone = "";
        this.officeEmail = "";
        this.personalEmail = "";
        
    }

    
    /**
     * @return the officePhone
     */
    public String getOfficePhone() {
        return officePhone;
    }

    /**
     * @param officePhone the officePhone to set
     */
    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }

    /**
     * @return the personalPhone
     */
    public String getPersonalPhone() {
        return personalPhone;
    }

    /**
     * @param personalPhone the personalPhone to set
     */
    public void setPersonalPhone(String personalPhone) {
        this.personalPhone = personalPhone;
    }

    /**
     * @return the officeEmail
     */
    public String getOfficeEmail() {
        return officeEmail;
    }

    /**
     * @param officeEmail the officeEmail to set
     */
    public void setOfficeEmail(String officeEmail) {
        this.officeEmail = officeEmail;
    }

    /**
     * @return the personalEmail
     */
    public String getPersonalEmail() {
        return personalEmail;
    }

    /**
     * @param personalEmail the personalEmail to set
     */
    public void setPersonalEmail(String personalEmail) {
        this.personalEmail = personalEmail;
    }
    
}
