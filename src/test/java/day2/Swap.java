package day2;

public class Swap {
    public static void main(String[] args) {

        int a = 10;
        int b = 100;
        Swap swap = new Swap();
        System.out.println("To start with a= "+a+ " and b= "+b);
        System.out.println("Calling Swap NOW!!");
        swap.swapNumbers(a,b);
    }

    public void swapNumbers(int x, int y) {

        int a1 = x;
        int b1 = y;
        int c1;

         c1 = a1;
         a1 = b1;
         b1 = c1;

        System.out.println("After the swap");
        System.out.println("NOW a is "+a1);
        System.out.println("AND b is "+b1);




    }
}
