package JAVA2.Home1;


public interface Treadmill extends AttemptToPassAnObstacle {
    final double DISTANCE = 40.0;

    public static void checkTreadmill(String name, double maxRun) {
        if (DISTANCE > maxRun) {
            System.out.println(name + " Не пробежал дистанцию");
        } else {
            System.out.println(name + " Пробежал дистанцию ");
        }


    }