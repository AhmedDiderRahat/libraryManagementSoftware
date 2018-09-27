
package edu.neub.cse.project1.bean;

/**
 *
 * @author Team_DoodleArmy
 */

public class BookIssueManagementBean {
    
    private int issue_id, book_id, member_id;
    private String book_title, member_name, issue_date, return_date;

    public BookIssueManagementBean(int issue_id, int book_id, int member_id, String book_title, String member_name, 
            String issue_date, String return_date) {
        this.issue_id = issue_id;
        this.book_id = book_id;
        this.member_id = member_id;
        this.book_title = book_title;
        this.member_name = member_name;
        this.issue_date = issue_date;
        this.return_date = return_date;
    }

    public BookIssueManagementBean() {
         this.issue_id = -1;
        this.book_id = -1;
        this.member_id = -1;
        this.book_title = null;
        this.member_name = null;
        this.issue_date = null;
        this.return_date = null;
    }

    public int getIssue_id() {
        return issue_id;
    }

    public void setIssue_id(int issue_id) {
        this.issue_id = issue_id;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public int getMember_id() {
        return member_id;
    }

    public void setMember_id(int member_id) {
        this.member_id = member_id;
    }

    public String getBook_title() {
        return book_title;
    }

    public void setBook_title(String book_title) {
        this.book_title = book_title;
    }

    public String getMember_name() {
        return member_name;
    }

    public void setMember_name(String member_name) {
        this.member_name = member_name;
    }

    public String getIssue_date() {
        return issue_date;
    }

    public void setIssue_date(String issue_date) {
        this.issue_date = issue_date;
    }

    public String getReturn_date() {
        return return_date;
    }

    public void setReturn_date(String return_date) {
        this.return_date = return_date;
    }
    
    
    
}
