package day2;

public class Calculator {
    public static void main(String[] args) { //Main Method

        Calculator calculator = new Calculator(); //Class Object

        calculator.addNumbers(303,22 );
        calculator.subNumbers(56,33);
        calculator.multiplyNumbers(456,450);
        calculator.divideNumbers(32,3);

    }

    //10//20
    public void addNumbers(int x, int y) {
        int sum = x+y;
        System.out.println("The added value is "+sum);

    }

    public void subNumbers(int x, int y){
        int sub = x-y;
        System.out.println("The Subtracted value is "+sub);
    }

    public void multiplyNumbers(int x, int y){
        int mupltipliedValue = x*y;
        System.out.println("The multiplied value is "+mupltipliedValue);
    }

    public void divideNumbers(int x, int y){
        int dividedValue = x/y;
        System.out.println("The divided value is "+dividedValue);
    }
}

