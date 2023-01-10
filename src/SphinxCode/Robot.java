package SphinxCode;

public class Robot extends Players implements PlayersInterface{

    public Robot(int jumping, int running) {
        super(jumping, running);
    }

    @Override
    public void jump(int height) {
        if (height <= getJumping()){
            System.out.println("Робот перепрыгнул");
        } else System.out.println("Робот не может прыгнуть");
    }

    @Override
    public void runny(int distance) {
        if (distance <= getRunning()){
            System.out.println("Робот пробежал");
        } else System.out.println("Робот не может пробежать");
    }
}
