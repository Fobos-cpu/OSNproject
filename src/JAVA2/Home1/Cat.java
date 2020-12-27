package JAVA2.Home1;

import java.util.Random;

public class Cat implements AttemptToPassAnObstacle{

    private final double MaxLengthJump=10;
    private final double MinLengthJump=8;
    private final double MaxRun=60;
    private final double MinRun=40;
    private String name;

    protected Cat (String name) {
        this.name = name;
    }

    public double getMaxRun() {
        return MaxRun;
    }

    public double getMinRun() {
        return MinRun;
    }

    public double getMaxLengthJump() {
        return MaxLengthJump;
    }


    public String getName() {
        return name;
    }



    public void Run(String name) {

        if (Treadmill.checkTreadmill(Cat.this.name, Treadmill.calculatingMaxRun(getMinRun(), getMaxRun())) == true) {
            System.out.println(name + " ,преодолел дистанцию");
        }
        else System.out.println(name + " ,сошел с дистанции");
    }

/*  private double calculationMaxRun() {
        Random  random =new Random();
        double randMaxRun = random.nextDouble();
        return randMaxRun;
    }*/

    @Override
    public void Jump(String name) {
        System.out.println("Кот прыгнул");

    }
}
