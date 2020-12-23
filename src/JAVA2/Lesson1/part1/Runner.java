package JAVA2.Lesson1.part1;

public interface Runner {
    int A = 0;
    void run();

    default void method(){
        System.out.println("Дефолтная реализация");

    }
}
