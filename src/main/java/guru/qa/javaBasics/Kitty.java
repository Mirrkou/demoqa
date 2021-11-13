package guru.qa.javaBasics;

public class Kitty {

    public static String commonName = "Котенок";

    String name;
    String color;
    int weight;
    int age;

    public Kitty (String name, String color, int weight, int age) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getKittyInfo() {
        System.out.println("Name: " + getName() + "\n" + "Color: " + getColor() + "\n" +
                           "Weight: " + getWeight() + "\n" + "Age: " + getAge());
    }

    //static method
    public static void sayName() {
        System.out.println(commonName);
        System.out.println(Kitty.class.getName());
    }

    // static class
    static class Face {
        static String eyesColor = "Green";

        public static void sayEyesColor() {
            System.out.println(eyesColor);
        }
    }
}
