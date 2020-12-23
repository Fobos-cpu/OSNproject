package JAVA2.Lesson1.part1;

public interface HomeAnimal {
    void homeAnimal();
    default void HomeAnimalMethod(){
        System.out.println("Дефолтная реализация в Home");

    }
}
