/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Material;

/**
 *
 * @author tianshiyun
 */
public class MaterialDirectory {
    private BookDirectory bookDirectory;
    private MagazineDirectory magazineDirectory;
    
    
    public MaterialDirectory(){
        
    }
    
    public MaterialDirectory(BookDirectory bookDirectory,MagazineDirectory magazineDirectory){
        this.bookDirectory = bookDirectory;
        this.magazineDirectory = magazineDirectory;
        
    }

    /**
     * @return the bookDirectory
     */
    public BookDirectory getBookDirectory() {
        return bookDirectory;
    }

    /**
     * @param bookDirectory the bookDirectory to set
     */
    public void setBookDirectory(BookDirectory bookDirectory) {
        this.bookDirectory = bookDirectory;
    }

    /**
     * @return the magazineDirectory
     */
    public MagazineDirectory getMagazineDirectory() {
        return magazineDirectory;
    }

    /**
     * @param magazineDirectory the magazineDirectory to set
     */
    public void setMagazineDirectory(MagazineDirectory magazineDirectory) {
        this.magazineDirectory = magazineDirectory;
    }
    
    
}
