package Assignmentlevel1;

public class IndexwithinString {
    public static void main(String[] args) {
        String str="Java Exercises!";
        System.out.println("Original String=" +str);// get the character at position 0 and 10
        int index1=str.charAt(0);
        int index2=str.charAt(10);//print out the results.

        System.out.println("The character at position 0 is"  +(char) index1);
        System.out.println("The character at position 10 is"  +(char) index2);
    }

}
