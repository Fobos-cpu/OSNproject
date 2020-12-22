package JAVA21.Lesson1.part1;

public interface HomeAnimal {
    void homeAnimal();
    default void HomeAnimalMethod(){
        System.out.println("Дефолтная реализация в Home");

    }
}
