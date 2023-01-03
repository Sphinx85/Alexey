package IvanCode;

public interface Participant {

    boolean tryJumpWall(Wall wall);
    boolean tryRunTreadmill(Treadmill treadmill);

    boolean isActive();
}
