package homework1core;

public class Human extends Participants {
    private static int HumanCount = 0;
    public Human(String name) {
        super(name);
        runLimit = (int) (20 + Math.random() * 50);
        jumpLimit = (int) (1 + Math.random() * 0);
        HumanCount++;
    }
    @Override
    public void run(int distance){
        if (distance <= runLimit){
        System.out.printf("%s is run %s \n", getName(), distance);
    } else{
            System.out.println("Human" + getName() + " не может столько пробежать");
        }
    }
    @Override
    public void jump(int distance){
        if (distance <= jumpLimit){
        System.out.printf("%s is jump %s \n", getName(), distance);
    } else {
            System.out.println("Human" + getName() + " не может так высоко прыгнуть");
        }
    }
    public static int getHumanCount() {
        return HumanCount;
    }
}
