package JAVA2.Lesson1.part1;

public class Cat extends Animal implements Runner,HomeAnimal{
    @Override
    public void run() {
        System.out.println("Cat run");


    }

    public static void main(String[] args) {
        var cat = new Cat();
        Dog dog = new Dog();
        var duck = new Duck();
        AirBus airBus = new AirBus();


        Runner[] animals = {cat, dog, duck};
        for (Runner ass :animals) {
            ass.method();
            
        }
        HomeAnimal[] anim = {cat, duck};
        for (HomeAnimal ass :anim) {
            ass.HomeAnimalMethod();

        }
        
        Fly[] flyers = {duck,airBus};

        cat.run();
        dog.run();


    }

    @Override
    public void homeAnimal() {

    }
}
