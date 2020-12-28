package JAVA2.Home1;

import java.util.Random;

public interface Wall extends AttemptToPassAnObstacle{

    final double wallHi = 15.0;

    static boolean checkWall(String name,double randMaxJump){
    if (wallHi<randMaxJump){
        /*System.out.println(name + " , преодолел стену");*/
        return true;
    }else {/*System.out.println(name+ " , не перепрыгнул");*/
    return false;
    }
    }
    static double calculatingMaxJump(double min, double max) {
        Random random = new Random();
        double range = max-min;
        double randMaxPreJump = random.nextDouble()*range;
        double randMaxJump = randMaxPreJump+min;
        /*System.out.println(randMaxJump);*/
        return randMaxJump;
    }



}
