package JAVA2.Lesson1.part1;

public class Duck extends Animal implements Runner,Fly,HomeAnimal {
    @Override
    public void run() {
        System.out.println("Утка бегает");

    }

    @Override
    public void fly() {
        System.out.println("Утка Летает");
    }

    @Override
    public void homeAnimal() {

    }

    @Override
    public void method() {
        System.out.println("Метод утки");
    }


    @Override
    public void HomeAnimalMethod() {
        System.out.println("Хоме метод собаки");

    }
}
