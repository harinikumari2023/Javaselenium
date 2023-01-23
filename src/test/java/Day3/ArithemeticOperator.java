package Day3;

import java.util.Scanner;

public class ArithemeticOperator {
    public static void main(String[] args) {

        Scanner user_input= new Scanner(System.in);
        int num1,num2;

        System.out.println("Enter two numbers : ");
        num1=user_input.nextInt();
        num2=user_input.nextInt();
        System.out.println("\nAddition :"+(num1+num2));
        System.out.println("\nsubtraction :"+(num1-num2));
        System.out.println("\nDivision :"+(num1/num2));
        System.out.println("\nModulo :"+(num1%num2));




    }
}
