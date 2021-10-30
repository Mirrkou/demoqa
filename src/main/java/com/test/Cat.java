package com.test;

public class Cat {

    String name;
    String color;
    int weight;
    int age;

    public void openCatInfo() {
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight);
        System.out.println("Age: " + age);
    }

    public void sleep() {
        System.out.println("Like to sleep always, lazy cat ^_^");
    }
}
