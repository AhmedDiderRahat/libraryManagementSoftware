
package edu.neub.cse.project1.bean;

/**
 *
 * @author Team_DoodleArmy
 */

public class BookInformationBean {
    
    private int book_id, quentity, pub_id, au_id, gener_id;
    private String title, catagory, author, publisher, gener, pub_address, pub_description;

    public BookInformationBean(int book_id, int quentity, int pub_id, int au_id, String title, String catagory, String author, String publisher) {
        this.book_id = book_id;
        this.quentity = quentity;
        this.pub_id = pub_id;
        this.au_id = au_id;
        this.title = title;
        this.catagory = catagory;
        this.author = author;
        this.publisher = publisher;
    }
    
    public BookInformationBean(int book_id, String title, String gener, int quentity, 
            String author, String publisher, String pub_address, String pub_description){
        this.book_id = book_id;
        this.quentity = quentity;
        this.title = title;
        this.gener = gener;
        this.author = author;
        this.publisher = publisher;
        this.pub_address = pub_address;
        this.pub_description = pub_description;
    }
    
    public BookInformationBean(int book_id, String title, String cetagory, int quentity, 
        String author, String publisher){
        this.book_id = book_id;
        this.title = title;
        this.catagory = cetagory;
        this.quentity = quentity;        
        this.author = author;
        this.publisher = publisher;
    }
    
        public BookInformationBean(){
        this.book_id = -1;
        this.title = null;
        this.catagory = null;
        this.quentity = -1;        
        this.author = null;
        this.publisher = null;
        this.au_id = -1;
        this.gener_id = -1;
        this.pub_id = -1;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public int getQuentity() {
        return quentity;
    }

    public void setQuentity(int quentity) {
        this.quentity = quentity;
    }

    public int getPub_id() {
        return pub_id;
    }

    public void setPub_id(int pub_id) {
        this.pub_id = pub_id;
    }

    public int getAu_id() {
        return au_id;
    }

    public void setAu_id(int au_id) {
        this.au_id = au_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCatagory() {
        return catagory;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    } 

    public int getGener_id() {
        return gener_id;
    }

    public void setGener_id(int gener_id) {
        this.gener_id = gener_id;
    }

    public String getGener() {
        return gener;
    }

    public void setGener(String gener) {
        this.gener = gener;
    }

    public String getPub_address() {
        return pub_address;
    }

    public void setPub_address(String pub_address) {
        this.pub_address = pub_address;
    }

    public String getPub_description() {
        return pub_description;
    }

    public void setPub_description(String pub_description) {
        this.pub_description = pub_description;
    }
    
    
}
