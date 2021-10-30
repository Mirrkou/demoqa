package com.test;

public class AboutCat {

    public static void main(String[] args) {

        Cat myCat = new Cat();

        myCat.name = "Arseny";
        myCat.color = "Black";
        myCat.weight = 5;
        myCat.age = 5;

        myCat.openCatInfo();
        myCat.sleep();
    }

}
