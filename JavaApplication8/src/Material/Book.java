/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Material;

/**
 *
 * @author tianshiyun
 */
public class Book extends Material{
    private String genre;
    private String author;
    private String name;
    private String status;
    private String language;
    private int pageNo;
    private String binding;
    
    public Book(){
        super();
        
    }
    public Book(String serialNumber, String name, String date,Boolean availability, String type){
        super(serialNumber, name, date, availability, type);
    }
    
    public Book(String genre, String author,String name){
        this.author = author;
        this.genre = genre;
        this.name = name;
        
    }

    /**
     * @return the genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
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
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * @param language the language to set
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * @return the pageNo
     */
    public int getPageNo() {
        return pageNo;
    }

    /**
     * @param pageNo the pageNo to set
     */
    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    /**
     * @return the binding
     */
    public String getBinding() {
        return binding;
    }

    /**
     * @param binding the binding to set
     */
    public void setBinding(String binding) {
        this.binding = binding;
    }
    
}
