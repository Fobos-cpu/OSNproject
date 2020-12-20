package JAVA21.Lesson1;

public class Duck extends Animal implements Runner,Fly {
    @Override
    public void run() {
        System.out.println("Утка бегает");

    }

    @Override
    public void fly() {
        System.out.println("Утка Летает");
    }
}
