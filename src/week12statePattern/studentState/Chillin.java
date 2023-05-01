package week12statePattern.studentState;

public class Chillin extends MentalState{
    public Chillin(Student student){
        super(student);
    }
    public void study(){
        System.out.println("I am such a good student I study when I don't have to");
    }
    public void getCloserToExam(){
        System.out.println("I already passed, no big deal");
    }
    public void expressFeelings(){
        System.out.println("I AM DONE!");
    }
}
