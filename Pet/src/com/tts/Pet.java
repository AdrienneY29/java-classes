package com.tts;

import java.util.*;

public class Pet {

    private String name;
    private int age;
    private String location;
    private String type;

    public Pet (){
        name= "Maggie";
        age = 3;
        location = "Austin, TX";
        type = "poodle";
    }

    public Pet (String name, int age, String location, String type) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.type = type;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getType(){
        return type;
    }
    public void setType(String Type){
        this.type = type;
    }

    public static void main(String[] args) {
        // write your code here
    }
}
