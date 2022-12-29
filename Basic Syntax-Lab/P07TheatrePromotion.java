package BasicSyntaxLab;

import java.util.Scanner;

public class P07TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        int ticket = 0;
        if (age >= 0 && age <= 18) {
            if (day.equals("Weekday")) {
                ticket = 12;
            } else if (day.equals("Weekend")) {
                ticket = 15;
            } else if (day.equals("Holiday")) {
                ticket = 5;
            }
            System.out.printf("%d$", ticket);
        } else if (age > 18 && age <= 64) {
            if (day.equals("Weekday")) {
                ticket = 18;
            } else if (day.equals("Weekend")) {
                ticket = 20;
            } else if (day.equals("Holiday")) {
                ticket = 12;
            }
            System.out.printf("%d$", ticket);
        } else if (age > 64 && age <= 122) {
            if (day.equals("Weekday")) {
                ticket = 12;
            } else if (day.equals("Weekend")) {
                ticket = 15;
            } else if (day.equals("Holiday")) {
                ticket = 10;
            }
            System.out.printf("%d$", ticket);
        } else {
            System.out.println("Error!");
        }
    }
    }
