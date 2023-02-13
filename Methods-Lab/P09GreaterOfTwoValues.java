package MethodsLab;

import java.util.Scanner;

public class P09GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        switch (input){
            case "int":
                int firstNum = Integer.parseInt(scanner.nextLine());
                int secondNum = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(firstNum,secondNum));
                break;
            case "char":
                char firstSymbol = scanner.nextLine().charAt(0);
                char secondSymbol = scanner.nextLine().charAt(0);
                System.out.println(getMax(firstSymbol,secondSymbol));

                break;
            case "string":
                String firstText = scanner.nextLine();
                String secondText = scanner.nextLine();
                System.out.println(getMax(firstText,secondText));

                break;

        }
    }
    public static int getMax(int numFirst,int numSecond){
        if (numFirst>numSecond){
            return numFirst;
        }
        else {
            return numSecond;
        }
    }
    public static char getMax(char symOne,char symTwo){
        if (symOne>symTwo){
            return symOne;
        }
        else {
            return symTwo;
        }
    }
    public static String getMax(String textFirst,String textSecond){
        if (textFirst.compareTo(textSecond)>0){
            return textFirst;
        }
        else {
            return textSecond;
        }
    }
}
