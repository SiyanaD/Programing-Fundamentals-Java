package ArraysLab;

import java.util.Scanner;

public class P05ConcatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String secondName = scanner.nextLine();
        String delimiter = scanner.nextLine();

        String result = String.format("%s%s%s",firstName,delimiter,secondName);

        System.out.println(result);

    }
}
