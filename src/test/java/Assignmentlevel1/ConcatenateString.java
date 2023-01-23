package Assignmentlevel1;

public class ConcatenateString {
    public static void main(String[] args) {
        String str1=" PHP Excercises and ";
        String str2="Phyton Eercises";

        System.out.println("String1: " +str1);
        System.out.println("string2: "+str2);

        String str3=str1.concat(str2);//Concatenate the two strings together.
        System.out.println("The concatenated string:" +str3);


    }
}
