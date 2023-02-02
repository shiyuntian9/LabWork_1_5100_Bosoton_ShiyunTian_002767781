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
public class Person {
    
    private String userName;
    private ArrayList<Recipe> recipeList = new ArrayList<>();
    
    private Recipe recipeItem;
    private String eMail;
    private Long phone;
    
    
    public Person(){
        
    }
   
    public Person(String userName, String eMail,Long phone , ArrayList<Recipe> recipeList){
        this.userName = "";
        this.eMail = "";
        this.phone = phone;
        this.recipeList = recipeList;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the recipeList
     */
    public ArrayList<Recipe> getRecipeList() {
        return recipeList;
    }

    /**
     * @param recipeList the recipeList to set
     */
    public void setRecipeList(ArrayList<Recipe> recipeList) {
        this.recipeList = recipeList;
    }

    /**
     * @return the recipeItem
     */
    public Recipe getRecipeItem() {
        return recipeItem;
    }

    /**
     * @param recipeItem the recipeItem to set
     */
    public void setRecipeItem(Recipe recipeItem) {
        this.recipeItem = recipeItem;
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
     * @return the phone
     */
    public Long getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(Long phone) {
        this.phone = phone;
    }
    
    
    


    /**
     * @return the userName
     */
    
    
    
    
}
