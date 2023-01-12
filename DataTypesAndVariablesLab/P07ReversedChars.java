package DataTypesAndVariablesLab;

import java.util.Scanner;

public class P07ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        char ch1 = scanner.nextLine().charAt(0);
        char ch2 = scanner.nextLine().charAt(0);
        char ch3 = scanner.nextLine().charAt(0);

        System.out.printf("%s %s %s ",ch3,ch2,ch1);
    }
}
