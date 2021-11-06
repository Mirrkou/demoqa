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

        myCat1.getCatInfo();
        myCat1.getVoice();
        myCat1.getSleep();
        myCat1.getJump();

        myCat2.getCatInfo();
        myCat2.getVoice();
        myCat2.getSleep();
        myCat2.getJump();

        myCat3.getCatInfo();
        myCat3.getVoice();
        myCat3.getSleep();
        myCat3.getJump();

    }

}
