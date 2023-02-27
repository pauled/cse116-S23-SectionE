package week5Testing;

public class TestCase {
    private int input1;
    private int input2;
    private int expected;

    public TestCase(int in1,int in2, int expected){
        this.input1=in1;
        this.input2=in2;
        this.expected=expected;
    }
    public int getInput1(){
        return this.input1;
    }
    public int getInput2(){
        return this.input2;
    }
    public int getExpected(){
        return this.expected;
    }
}
