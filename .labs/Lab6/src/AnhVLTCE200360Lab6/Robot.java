package AnhVLTCE200360Lab6;

public interface Robot {
    void move();
    void rotate(String direction);
    String getPosition();
    String getId();
    String getDirection();
    int getX();
    int getY();
}
