/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author nqt26
 */
public class item {
    private Book bookid;
    private Customer cusid;
    private int quantity;

    public item() {
    }

    public item(Book bookid, Customer cusid, int quantity) {
        this.bookid = bookid;
        this.cusid = cusid;
        this.quantity = quantity;
    }

    public Book getBookid() {
        return bookid;
    }

    public void setBookid(Book bookid) {
        this.bookid = bookid;
    }

    public Customer getCusid() {
        return cusid;
    }

    public void setCusid(Customer cusid) {
        this.cusid = cusid;
    }

    

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
