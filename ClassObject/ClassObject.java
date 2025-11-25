package ClassObject;

class Cat {
    public String name;
    public int age;
    public String color;

    public Cat(String name) {
        this.name = name;
    }

    public void meow() {
        System.out.println(name + " says: Meow!");
    }
}

public class ClassObject {
    public static void main(String[] args) {

        Cat myCat = new Cat("Whiskers");

        myCat.age = 3;
        myCat.color = "Orange";

        System.out.println("Cat Name: " + myCat.name);
        System.out.println("Cat Age: " + myCat.age);
        System.out.println("Cat Color: " + myCat.color);

        myCat.meow();

    }
}
