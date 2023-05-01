package week12statePattern.studentState;

public abstract class MentalState {
    protected Student brain;

    public MentalState(Student brain){
        this.brain=brain;
    }
    public abstract void study();
    public abstract void getCloserToExam();
    public abstract void expressFeelings();
}
