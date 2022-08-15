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
public class Book {
    private int ID;
    private String name;
    private String image;
    private Publisher pid;
    private String date;
    private Author aid;
    private Seller sid;
    private String size;
    private Cover cid;
    private String description;
    private Double unitprice;
    private int unitinstock;

    public Book() {
    }

    public Book(int ID, String name, String image, Publisher pid, String date, Author aid, Seller sid, String size, Cover cid, String description, Double unitprice, int unitinstock) {
        this.ID = ID;
        this.name = name;
        this.image = image;
        this.pid = pid;
        this.date = date;
        this.aid = aid;
        this.sid = sid;
        this.size = size;
        this.cid = cid;
        this.description = description;
        this.unitprice = unitprice;
        this.unitinstock = unitinstock;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Publisher getPid() {
        return pid;
    }

    public void setPid(Publisher pid) {
        this.pid = pid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Author getAid() {
        return aid;
    }

    public void setAid(Author aid) {
        this.aid = aid;
    }

    public Seller getSid() {
        return sid;
    }

    public void setSid(Seller sid) {
        this.sid = sid;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Cover getCid() {
        return cid;
    }

    public void setCid(Cover cid) {
        this.cid = cid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(Double unitprice) {
        this.unitprice = unitprice;
    }

    public int getUnitinstock() {
        return unitinstock;
    }

    public void setUnitinstock(int unitinstock) {
        this.unitinstock = unitinstock;
    }

    
}
