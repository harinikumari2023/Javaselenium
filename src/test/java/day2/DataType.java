package day2;

public class DataType {
    public static void main(String[] args) {

        int age; // Var Declaration
         age=2; // Var Initialization

        int pincode = 123456789; //Only whole number.(float for decimal) Store upto 10numbers.
        long aadhar =23456797345678l;//Suffix'l' memory will increase internally. Store upto 19 numbers.
        short pin = 12345;// Rear store upto 5 numbers.
        float weight =88.8f;// Suffix 'f', not mandatory in whole number to add 'f' &accepts both number and decimal
        double rate = 234566.345;//
        char ch ='x';
        boolean wfh = true;



        System.out.println("Age: "+age);// concatination(adding 2 strings)

        System.out.println("pincode: "+pincode);
        System.out.println("Aadhar: "+aadhar);
        System.out.println("pin: "+pin);
        System.out.println("Weight: "+weight);
        System.out.println("Rate: "+rate);
        System.out.println("Char: "+ch);



    }



}
