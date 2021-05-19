package homework1core;

public class Robot extends Participants {
    private static int RobotCount = 0;


    public Robot(String name) {
        super(name);

        runLimit = (int) (15 + Math.random() * 50);
    jumpLimit = 0;
    RobotCount++;
}
    @Override
    public void run(int distance) {
        if (distance <= runLimit){
            System.out.printf("%s is run %s \n", getName(), distance);
        } else {
            System.out.println("Robot" + getName() + "устал");
        }
    }
    @Override
    public void jump(int distance){
        throw new RuntimeException("Роботы не умеют прыгать!");


    }
    public static int getRobotCount() {
        return RobotCount;
    }

}
