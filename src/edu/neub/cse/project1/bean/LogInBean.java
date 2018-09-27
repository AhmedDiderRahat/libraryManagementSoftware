package edu.neub.cse.project1.bean;

/**
 *
 * @author Team_DoodleArmy
 */


public class LogInBean {
    private int admin_id;
    private String user_name;
    private  String password;
    
    public LogInBean(int admin_id, String user_name, String password) 
    {
       this.admin_id = admin_id;
       this.user_name = user_name;
       this.password = password;
    }
    
    public LogInBean() 
    {
       this.admin_id = 0;
       this.user_name = null;
       this.password = null;
    }

    public int getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(int admin_id) {
        this.admin_id = admin_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
