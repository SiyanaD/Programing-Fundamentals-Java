package DataTypesAndVariablesLab;

import java.util.Scanner;

public class P01ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        double kilometers =number/1000.0;

        System.out.printf("%.2f",kilometers);
    }
}
