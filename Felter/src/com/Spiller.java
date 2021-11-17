package com;

public class Spiller {
    private String name;
    private int age;
    private int money = 35;
    private int position;
    String property;

    public Spiller(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getName(){
        return name;
    }

    public int getMoney(){
        return  money;
    }

    public int getPosition(){
        return position;
    }

    public String getProperty(){
        return property;
    }

    public void updateMoney(int beløb){
        money += beløb;
    }


}