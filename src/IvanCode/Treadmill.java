package IvanCode;

public class Treadmill implements Barriers{

    private int meters;

    public Treadmill(int meters) {
        this.meters = meters;
    }

    public int getMeters() {
        return meters;
    }

    public boolean treadmillRun(int runMeters){
        if (runMeters < meters) {
            System.out.println("Дистанцию не осилил");
            return false;
        } else {
            System.out.println("Пробежал");
            return true;
        }
    }

    @Override
    public int meters() {
        return meters;
    }
}
