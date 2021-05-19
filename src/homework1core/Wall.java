package homework1core;

public abstract class Wall {
    private String name;
    private int heigth;
    public Wall(String name, int heigth) {
        this.name = name;
        this.heigth = heigth;
    }
    public int getHeigth() {
        return heigth;
    }


}
