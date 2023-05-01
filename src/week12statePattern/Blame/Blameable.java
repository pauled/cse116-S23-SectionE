package week12statePattern.Blame;

public interface Blameable {
    public Blameable taskIssue();
    public Blameable quizIssue();
    public Blameable interviewIssue();
    public void applyBlame();
}
