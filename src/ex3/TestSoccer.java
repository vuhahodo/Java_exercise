package ex3;

public class TestSoccer {
    public static void main(String[] args) {
        Ball ball = new Ball(0, 0, 0);
        Player p1 = new Player(7, 2, 2);
        Player p2 = new Player(10, 20, 20);

        System.out.println("Initial Ball Position: " + ball);
        System.out.println(p1);
        System.out.println(p2);

        System.out.println("\nPlayer 7 tries to kick the ball:");
        p1.kick(ball);
        System.out.println("Ball Position after kick: " + ball);

        System.out.println("\nPlayer 10 tries to kick the ball:");
        p2.kick(ball);
        System.out.println("Ball Position after kick: " + ball);
    }
}

