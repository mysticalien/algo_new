package pac2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball();
        System.out.println(ball);

        ball.setXY(2.0, 3.0);

        ball.move(1.5, -0.5);

        System.out.println(ball);
    }
}
