package week12statePattern.Blame;

public class Paul implements Blameable{
    public Blameable taskIssue(){
        System.out.println("Back to Jesse, as it should be");
        return new Jesse();
    }
    public Blameable quizIssue(){
        System.out.println("there must be some mistake");
        return this;
    }
    public Blameable interviewIssue(){
        System.out.println("there must be some mistake");
        return this;
    }
    public void applyBlame(){
        System.out.println("It's still Jesse's fault");
    }
}
