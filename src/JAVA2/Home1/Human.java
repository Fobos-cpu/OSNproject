package JAVA2.Home1;

import static JAVA2.Home1.Wall.calculatingMaxJump;
import static JAVA2.Home1.Wall.checkWall;

public class Human implements AttemptToPassAnObstacle{

    private final double MaxLengthJump=18;
    private final double MinLengthJump=11;
    private final double MaxRun=90;
    private final double MinRun=50;
    private String name;

    protected Human (String name){
        this.name = name;
    }

    public double getMaxLengthJump() {
        return MaxLengthJump;
    }

    public double getMinLengthJump() {
        return MinLengthJump;
    }
    public double getMaxRun() {
        return MaxRun;
    }

    public double getMinRun() {
        return MinRun;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void Run(String name) {
        if (Treadmill.checkTreadmill(Human.this.name, Treadmill.calculatingMaxRun(getMinRun(), getMaxRun())) == true) {
            System.out.println(name + " ,преодолел дистанцию");
        }
        else System.out.println(name + " ,сошел с дистанции");
    }

    @Override
    public void Jump(String name) {
        if(Wall.checkWall(Human.this.name,calculatingMaxJump(getMinLengthJump(),getMaxLengthJump()))==true){
            System.out.println(name + " , перепрыгнул стену");
        }
        else System.out.println(name +", не долетел");
    }

}
