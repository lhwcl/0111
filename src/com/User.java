package com;

public class User {
    private int id;
    private String name;

//使用构造方法
    public User(){
        this(123,"susan");
    }

    public User(int id,String name){
        this.id=id;
        this.name=name;
    }
    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }




}