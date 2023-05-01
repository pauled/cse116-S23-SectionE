package week12statePattern.hulkState;

public class Car {
    public boolean totaled;

    public Car(){
        this.totaled=false;
    }
    public void drive(boolean overweight){
        if (this.totaled){
            System.out.println("can't drive");
        } else if (overweight){
            System.out.println("thte suspension was damaged");
        } else {
            System.out.println("drive drive drivey drive drive");
        }
    }
    public void smash(){
        System.out.println( "car was totaled");
    }
}
