/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author tianshiyun
 */
public class Address {
    private String cStreetName;
    private String cAptNo;
    private String cCityState;
    private String cZipcode;
    private String pStreetName;
    private String pAptNo;
    private String pCityState;
    private String pZipcode;
    

    public Address (){
        this.cStreetName = "";
        this.cAptNo = "";
        this.cCityState = "";
        this.cZipcode = "";
        this.pStreetName = "";
        this.pAptNo = "";
        this.pCityState = "";
        this.pZipcode = "";
        
    }

    /**
     * @return the cStreetName
     */
    public String getcStreetName() {
        return cStreetName;
    }

    /**
     * @param cStreetName the cStreetName to set
     */
    public void setcStreetName(String cStreetName) {
        this.cStreetName = cStreetName;
    }

    /**
     * @return the cAptNo
     */
    public String getcAptNo() {
        return cAptNo;
    }

    /**
     * @param cAptNo the cAptNo to set
     */
    public void setcAptNo(String cAptNo) {
        this.cAptNo = cAptNo;
    }

    /**
     * @return the cCityState
     */
    public String getcCityState() {
        return cCityState;
    }

    /**
     * @param cCityState the cCityState to set
     */
    public void setcCityState(String cCityState) {
        this.cCityState = cCityState;
    }

    /**
     * @return the cZipcode
     */
    public String getcZipcode() {
        return cZipcode;
    }

    /**
     * @param cZipcode the cZipcode to set
     */
    public void setcZipcode(String cZipcode) {
        this.cZipcode = cZipcode;
    }

    /**
     * @return the pStreetName
     */
    public String getpStreetName() {
        return pStreetName;
    }

    /**
     * @param pStreetName the pStreetName to set
     */
    public void setpStreetName(String pStreetName) {
        this.pStreetName = pStreetName;
    }

    /**
     * @return the pAptNo
     */
    public String getpAptNo() {
        return pAptNo;
    }

    /**
     * @param pAptNo the pAptNo to set
     */
    public void setpAptNo(String pAptNo) {
        this.pAptNo = pAptNo;
    }

    /**
     * @return the pCityState
     */
    public String getpCityState() {
        return pCityState;
    }

    /**
     * @param pCityState the pCityState to set
     */
    public void setpCityState(String pCityState) {
        this.pCityState = pCityState;
    }

    /**
     * @return the pZipcode
     */
    public String getpZipcode() {
        return pZipcode;
    }

    /**
     * @param pZipcode the pZipcode to set
     */
    public void setpZipcode(String pZipcode) {
        this.pZipcode = pZipcode;
    }
    /**
     * @return the streetName
     */
    
    

    
    
}
