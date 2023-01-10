package SphinxCode;

public class RunObstacles {
    static Wall wall = new Wall(2);
    static Treadmill treadmill = new Treadmill(12);
    static int random = (int) (Math.random()*20);

    public static void main(String[] args) {
        int count = 100;
        while (count > 0){
            new Cat(random,random).jump(wall.getHeight());
            new Cat(random,random).runny(treadmill.getDistance());
            new Human(random,random).jump(wall.getHeight());
            new Human(random,random).runny(treadmill.getDistance());
            new Robot(random,random).jump(wall.getHeight());
            new Robot(random,random).runny(treadmill.getDistance());
            count--;
        }

    }
}
