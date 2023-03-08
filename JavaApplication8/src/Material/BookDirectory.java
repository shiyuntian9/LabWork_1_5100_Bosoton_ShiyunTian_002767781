/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Material;

import Author.Author;
import java.util.ArrayList;

/**
 *
 * @author tianshiyun
 */
public class BookDirectory {
    private ArrayList<Book> bookDirectory;
    
    
    public BookDirectory(){
        
    }
    
    public BookDirectory(ArrayList<Book> bookDirectory){
        this.bookDirectory = new ArrayList<>();
        
    }
    
    public Book createBook(String genre,String author, String name){
        Book book   = new Book(genre, author, name);
        bookDirectory.add(book);
        return book;
        
    }
    
    
    public Book findBook(String name){
        for(Book b : this.bookDirectory){
            
            if(b.getName().equals(name)){
                return b;
            }
        }
        return null;
    } 
    
    
    
    public Boolean bookExists(String name){
        for(Book b: this.bookDirectory){
            if(b.getName().equals(name)){
                return true;
            }
        }
        return false;
    }
    


    /**
     * @return the bookDirectory
     */
    public ArrayList<Book> getBookDirectory() {
        return bookDirectory;
    }

    /**
     * @param bookDirectory the bookDirectory to set
     */
    public void setBookDirectory(ArrayList<Book> bookDirectory) {
        this.bookDirectory = bookDirectory;
    }
    
}
