package com.example.register;

public class Account {
    private String name;
    private String num;
    private String mail;
    private String pass;

    public Account(String name, String num, String mail, String pass) {
        this.name = name;
        this.num = num;
        this.mail = mail;
        this.pass = pass;
    }
    public Account(){

    }

    public String getName() {
        return name;
    }

    public String getNum() {
        return num;
    }

    public String getMail() {
        return mail;
    }

    public String getPass() {
        return pass;
    }
}
