package Day3;

import java.util.Scanner;

public class ArithmeticOBYMethods {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of i=" + "\nEnter the value of j=");
        int i = scanner.nextInt();
        int j = scanner.nextInt();

        int sum,sub,multi, mod;
        float div;

        sum= i+j;
        sub= i-j;
        multi= i*j;
        div= i%j;
        mod= i%j;

        System.out.println("\nsum" + i + " + " + j + " = " + sum);
         System.out.println("sub " + i + " - " + j + " = " + sub);
        System.out.println("multi" + i + " * " + j + " = " + multi);
        System.out.println("div" + i + " / " + j + " = " + div);
        System.out.println("mod" + i + " % " + j + " = " + mod);








    }

}
