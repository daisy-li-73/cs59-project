import java.util.ArrayList;

public class Function {
    String name;
    ArrayList<TestCase> testcases;
    int points;

    Function(String name) {
        this.name = name;
        this.testcases = new ArrayList<TestCase>();
    }

    public void addTestcase(TestCase tc) { testcases.add(tc); }
    public ArrayList<TestCase> getTestcases() { return testcases; }
    public void setPoints(int p) { points = p;}
    public int getPoints() { return points; }
}
