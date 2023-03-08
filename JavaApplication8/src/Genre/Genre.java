/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Genre;

import Material.Book;
import Business.Business;
import java.util.ArrayList;

/**
 *
 * @author tianshiyun
 */
public class Genre {
    private String name;
    Business business;
    
    
    public Genre(){
        
    }
    
    public Genre(String name){
        this.name = name;
        this.business = business;
        
    }

    
    public ArrayList getGenreBook(String name){
        ArrayList<Book> book = new ArrayList<>();
        for(Book b: business.getBookDirectory().getBookDirectory()){
            if(b.getGenre().equals(name)){
                book.add(b);
            }
        }
        return book;
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
    
}
