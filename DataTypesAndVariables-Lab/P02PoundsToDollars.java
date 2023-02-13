package DataTypesAndVariablesLab;

import java.util.Scanner;

public class P02PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int britishPound = Integer.parseInt(scanner.nextLine());

        double dollars = britishPound*1.36;

        System.out.printf("%.3f",dollars);
    }
}
