package com.kodilla.good.patterns.challenges;

public class ShopUser {

    private String name;
    private String secondName;
    private String addres;
    private int age;

    public ShopUser(String name, String secondName, String addres, int age) {
        this.name = name;
        this.secondName = secondName;
        this.addres = addres;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getAddres() {
        return addres;
    }

    public int getAge() {
        return age;
    }
}
