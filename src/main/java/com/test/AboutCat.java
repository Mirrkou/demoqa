package com.test;

public class AboutCat {

    public static void main(String[] args) {

        Cat myCat1 = new Cat();
        Cat myCat2 = new Cat();
        Cat myCat3 = new Cat();

        myCat1.name = "Arseny";
        myCat1.color = "Black";
        myCat1.weight = 5;
        myCat1.age = 5;

        myCat2.name = "Bruce";
        myCat2.color = "Brown";
        myCat2.weight = 2;
        myCat2.age = 2;

        myCat3.name = "Koshaka Zabiyaka";
        myCat3.color = "White";
        myCat3.weight = 3;
        myCat3.age = 7;

        myCat1.openCatInfo();
        myCat1.voice();
        myCat1.sleep();
        myCat1.jump();

        myCat2.openCatInfo();
        myCat2.voice();
        myCat2.sleep();
        myCat2.jump();

        myCat3.openCatInfo();
        myCat3.voice();
        myCat3.sleep();
        myCat3.jump();

    }

}
