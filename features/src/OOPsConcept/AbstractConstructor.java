package OOPsConcept;
abstract class Animal {

    Animal() {
        System.out.println("Animal constructor called");
    }

    abstract void sound();
}

class Dog extends Animal {

    Dog() {
        super();
        System.out.println("Dog constructor called");
    }

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class AbstractConstructor {
    static void main() {
        Dog d = new Dog();
        d.sound();
    }
}
