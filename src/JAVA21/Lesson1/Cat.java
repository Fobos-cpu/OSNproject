package JAVA21.Lesson1;

public class Cat extends Animal implements Runner,HomeAnimal{
    @Override
    public void run() {
        System.out.println("Cat run");


    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        var dog = new Dog();
        var duck = new Duck();
        AirBus airBus = new AirBus();


        Runner[] animals = {cat, dog, duck};
        Fly[] flyers = {duck,airBus};

    }

    @Override
    public void homeAnimal() {

    }
}
