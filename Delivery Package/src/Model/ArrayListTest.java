/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tianshiyun
 */
public class ArrayListTest {
     
    
     public static void main(String args[]) {
        int [] arr = new int[]{1,2,3,4,5};

         
        for(int i=0; i< arr.length; i++){
            if(i % 2 == 0){
                arr[i] *= 2 ;
            }else{
                arr[i] *=3;   
            }
        }
        
        for(int i:arr){
            System.out.println(i);
        }
    }
}
