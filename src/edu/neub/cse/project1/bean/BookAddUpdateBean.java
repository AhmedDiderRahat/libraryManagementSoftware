package edu.neub.cse.project1.bean;

/**
 *
 * @author Team_DoodleArmy
 */
public class BookAddUpdateBean {

    private int bw_id, book_id, au_id;

    public BookAddUpdateBean(int bw_id, int book_id, int au_id) {
        this.bw_id = bw_id;
        this.book_id = book_id;
        this.au_id = au_id;
    }

    public BookAddUpdateBean() {
        this.bw_id = 0;
        this.book_id = 0;
        this.au_id = 0;
    }

    public int getBw_id() {
        return bw_id;
    }

    public void setBw_id(int bw_id) {
        this.bw_id = bw_id;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public int getAu_id() {
        return au_id;
    }

    public void setAu_id(int au_id) {
        this.au_id = au_id;
    }
}
