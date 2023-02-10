package week2;

public class FirstRecursion {
    //function fibinacci that returns the nth digit of the fibinnaci sequence
    // 0 1 1 2 3 5 8 13 21 34 55...
    public static int fib(int n){
        if (n==0){
            return 0;
        } else if (n==1){
            return 1;
        } else {
            return fib(n-1)+fib(n-2);
        }
    }

    public static int add(int a, int b){
        if (b==0){
            return a;
        } else if (b>0){
            int temp=add(a+1, b-1);
            return temp;
        } else {
            int temp=add(a-1, b+1);
            return temp;
        }
    }

    public static void main(String[] args) {
        int out=add(4,3);
        System.out.println(out);
    }
}
