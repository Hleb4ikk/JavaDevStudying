package com.gleb.database;

public class Human {
    private String username;
    private String password;
    private int _id;

    public Human(String username, String password, int _id){

        this.username = username;
        this.password = password;
        this._id = _id;

    }
    public void setUsername(){
        this.username = username;
    }
    public String getUsername(){
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int get_id() {
        return this._id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }
}
