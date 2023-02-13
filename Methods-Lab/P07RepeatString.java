package MethodsLab;

import java.util.Scanner;

public class P07RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String textInput = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatString(textInput,number));
    }
    public  static StringBuilder repeatString(String text, int n){

        StringBuilder result= new StringBuilder();

        for (int i = 0; i <n ; i++) {
            result.append(text);
        }
        return result;
    }
}
