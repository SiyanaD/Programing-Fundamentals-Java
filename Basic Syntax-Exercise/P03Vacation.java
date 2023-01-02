package BasicSyntaxExercise;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String typePeople = scanner.nextLine();
        String typeOfDay = scanner.nextLine();

        double price = 0;


        if (typeOfDay.equals("Friday")){
            if (typePeople.equals("Students")){
                price = 8.45*people;
                if (people>=30){
                    price = price-price*0.15;
                }
                System.out.printf("Total price: %.2f",price);

            } else if (typePeople.equals("Business")) {
                price = 10.90*people;
                if (people>=100){
                    price = price-10.90*10;
                }
                System.out.printf("Total price: %.2f",price);
            } else if (typePeople.equals("Regular")) {
                price = 15*people;
                if(people>=10 && people<=20){
                    price = price - price*0.05;
                }
                System.out.printf("Total price: %.2f",price);
            }
        }
        else if (typeOfDay.equals("Saturday")) {
            if (typePeople.equals("Students")){
                price = 9.80*people;
                if (people>=30){
                    price = price-price*0.15;
                }
                System.out.printf("Total price: %.2f",price);

            } else if (typePeople.equals("Business")) {
                price = 15.60*people;
                if (people>=100){
                    price = price-15.60*10;
                }
                System.out.printf("Total price: %.2f",price);
            } else if (typePeople.equals("Regular")) {
                price = 20*people;
                if(people>=10 && people<=20){
                    price = price - price*0.05;

                }
                System.out.printf("Total price: %.2f",price);
            }
        } else if (typeOfDay.equals("Sunday")) {
            if (typePeople.equals("Students")){
                price = 10.46*people;
                if (people>=30){
                    price = price-price*0.15;
                }
                System.out.printf("Total price: %.2f",price);

            } else if (typePeople.equals("Business")) {
                price = 16.00*people;
                if (people>=100){
                    price = price-16.00*10;
                }
                System.out.printf("Total price: %.2f",price);
            } else if (typePeople.equals("Regular")) {
                price = 22.50*people;
                if(people>=10 && people<=20){
                    price = price - price*0.05;

                }
                System.out.printf("Total price: %.2f",price);
            }


        }
}}

