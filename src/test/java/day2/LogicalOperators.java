package day2;

public class LogicalOperators {

    public static void main(String[] args) {

        int x = 20;
        int y = 10;

        System.out.println(x<y && x>10);
        System.out.println(x>y && y==10); // true  '==' comparing
        System.out.println(x>y || y==10);// true '||' OR
        System.out.println(x>30 || y==10);// true
        System.out.println(y!=10);//Not equal

        System.out.println(x<=10);
        System.out.println(x>=10);


    }
}
