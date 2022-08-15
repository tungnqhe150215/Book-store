/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author nqt26
 */
public class orders {
    private int id;
    private Customer cus;
    private String address;
    private String OrderDate;
    private String Shippeddate;
    private status status;

    public orders(int id, Customer cus, String address, String OrderDate, String Shippeddate,  status status) {
        this.id = id;
        this.cus = cus;
        this.address = address;
        this.OrderDate = OrderDate;
        this.Shippeddate = Shippeddate;
        this.status = status;
    }

    public orders() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCus() {
        return cus;
    }

    public void setCus(Customer cus) {
        this.cus = cus;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(String OrderDate) {
        this.OrderDate = OrderDate;
    }

    public String getShippeddate() {
        return Shippeddate;
    }

    public void setShippeddate(String Shippeddate) {
        this.Shippeddate = Shippeddate;
    }

    public status getStatus() {
        return status;
    }

    public void setStatus(status status) {
        this.status = status;
    }
    
}
