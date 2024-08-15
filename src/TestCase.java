import java.util.ArrayList;

public class TestCase {
    int points;
    int[] parameters;

    TestCase(int[] parameters, int points) {
        this.parameters = parameters;
        this.points = points;
    }

    public int getPoints() { return points; }
}
