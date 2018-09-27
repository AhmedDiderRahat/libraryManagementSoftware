package edu.neub.cse.project1.bean;

/**
 *
 * @author Team_DoodleArmy
 */


public class MemberPaymentBean {
    private int payment_id, member_id, amount;
    private String member_name, payment_date;

    public MemberPaymentBean(int payment_id, int member_id, int amount, String member_name, String payment_date) {
        this.payment_id = payment_id;
        this.member_id = member_id;
        this.amount = amount;
        this.member_name = member_name;
        this.payment_date = payment_date;
    }

    public int getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(int payment_id) {
        this.payment_id = payment_id;
    }

    public int getMember_id() {
        return member_id;
    }

    public void setMember_id(int member_id) {
        this.member_id = member_id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getMember_name() {
        return member_name;
    }

    public void setMember_name(String member_name) {
        this.member_name = member_name;
    }

    public String getPayment_date() {
        return payment_date;
    }

    public void setPayment_date(String payment_date) {
        this.payment_date = payment_date;
    }
    
    
}
