package MethodsLab;

import java.util.Scanner;

public class P05Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantityInput = Integer.parseInt(scanner.nextLine());

        switch (product){
            case "coffee":
                coffeeProduct(quantityInput);
                break;
            case "water":
                waterProduct(quantityInput);
                break;
            case "coke":
                cokeProduct(quantityInput);
                break;
            case "snacks":
                snacksProduct(quantityInput);
                break;
        }
    }
    public static void coffeeProduct(int quantity){
        double price= quantity*1.50;
        System.out.printf("%.2f",price);
    }
    public static void waterProduct(int quantity){
        double price = quantity*1.00;
        System.out.printf("%.2f",price);
    }
    public static void cokeProduct(int quantity){
        double price = quantity*1.40;
        System.out.printf("%.2f",price);
    }
    public static void snacksProduct(int quantity){
        double price = quantity*2.00;
        System.out.printf("%.2f",price);
    }
}
