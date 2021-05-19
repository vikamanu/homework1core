package homework1core;

public class Participants {
    private static int ParticipantsCount = 0;

    protected int runLimit;
    protected int jumpLimit;
    private final String name;

    public Participants(String name) {
        this.name = name;
        ParticipantsCount++;
    }

    public static int getParticipantsCount() {
        return ParticipantsCount;
    }

    public void run(int distance) {

    }


    public void jump(int distance) {

    }


    public String getName() {
        return name;
    }

}
