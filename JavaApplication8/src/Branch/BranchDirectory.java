/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Branch;

import java.util.ArrayList;

/**
 *
 * @author tianshiyun
 */
public class BranchDirectory {
    private ArrayList<Branch> branchDirectory;
    
    public BranchDirectory(){
        
    }
    
    public BranchDirectory(ArrayList<Branch> branchDirectory){
        
        this.branchDirectory  = new ArrayList<>();
        
    }

    /**
     * @return the branchDirectory
     */
    public ArrayList<Branch> getBranchDirectory() {
        return branchDirectory;
    }

    /**
     * @param branchDirectory the branchDirectory to set
     */
    public void setBranchDirectory(ArrayList<Branch> branchDirectory) {
        this.branchDirectory = branchDirectory;
    }
}
