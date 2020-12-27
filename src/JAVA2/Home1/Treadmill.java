package JAVA2.Home1;


import java.util.Random;

public interface Treadmill extends AttemptToPassAnObstacle {
    final double DISTANCE = 50.0;

    static boolean checkTreadmill(String name, double maxRun) {
        if (DISTANCE > maxRun) {
            return false;
        } else {
            return true;
        }


    }

    static double calculatingMaxRun(double min, double max) {
        Random random = new Random();
        double range = max-min;
        double randMaxPreRun = random.nextDouble()*range;
        double randMaxRun = randMaxPreRun+min;
        System.out.println(randMaxRun);
        return randMaxRun;
    }
}