/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.Optional;

/**
 *
 * @author tianshiyun
 */
public class Recipe {
    
    private String recipeTitle;
    private int noOfServings;
    private Boolean isGlutenFree;
    private Double difficultyLevel;
    private String noOfIngredients;
    private String categoryOfFood;
    private String description;
    private String path;
       
    
    
    
    
    
    

    public Recipe(){
        
    }
        
    public Recipe(String recipeTitle, int noOfServings, Boolean isGlutenFree, Double difficultyLevel, String noOfIngredients, String categoryOfFood, String descpription) {
        
        
        this.recipeTitle = recipeTitle;
        this.noOfServings = noOfServings;
        this.isGlutenFree = isGlutenFree;
        this.difficultyLevel = difficultyLevel;
        this.noOfIngredients = noOfIngredients;
        this.categoryOfFood = categoryOfFood;
        this.description = descpription;
    }
        
        



    /**
     * @return the recipeTitle
     */
    public String getRecipeTitle() {
        return recipeTitle;
    }

    /**
     * @param recipeTitle the recipeTitle to set
     */
    public void setRecipeTitle(String recipeTitle) {
        this.recipeTitle = recipeTitle;
    }

    /**
     * @return the noOfServings
     */
    public int getNoOfServings() {
        return noOfServings;
    }

    /**
     * @param noOfServings the noOfServings to set
     */
    public void setNoOfServings(int noOfServings) {
        this.noOfServings = noOfServings;
    }

    /**
     * @return the isGlutenFree
     */
    public Boolean getIsGlutenFree() {
        return isGlutenFree;
    }

    /**
     * @param isGlutenFree the isGlutenFree to set
     */
    public void setIsGlutenFree(Boolean isGlutenFree) {
        this.isGlutenFree = isGlutenFree;
    }

    /**
     * @return the difficultyLevel
     */
    public Double getDifficultyLevel() {
        return difficultyLevel;
    }

    /**
     * @param difficultyLevel the difficultyLevel to set
     */
    public void setDifficultyLevel(Double difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    /**
     * @return the noOfIngredients
     */
    public String getNoOfIngredients() {
        return noOfIngredients;
    }

    /**
     * @param noOfIngredients the noOfIngredients to set
     */
    public void setNoOfIngredients(String noOfIngredients) {
        this.noOfIngredients = noOfIngredients;
    }

    /**
     * @return the categoryOfFood
     */
    public String getCategoryOfFood() {
        return categoryOfFood;
    }

    /**
     * @param categoryOfFood the categoryOfFood to set
     */
    public void setCategoryOfFood(String categoryOfFood) {
        this.categoryOfFood = categoryOfFood;
    }

    /**
     * @return the descpription
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param descpription the descpription to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the path
     */
    public String getPath() {
        return path;
    }

    /**
     * @param path the path to set
     */
    public void setPath(String path) {
        this.path = path;
    }
    
    
    
    
}