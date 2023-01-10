package SphinxCode;

public class Cat extends Players implements PlayersInterface {

    public Cat(int jumping, int running) {
        super(jumping, running);
    }

    @Override
    public void jump(int height) {
        if (height <= getJumping()){
            System.out.println("Кот перепрыгнул");
        } else System.out.println("Кот не может прыгнуть");
    }

    @Override
    public void runny(int distance) {
        if (distance <= getRunning()){
            System.out.println("Кот пробежал");
        } else System.out.println("Кот не может пробежать");
    }
}
