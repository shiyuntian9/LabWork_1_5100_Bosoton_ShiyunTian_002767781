/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Branch;

import Material.Material;
import java.util.ArrayList;

/**
 *
 * @author tianshiyun
 */
public class Library {
    private String name;
    private int buildingNo;
    private BranchManager branchManager;
    private Librarian librarian;
    private ArrayList<Material> materialList;
    
    
    public Library(){
        
    }
    
    public Library(String name,int buildingNo,BranchManager branchManager,Librarian librarian, Material material){
        this.name =  name;
        this.buildingNo = buildingNo;
        this.branchManager = branchManager;
        this.librarian = librarian;
        this.materialList = new ArrayList<>();
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
     * @return the buildingNo
     */
    public int getBuildingNo() {
        return buildingNo;
    }

    /**
     * @param buildingNo the buildingNo to set
     */
    public void setBuildingNo(int buildingNo) {
        this.buildingNo = buildingNo;
    }

    /**
     * @return the branchManager
     */
    public BranchManager getBranchManager() {
        return branchManager;
    }

    /**
     * @param branchManager the branchManager to set
     */
    public void setBranchManager(BranchManager branchManager) {
        this.branchManager = branchManager;
    }

    /**
     * @return the librarian
     */
    public Librarian getLibrarian() {
        return librarian;
    }

    /**
     * @param librarian the librarian to set
     */
    public void setLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }

    /**
     * @return the material
     */
    

    /**
     * @return the materialList
     */
    public ArrayList<Material> getMaterialList() {
        return materialList;
    }

    /**
     * @param materialList the materialList to set
     */
    public void setMaterialList(ArrayList<Material> materialList) {
        this.materialList = materialList;
    }
    
}
