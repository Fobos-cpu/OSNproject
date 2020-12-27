package JAVA2.Home1;

public class main {




    public static void main(String[] args) {

       Cat cat1 = new Cat("Мартин");
       Human human1 = new Human("Сергей");
       Robot robot1 = new Robot("Электроник");

       cat1.getName();
       robot1.getName();
      /* cat1.getMaxLengthJump();*/


       cat1.Run(cat1.getName());
       cat1.Jump(human1.getName());
       human1.Run(human1.getName());
       human1.Jump(human1.getName());
       robot1.Run(robot1.getName());
       robot1.Jump(robot1.getName());

    }
}
