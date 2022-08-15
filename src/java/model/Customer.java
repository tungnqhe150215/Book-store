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
public class Customer {
    private int id;
    private String name;
    private String phone;
    private String email;
    private String address;
    private Account accname;

    public Customer() {
    }

    public Customer(int id, String name, String phone, String Email, String Address, Account accname) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = Email;
        this.address = Address;
        this.accname = accname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setEmail(String Email) {
        this.email = Email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String Address) {
        this.address = Address;
    }


    public Account getAccname() {
        return accname;
    }

    public void setAccname(Account accname) {
        this.accname = accname;
    }
    
}
