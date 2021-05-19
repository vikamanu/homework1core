package homework1core;

public abstract class Treadmill {
    private String name;
    private int length;

    public Treadmill(String name, int length) {
        this.name = name;
        this.length = length;
    }
    public int getLength() {
        return length;
    }
}
