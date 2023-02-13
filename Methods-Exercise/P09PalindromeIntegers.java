package MethodsExercise;

import java.util.Scanner;

public class P09PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();
        while (!number.equals("END")){

            if (isPalindrome(number)){
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }

            number = scanner.nextLine();
        }
    }
    public  static boolean isPalindrome(String text){
        String reversedText = "";
        for (int index = text.length()-1; index >=0 ; index--) {
            reversedText+=text.charAt(index);

        }
        return text.equals(reversedText);

    }
}
