package week12statePattern.studentState;

public class Panic extends MentalState{
    public Panic(Student student){
        super(student);
    }
    public void study(){
        this.brain.setState(new Calm(this.brain));
    }
    public void getCloserToExam(){
        System.out.println("all my drinks are shaken, not stirred");
    }
    public void expressFeelings(){
        System.out.println("I AM FREAKING OUT!");
    }
}
