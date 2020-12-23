package JAVA2.Lesson1.part2;

public class main {
    public static void main(String[] args) {
        Dog dog1 = new Dog(Color.RED);
        Dog dog2 = new Dog(Color.BLACK);

        System.out.println(dog1.getColor().getRussianColor());
        System.out.println(dog1.getColor());

    }


}
