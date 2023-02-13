package MethodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P11MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstInput = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int secondInput = Integer.parseInt(scanner.nextLine());
        DecimalFormat df = new DecimalFormat("0.##");

        System.out.println(df.format(MathOperations(firstInput,operator,secondInput)));


    }
    public static double MathOperations(int firstNum, String operation, int secondNum){
        double result = 0;
        switch (operation){
            case "/":
                result =firstNum*1.0/secondNum;

                break;
            case  "*":
                result = firstNum*secondNum;

                break;
            case  "+":
                result = firstNum+secondNum;


                break;
            case "-":
                result = Math.abs(firstNum-secondNum);


                break;

        }
        return result;

    }
}
