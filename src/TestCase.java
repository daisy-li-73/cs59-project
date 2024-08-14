import java.util.ArrayList;

public class TestCase {
    int points;
    ArrayList<String> parameters;

    TestCase(ArrayList<String> parameters, int points) {
        this.parameters = parameters;
        this.points = points;
    }

    public int getPoints() { return points; }
}
