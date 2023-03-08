/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Author;

import Material.Book;
import Material.BookDirectory;
import Business.Business;
import Customer.Customer;
import java.util.ArrayList;

/**
 *
 * @author tianshiyun
 */
public class AuthorDirectory {
    private ArrayList<Author> authorDirectory;
    Business business;
    
    public AuthorDirectory(){
        
    }
    
    public AuthorDirectory(ArrayList<Author> authorDirectory){
        this.authorDirectory = new ArrayList<>();
        this.business = business;
        
    }
    
    
    public Author createAuthor(String name){
        Author author = new Author(name);
        authorDirectory.add(author);
        return author;
        
    }
    
    
    public Author findAuthor(String name){
        for(Author a : this.authorDirectory){
            
            if(a.getName().equals(name)){
                return a;
            }
        }
        return null;
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
    
    public Boolean authorExists(String name){
        for(Author a: this.authorDirectory){
            if(a.getName().equals(name)){
                return true;
            }
        }
        return false;
    }
    

    /**
     * @return the authorDirectory
     */
    public ArrayList<Author> getAuthorDirectory() {
        return authorDirectory;
    }

    /**
     * @param authorDirectory the authorDirectory to set
     */
    public void setAuthorDirectory(ArrayList<Author> authorDirectory) {
        this.authorDirectory = authorDirectory;
    }
    
    
}
