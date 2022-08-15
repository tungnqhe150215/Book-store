/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author nqt26
 */
public class orderdetail {
    private orders oid;
    private Book bid;
    private int quantity;
    private double total;

    public orderdetail() {
    }

    public orderdetail(orders oid, Book bid, int quantity, double total) {
        this.oid = oid;
        this.bid = bid;
        this.quantity = quantity;
        this.total = total;
    }

    public orders getOid() {
        return oid;
    }

    public void setOid(orders oid) {
        this.oid = oid;
    }

    public Book getBid() {
        return bid;
    }

    public void setBid(Book bid) {
        this.bid = bid;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
}
