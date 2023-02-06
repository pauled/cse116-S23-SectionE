package week1;

public class Day2 {
    public static int mBT(int num){
        int out=num*2;
        return out;
    }

    public static String letter(int grade){
        int tens=grade/10;
        if (tens>=9){
            return "A";
        } else if (tens>=8){
            return "B";
        } else if (tens>=7){
            return "C";
        } else if (tens>=6){
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        int temp=mBT(2);
        temp=mBT(4);
        System.out.println(letter(98));
        System.out.println(letter(75));
        System.out.println(letter(6));

        int x=0;
        while (x<5){
            System.out.println("x: "+x);
            x+=1;
            System.out.println("-x: "+x);
        }

        for (int y=0; y<5; y+=1){
            System.out.println("y: "+y);
            int out=y;
        }
        x=x+1;
        x+=1;
        x++;//I am a coment
        /*I comment
        over multiple lines
         */
    }
}
