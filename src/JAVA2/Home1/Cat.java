package JAVA2.Home1;

import java.util.Random;

public class Cat implements AttemptToPassAnObstacle{

    private final double MaxLengthJump=10;
    private String name;

    protected Cat (String name) {
        this.name = name;
    }

    public double getMaxLengthJump() {
        return MaxLengthJump;
    }


    public String getName() {
        return name;
    }



    public void Run(String name) {

    Treadmill.checkTreadmill(Cat.this.name,calculationMaxRun() );

    }

  private double calculationMaxRun() {
        Random  random =new Random();
        double randMaxRun = random.nextDouble();
        return randMaxRun;
    }

    @Override
    public void Jump() {
        System.out.println("Кот прыгнул");

    }
}
