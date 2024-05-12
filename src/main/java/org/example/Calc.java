package org.example;

public class Calc {
    public int summ(int a, int b){
        int result;
        result = a + b;
        //System.out.println("Sum of the  " + a + " and " + b + " equals " + result);
        System.out.printf("Sum of the %d + %d equals  % d\n", a, b, result );
        return result;
    }
    public int sub(int a, int b){
            int result;
            result = a - b;
            //System.out.println("Subtraction of the  " + a + " and " + b + " equals " + result);
            System.out.printf("Subtraction %d - %d equals  % d\n", a, b, result );
            return result;
        }
}
