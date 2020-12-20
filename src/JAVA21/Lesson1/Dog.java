package JAVA21.Lesson1;

public class Dog extends Animal implements Runner,HomeAnimal{
    @Override
    public void run() {
        System.out.println("Dog run");
    }

    @Override
    public void homeAnimal() {

    }
}
