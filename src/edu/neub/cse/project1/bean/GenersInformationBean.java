package edu.neub.cse.project1.bean;

/**
 *
 * @author Team_DoodleArmy
 */


public class GenersInformationBean {
    private int gener_id;
    private String gener_name;
 
    public GenersInformationBean(int gener_id, String gener_name) 
    {
       this.gener_id = gener_id;
       this.gener_name = gener_name;
    }
    
    public GenersInformationBean() 
    {
       this.gener_id = 0;
       this.gener_name = null;
    }

    public int getGener_id() {
        return gener_id;
    }

    public void setGener_id(int gener_id) {
        this.gener_id = gener_id;
    }

    public String getGener_name() {
        return gener_name;
    }

    public void setGener_name(String gener_name) {
        this.gener_name = gener_name;
    }
}
