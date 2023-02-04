package MethodsExercise;

import java.util.Scanner;

public class P05AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());

        int sum=addTwoNumbers(number1,number2);
        int subtract = subtractNym(sum,number3);
        System.out.println(subtract);

    }
    public static int addTwoNumbers(int n1,int n2){
        int result =n1+n2;
        return result;

    }
    public static int subtractNym(int n,int n3){
        return n-n3;
    }
}
