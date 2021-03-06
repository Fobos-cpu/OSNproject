package JAVA2.Home1;

import static JAVA2.Home1.Wall.calculatingMaxJump;
import static JAVA2.Home1.Wall.checkWall;

public class Robot implements AttemptToPassAnObstacle{
    private final double MaxLengthJump=17;
    private final double MinLengthJump=12;
    private final double MaxRun=100;
    private final double MinRun=40;
    private String name;

    protected Robot(String name){
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
        return name;
    }


    @Override
    public void Run(String name) {
        if (Treadmill.checkTreadmill(Robot.this.name, Treadmill.calculatingMaxRun(getMinRun(), getMaxRun())) == true) {
            System.out.println(name + " ,преодолел дистанцию");
        }
        else System.out.println(name + " ,сошел с дистанции");
    }

    @Override
    public void Jump(String name) {
        if(checkWall(this.name,calculatingMaxJump(getMinLengthJump(),getMaxLengthJump()))==true){
            System.out.println(name + " , перепрыгнул стену");
        }
        else System.out.println(name +", не долетел");

    }
}
