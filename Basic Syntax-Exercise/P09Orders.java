package BasicSyntaxExercise;

import java.util.Scanner;

public class P09Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int order = Integer.parseInt(scanner.nextLine());
        double orderPrice = 0;
        double totalSum = 0;

        for (int i = 1; i <=order ; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsuleCoin = Integer.parseInt(scanner.nextLine());
            orderPrice = days*capsuleCoin*pricePerCapsule;


            System.out.printf("The price for the coffee is: $%.2f%n",orderPrice);
            totalSum+=orderPrice;

        }
        System.out.printf("Total: $%.2f",totalSum);

    }
}
