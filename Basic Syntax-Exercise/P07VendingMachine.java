package BasicSyntaxExercise;

import java.util.Scanner;

public class P07VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double sumCoins = 0;

        while (!input.equals("Start")) {

            double coins = Double.parseDouble(input);

            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2) {
                sumCoins += coins;
            } else {
                System.out.printf("Cannot accept %.2f%n", coins);
            }
            input = scanner.nextLine();
        }
        input = scanner.nextLine();

        while (!input.equals("End")) {
            if (input.equals("Nuts")) {
                if (sumCoins < 2) {
                    System.out.println("Sorry, not enough money");
                } else {
                    System.out.printf("Purchased %s%n", input);
                    sumCoins -= 2;
                }

            } else if (input.equals("Water")) {
                if (sumCoins < 0.7) {
                    System.out.println("Sorry, not enough money");
                } else {
                    System.out.printf("Purchased %s%n", input);
                    sumCoins -= 0.7;
                }


            } else if (input.equals("Crisps")) {
                if (sumCoins < 1.5) {
                    System.out.println("Sorry, not enough money");
                } else {
                    System.out.printf("Purchased %s%n", input);
                    sumCoins -= 1.5;
                }


            } else if (input.equals("Soda")) {
                if (sumCoins < 0.8) {
                    System.out.println("Sorry, not enough money");
                } else {
                    System.out.printf("Purchased %s%n", input);
                    sumCoins -= 0.8;
                }

            } else if (input.equals("Coke")) {
                if (sumCoins < 1) {
                    System.out.println("Sorry, not enough money");
                } else {
                    System.out.printf("Purchased %s%n", input);
                    sumCoins -= 1;
                }

            }
                else {
                System.out.println("Invalid product");

                }

                input = scanner.nextLine();

            }
        System.out.printf("Change: %.2f",sumCoins);


        }
    }



