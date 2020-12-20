package JAVA21.Lesson1;

public class Dog extends Animal implements Runner{
    @Override
    public void run() {
        System.out.println("Dog run");
    }
}
