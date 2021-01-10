import processing.core.PApplet;

public class MovingBalls extends PApplet {
    final int HEIGHT = 480;
    final int WIDTH = 650;
    final int DIAMETER = 20;
    int[] xCoordinate;
    int[] yCoordinate;

    public static void main(String[] args) {
        PApplet.main("MovingBalls", args);
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        xCoordinate = new int[]{0, 0, 0, 0};
        yCoordinate = new int[]{HEIGHT / 5, 2 * HEIGHT / 5, 3 * HEIGHT / 5, 4 * HEIGHT / 5};
    }

    @Override
    public void draw() {
        for (int i = 0; i < 4; i++) {
            drawBall(i);
            findNewX(i);
        }
    }

    private void drawBall(int i) {
        ellipse(xCoordinate[i], yCoordinate[i], DIAMETER, DIAMETER);
    }

    private void findNewX(int i) {
        xCoordinate[i] += i + 1;
    }
}