
// 4. Define an abstract class Animal with an abstract method sound. Implement it in subclasses Dog and Cat.
abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks: Woof Woof");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows: Meow Meow");
    }
}

public class AbstractAnimal {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();

        Animal cat = new Cat();
        cat.sound();
    }
}
