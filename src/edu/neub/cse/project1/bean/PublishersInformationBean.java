package edu.neub.cse.project1.bean;

/**
 *
 * @author Team_DoodleArmy
 */


public class PublishersInformationBean {
    private int publisher_id;
    private String publisher_name, address, description;
  
 
    public PublishersInformationBean(int publisher_id, String publisher_name, String address, String description) 
    {
       this.publisher_id = publisher_id;
       this.publisher_name = publisher_name;
       this.address = address;
       this.description = description;
    }
    
    public PublishersInformationBean() 
    {
       this.publisher_id = 0;
       this.publisher_name = null;
       this.address = null;
       this.description = null;
    }

    public int getPublisher_id() {
        return publisher_id;
    }

    public void setPublisher_id(int publisher_id) {
        this.publisher_id = publisher_id;
    }

    public String getPublisher_name() {
        return publisher_name;
    }

    public void setPublisher_name(String publisher_name) {
        this.publisher_name = publisher_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
