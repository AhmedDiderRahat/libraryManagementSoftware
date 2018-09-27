package edu.neub.cse.project1.bean;

/**
 *
 * @author Team_DoodleArmy
 */

public class MemberInformationBean {
    
    private int member_id;
    private String member_name, address, phone, email, dob, join_date, member_type;
    
    public MemberInformationBean(int member_id, String member_name, String address,  String phone, 
            String email, String dob, String join_date, String member_type) {
        
        this.member_id = member_id;
        this.member_name = member_name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.dob = dob;
        this.join_date = join_date;
        this.member_type = member_type;
    }

    public int getMember_id() {
        return member_id;
    }

    public void setMember_id(int member_id) {
        this.member_id = member_id;
    }

    public String getMember_name() {
        return member_name;
    }

    public void setMember_name(String member_name) {
        this.member_name = member_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getJoin_date() {
        return join_date;
    }

    public void setJoin_date(String join_date) {
        this.join_date = join_date;
    }

    public String getMember_type() {
        return member_type;
    }

    public void setMember_type(String member_type) {
        this.member_type = member_type;
    }
}
