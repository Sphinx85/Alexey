package SphinxCode;

public abstract class Players {

    int jumping;
    int running;

    public Players(int jumping, int running) {
        this.jumping = jumping;
        this.running = running;
    }

    public int getJumping() {
        return jumping;
    }

    public int getRunning() {
        return running;
    }

}
