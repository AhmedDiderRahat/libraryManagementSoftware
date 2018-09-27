package edu.neub.cse.project1.bean;

/**
 *
 * @author Team_DoodleArmy
 */


public class AuthorsInformationBean {
    private int author_id;
    private String author_name, contact, bio;
  
 
    public AuthorsInformationBean(int author_id, String author_name, String contact, String bio) 
    {
       this.author_id = author_id;
       this.author_name = author_name;
       this.contact = contact;
       this.bio = bio;
    }
    
    public AuthorsInformationBean(int author_id, String author_name) 
    {
       this.author_id = author_id;
       this.author_name = author_name;
    }
    
    public AuthorsInformationBean() 
    {
       this.author_id = 0;
       this.author_name = null;
       this.contact = null;
       this.bio = null;
    }

    public int getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(int author_id) {
        this.author_id = author_id;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
