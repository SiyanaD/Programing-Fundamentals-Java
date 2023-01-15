package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P05PrintPartOfASCIITable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int startCoda = Integer.parseInt(scanner.nextLine());
        int endCoda = Integer.parseInt(scanner.nextLine());
        for (int i =startCoda; i <=endCoda ; i++) {
            System.out.print((char)i + " " );

        }
    }
}
