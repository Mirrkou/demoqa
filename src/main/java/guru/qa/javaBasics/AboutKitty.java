package guru.qa.javaBasics;

import guru.qa.javaBasics.Kitty.Face;

public class AboutKitty {

    public static void main(String[] args) {

        Kitty mySmallKitty = new Kitty("Bruce" , "Brown", 2, 2);
        Kitty myBigKitty = new Kitty("Arseny" , "Black", 5, 5);

        mySmallKitty.getKittyInfo();
        myBigKitty.getKittyInfo();

        // setters check
        System.out.println("Old data" + "\n" +
                           "Name: " + mySmallKitty.getName() + "\n" +
                           "Color: " + mySmallKitty.getColor() + "\n" +
                           "Weight: " + mySmallKitty.getWeight() + "\n" +
                           "Age: " + mySmallKitty.getAge());
        mySmallKitty.setName("Koshaka Zabiyaka");
        mySmallKitty.setColor("White");
        mySmallKitty.setWeight(3);
        mySmallKitty.setAge(3);
        System.out.println("New data" + "\n" +
                           "Name: " + mySmallKitty.getName() + "\n" +
                           "Color: " + mySmallKitty.getColor() + "\n" +
                           "Weight: " + mySmallKitty.getWeight() + "\n" +
                           "Age: " + mySmallKitty.getAge());

        Kitty.sayName();
        mySmallKitty.commonName = "Не котенок";
        System.out.println(Kitty.commonName);

        Kitty.Face face = new Kitty.Face();
        face.sayEyesColor();

    }
}
