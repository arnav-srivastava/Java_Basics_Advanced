class name {
    String name, taste;
    int size;

    // overridden
    void eat() {
        name = "fruit_name";
        taste = "fruit_taste";
        System.out.println(name + "from name class");
        System.out.println(taste + "from name class");

    }
}

class Apple extends name {
    // override
    void eat() {
        name = "Apple";
        taste = "Sweet";
        System.out.println(name);
        System.out.println(taste);

    }
}

class Orange extends name {
    // override
    void eat() {
        name = "Orange";
        taste = "sour";
        System.out.println(name);
        System.out.println(taste);

    }
}

public class fruit extends Orange{

    // Create  a base class Fruit with name ,taste and size as 
    // its attributes. Create a method called eat() which describes 
    // the name of the fruit and its taste. Inherit the same in 2 other 
    // classes Apple and Orange and override the eat() method to 
    // represent each fruit taste

    public static void main(String[] args) {
        fruit obj = new fruit();
        obj.eat();
    }

}
