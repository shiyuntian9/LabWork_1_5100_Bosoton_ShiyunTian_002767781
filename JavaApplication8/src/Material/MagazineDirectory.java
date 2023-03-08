/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Material;

import java.util.ArrayList;

/**
 *
 * @author tianshiyun
 */
public class MagazineDirectory {

    /**
     * @return the magazineDirectory
     */
    public ArrayList<Magazine> getMagazineDirectory() {
        return magazineDirectory;
    }

    /**
     * @param magazineDirectory the magazineDirectory to set
     */
    public void setMagazineDirectory(ArrayList<Magazine> magazineDirectory) {
        this.magazineDirectory = magazineDirectory;
    }
       private ArrayList<Magazine> magazineDirectory;
    
    
    public MagazineDirectory(){
        
    }
    
    public MagazineDirectory(ArrayList<Magazine> magazineDirectory){
        this.magazineDirectory = new ArrayList<>();
        
    }
    
    public Magazine createMagazine(String serialNumber, String name, String date,Boolean availability,String company,String issueType){
        Magazine magazine   = new Magazine(serialNumber, name, date,availability,company,issueType);
        getMagazineDirectory().add(magazine);
        return magazine;
        
    }
    
    
    public Magazine findMagazine(String serialNumber){
        for(Magazine m : this.getMagazineDirectory()){
            
            if(m.getName().equals(serialNumber)){
                return m;
            }
        }
        return null;
    } 
    
    
    
    public Boolean magazineExists(String name){
        for(Magazine m: this.getMagazineDirectory()){
            if(m.getName().equals(name)){
                return true;
            }
        }
        return false;
    }
    
    
}
