package com.example.tellex.User;

public class UserObject {

    private String uid,name,phone;

    public UserObject(String uid, String name, String phone){
        this.uid = uid;
        this.name = name;
        this.phone = phone;

    }

    public String getUid() { return uid; }

    public String getName(){
        return this.name;
    }

    public String getPhone(){
        return this.phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
