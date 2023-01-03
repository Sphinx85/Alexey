package IvanCode;

public class Cat implements Participant{

    private String name;
    private int jumpMeters;
    private int runMeters;
    private boolean active;

    public Cat(String name, int jumpMeters, int runMeters) {
        this.name = name;
        this.jumpMeters = jumpMeters;
        this.runMeters = runMeters;
        this.active = true;
    }

    public String getName() {
        return name;
    }

    public int getJumpMeters() {
        return jumpMeters;
    }

    public int getRunMeters() {
        return runMeters;
    }

    public void jump(){
        System.out.println(name + " подпрыгнул в воздух!");
    }

    public void run(){
        System.out.println(name + " пробежался до солнца и обратно!");
    }

    @Override
    public boolean tryJumpWall(Wall wall) {
        if (jumpMeters < wall.getMeters()){
            System.out.println(name + " не перепргынул стену");
            this.active = false;
            return false;
        } else {
            System.out.println(name + " перепрыгнул стену");
            return true;
        }
    }

    @Override
    public boolean tryRunTreadmill(Treadmill treadmill) {
        if (runMeters < treadmill.getMeters()){
            System.out.println(name + " дистанцию не осилил");
            this.active = false;
            return false;
        } else {
            System.out.println(name + " пробежал всю дистанцию");
            return true;
        }
    }

    @Override
    public boolean isActive() {
        return active;
    }
}
