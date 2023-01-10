package SphinxCode;

public class Human extends Players implements PlayersInterface{

    public Human(int jumping, int running) {
        super(jumping, running);
    }

    @Override
    public void jump(int height) {
        if (height <= getJumping()){
            System.out.println("Человек перепрыгнул");
        } else System.out.println("Человек не может прыгнуть");
    }

    @Override
    public void runny(int distance) {
        if (distance <= getRunning()){
            System.out.println("Человек пробежал");
        } else System.out.println("Человек не может пробежать");
    }
}
