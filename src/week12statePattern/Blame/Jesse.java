package week12statePattern.Blame;

public class Jesse implements Blameable{
    public Blameable taskIssue(){
        System.out.println("Add one more on the Jesse pile");
        return this;
    }
    public Blameable quizIssue(){
        System.out.println("this 'maybe' shifts to Paul");
        return new Paul();
    }
    public Blameable interviewIssue(){
        System.out.println("this 'maybe' shifts to Paul");
        return new Paul();
    }
    public void applyBlame(){
        System.out.println("It's Jesse's fault");
    }
}
