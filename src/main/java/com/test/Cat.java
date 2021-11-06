package com.test;

public class Cat {

    String name;
    String color;
    int weight;
    int age;

    public void getCatInfo() {
        System.out.println("Name: " + name + "\n" + "Color: " + color +
                           "\n" + "Weight: " + weight + "\n" + "Age: " + age);
    }

    public void getVoice() {
        if (name.equals("Bruce")) {
            System.out.println("Voice: " + "...myao myao myao...");
        }
        else if (name.equals("Arseny")) {
            System.out.println("Voice: " + "...ph ph ph ph ph ph...");
        }
        else {
            System.out.println("Voice: " + "...I don't talk to people, understand? -_-...");
        }
    }

    public void getSleep() {
        if (name.equals("Bruce")) {
            System.out.println("Sleep: " + "...hhhrrr hhhrrr...");
        }
        else if (name.equals("Arseny")) {
            System.out.println("Sleep: " + "...pfuuu pfuuu ...");
        }
        else {
            System.out.println("Sleep: \n"
                               + "Cat: If you buy me a fish, I'll go to sleep :smirk_cat:\n"
                               + "I: No\n"
                               + "Cat: I am the Queen of Great Britain -_-\n"
                               + "I: What? 0_o");
        }
    }

    public void getJump() {
        if (name.equals("Bruce")) {
            System.out.println("Jump: " + "...pump pump...");
        }
        else if (name.equals("Arseny")) {
            System.out.println("Jump: " + "...BAAADAAAMS...");
        }
        else {
            System.out.println("Jump: " + "...Are you in your mind? ...crazy woman -_-...");
        }
    }
}
