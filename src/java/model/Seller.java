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
public class Seller {
    private int id;
    private String name;
    private String phone;
    private String email;
    private String address;
    private Account accname;

    public Seller() {
    }

    public Seller(int ID, String name) {
        this.id = ID;
        this.name = name;
    }

    public Seller(int ID, String name, String phone, String email, String placeofreceipt, Account accname) {
        this.id = ID;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = placeofreceipt;
        this.accname = accname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public Account getAccname() {
        return accname;
    }

    public void setAccname(Account accname) {
        this.accname = accname;
    }
    
}
