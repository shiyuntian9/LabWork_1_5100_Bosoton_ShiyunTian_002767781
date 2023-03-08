/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Genre;

import Author.Author;
import Material.Book;
import Business.Business;
import java.util.ArrayList;

/**
 *
 * @author tianshiyun
 */
public class GenreDirectory {
    private ArrayList<Genre> genreList;
    Business business;
    
    public GenreDirectory(){
        
    }
    
    public GenreDirectory(ArrayList<Genre> genreList){
        this.genreList  =new ArrayList<>();
        this.business = business;
        
    }
    
    
        
    public Genre createGenre(String name){
        Genre genre = new Genre(name);
        genreList.add(genre);
        return genre;
        
    }
    
    
    public Genre findGenre(String name){
        for(Genre g : this.genreList){
            
            if(g.getName().equals(name)){
                return g;
            }
        }
        return null;
    } 
    
    public ArrayList getGenreBook(String name){
        ArrayList<Book> book = new ArrayList<>();
        for(Book b: business.getBookDirectory().getBookDirectory()){
            if(b.getAuthor().equals(name)){
                book.add(b);
            }
        }
        return book;
    }
    
    public Boolean authorExists(String name){
        for(Genre a: this.genreList){
            if(a.getName().equals(name)){
                return true;
            }
        }
        return false;
    }

    /**
     * @return the genreList
     */
    public ArrayList<Genre> getGenreList() {
        return genreList;
    }

    /**
     * @param genreList the genreList to set
     */
    public void setGenreList(ArrayList<Genre> genreList) {
        this.genreList = genreList;
    }
    
    
}
