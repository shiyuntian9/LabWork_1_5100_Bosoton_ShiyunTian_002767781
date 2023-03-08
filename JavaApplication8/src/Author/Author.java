/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Author;

import Material.Book;
import Business.Business;
import java.util.ArrayList;

/**
 *
 * @author tianshiyun
 */
public class Author {
    private String name;
    Business business;
    
    public Author(String name){
        this.name = name;
        this.business = business;
    }
    
    public ArrayList getAuthorBook(String name){
        ArrayList<Book> book = new ArrayList<>();
        for(Book b: business.getBookDirectory().getBookDirectory()){
            if(b.getAuthor().equals(name)){
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
