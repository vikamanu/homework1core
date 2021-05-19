package homework1core;

public class Cat extends Participants {
    private static int CatCount = 0;
    public Cat(String name) {
        super(name);
        runLimit = (int) (10 + Math.random() * 20);
        jumpLimit = (int) (2 + Math.random() * 1);
        CatCount++;
    }
    @Override
    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.printf("%s is run %s \n", getName(), distance);
        } else {
            System.out.println("Cat" + getName() + " не может столько пробежать");
        }
    }
    @Override
    public void jump(int distance) {
        if (distance <= jumpLimit) {
            System.out.printf("%s is jump %s \n", getName(), distance);
        } else {
            System.out.println("Cat" + getName() + " не может так высоко прыгнуть");
        }
    }
    public static int getCatCount() {
        return CatCount;
    }
}
