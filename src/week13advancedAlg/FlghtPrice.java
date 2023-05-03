package week13advancedAlg;

public class FlghtPrice implements Cost<Flight>{
    public double cost(Flight flight){
        return flight.getPrice();
    }
}
