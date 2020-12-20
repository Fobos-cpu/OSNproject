package JAVA21.Lesson1;

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
}
