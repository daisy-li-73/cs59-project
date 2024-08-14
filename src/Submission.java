public class Submission {
    private String name;
    private String path;
    private String day;
    private String time;
    private int score;

    public Submission(String name, String path, String day, String time) {
        this.name = name;
        this.path = path;
        this.day = day;
        this.time = time;
        score = 0;
    }

    public String getName() { return name; }
    public String getPath() { return path; }
    public String getDay() { return day; }
    public String getTime() { return time; }
    public int getScore() { return score; }

    public void setName(String n) { name = n; }
    public void setPath(String p) { path = p; }
    public void setDay(String d) { day = d; }
    public void setTime(String t) { time = t; }
    public void setScore(int s) { score = s; }
}
