package JAVA21.Lesson1.part1;

public class Animal {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Animal[]animals = {
                cat,
                new Dog(),
                new Duck(),
        };
    }
}
