package MethodsExercise;

import java.util.Scanner;

public class P06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        printMiddleCharacters(text);


    }
    public static void printMiddleCharacters(String text){
        if (text.length()%2!=0){
            int indexOfMiddleCharacter = text.length()/2;
            System.out.println(text.charAt(indexOfMiddleCharacter));
        }
        else {
            int indexOfFirstMiddleSymbol=(text.length()-1)/2;
                    int indexOfSecondMiddleSymbol=text.length()/2;
            System.out.print(text.charAt(indexOfFirstMiddleSymbol));
            System.out.print(text.charAt(indexOfSecondMiddleSymbol));

        }
    }
}
