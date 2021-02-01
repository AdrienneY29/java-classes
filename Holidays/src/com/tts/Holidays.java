package com.tts;
import java.util.*;

    public class Holidays{

        private String name;
        private int cost;
        private String location;
        private String type;

        //this is empty contructor
        public Holidays (){
            name= "Exotic Beach Holiday of a Lifetime";
            cost = 5000;
            location = "Fesdu Island, Maldives";
            type = "beach";
        }
//this is constructor with 2 variables
        public Holidays (String name, int cost) {
            this.name = name;
            this.cost = cost;
        }

        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }

        public int getCost(){
            return cost;
        }
        public void setCost(int cost) {
            this.cost = cost;
        }

        public String getType(){
            return type;
        }
        public void setType(String Type){
            this.type = type;
        }
// instantiating your constructor

        Holidays holidays = new Holidays;
        holidays.name = "Exotic Beach Holiday of a Lifetime";
        holidays.cost = 5000;
        holidays.type = "beach";

        holidays.name = "Experience Best Culture in the World";
        holidays.cost = 3000;
        holidays.type = "city";

//boolean method
 public static boolean isExpensive(Holidays beach, Holidays city){
     return beach.getCost() > city.getCost();
 }

 boolean bestValue = Holidays.isExpensive("beach", "city");


 public static String helloVacationers(){
        System.out.println("Holidays are great way to give your mind a break");
 }



        public static void main(String[] args) {
            // write your code here
        }
    }


