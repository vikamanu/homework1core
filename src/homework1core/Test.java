package homework1core;

public class Test {
    public static void main(String[] args){
        Cat Cat = new Cat(" Tim");
        Human Human = new Human(" Ivan");
        Robot Robot = new Robot(" F1");

        System.out.println(Participants.getParticipantsCount());
        System.out.println(Cat.getCatCount());
        System.out.println(Human.getHumanCount());
        System.out.println(Robot.getRobotCount());
        Cat.run(50);
        Cat.jump(15);
        Human.run(10);
        Human.jump(5);
        Robot.run(15);
        Robot.jump(10);




        /* Distance CatDistance = new Distance();
        CatDistance.DistanceTitle = "metre";
        myCat.run(CatDistance);
        myCat.jump(CatDistance);

        Distance HumanDistance = new Distance();
        HumanDistance.DistanceTitle = "mile";
        myHuman.run(HumanDistance);
        myHuman.jump(HumanDistance);

        Distance RobotDistance = new Distance();
        distance.DistanceTitle = "centimetr";
        Robot.run(RobotDistance);
        Robot.jump(RobotDistance);
        */
    }
}
