import java.util.ArrayList;
import java.util.Collections;

public class Grader {
//    hardcoding these in; on parser side, if one of these don't exist just set it to null.
    private String due_date;
    private Double late_penalty;
    private String early_time;
    private Double early_reward;
    private ArrayList<String> functions;
    private ArrayList<Submission> submissions;

    Grader(
            String due_date,
    Double late_penalty,
    String early_time,
    Double early_reward,
    ArrayList<String> functions) {
        this.due_date = due_date;
        this.late_penalty = late_penalty;
        this.early_time = early_time;
        this.early_reward = early_reward;
        this.functions = functions;
        this.submissions = new ArrayList<Submission>();
    }

    public void addSubmission(Submission s) {
        submissions.add(s);
    }

    public void setDue_date(String dd) { due_date = dd; }
    public void setLate_penalty(Double lp) { late_penalty = lp; }
    public void setEarly_time(String et) { early_time = et; }
    public void setEarly_reward(Double er) { early_reward = er; }
    public void setFunctions(ArrayList<String> f) { functions = f; }

    public String getDue_date() { return due_date; }
    public Double getLate_penalty() { return late_penalty; }
    public String getEarly_time() { return early_time; }
    public Double getEarly_reward() { return early_reward; }
    public ArrayList<String> getFunctions() { return functions; }

//    actually run the test case

    public int calc_mean() {
        int sum = 0;
        for (int i = 0; i < submissions.size(); i++) {
            Submission s = submissions.get(i);
            sum += s.getScore();
        }
        return sum / submissions.size();
    }

    public int calc_median() {
        ArrayList<Integer> scores = new ArrayList<>();
        int size = submissions.size();
        for (int i = 0; i < size; i++) {
            Submission s = submissions.get(i);
            scores.add(s.getScore());
        }
        Collections.sort(scores);

        if (size % 2 == 0) {
            return (scores.get(size%2) + scores.get((size%2) - 1)) / 2;
        }
        else {
            return scores.get( size / 2);
        }
    }

    public int calc_range() {
        ArrayList<Integer> scores = new ArrayList<>();
        int size = submissions.size();
        for (int i = 0; i < size; i++) {
            Submission s = submissions.get(i);
            scores.add(s.getScore());
        }
        Collections.sort(scores);
        return scores.get(size-1) - scores.get(0);
    }


}
