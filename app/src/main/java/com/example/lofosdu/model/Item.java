package com.example.lofosdu.model;

public class Item {
    int id;
    String title,location,status,name,ava,eType,img,date;

    public Item(int id, String title, String location, String status, String name, String ava, String eType, String img,String date) {
        this.id = id;
        this.title = title;
        this.location = location;
        this.status = status;
        this.name = name;
        this.ava = ava;
        this.eType = eType;
        this.img = img;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getLocation() {
        return location;
    }

    public String getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }

    public String getAva() {
        return ava;
    }

    public String getDate() {
        return date;
    }

    public String geteType() {
        return eType;
    }

    public String getImg() {
        return img;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAva(String ava) {
        this.ava = ava;
    }

    public void seteType(String eType) {
        this.eType = eType;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
