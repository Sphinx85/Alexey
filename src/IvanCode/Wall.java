package IvanCode;

public class Wall implements Barriers {

    private int meters;

    public Wall(int meters) {
        this.meters = meters;
    }

    public int getMeters() {
        return meters;
    }

    public boolean wallJump(int jumpMeters){
        if (jumpMeters < meters) {
            System.out.println("Перепрыгнуть стену не получилось");
            return false;
        } else {
            System.out.println("Пепрыгнул");
            return true;
        }
    }

    @Override
    public int meters() {
        return meters;
    }
}
