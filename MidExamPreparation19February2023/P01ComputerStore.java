package MidExamPreparation13February2023;

import java.util.Scanner;

public class P01ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        double priceWithoutTaxes = 0;
        double totalAmountOfTaxes = 0;
        double totalPrice = 0;


        while (! (command.equals("regular") || command.equals("special"))){
            double number = Double.parseDouble(command);

            if (number>0){
                priceWithoutTaxes+=number;
                totalAmountOfTaxes=priceWithoutTaxes*0.2;
                totalPrice=priceWithoutTaxes+totalAmountOfTaxes;
            }
            else {
                System.out.println("Invalid price!");
            }
            command=scanner.nextLine();

        }

        if (totalPrice==0){
            System.out.println("Invalid order!");
        }
        else {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n",priceWithoutTaxes);
            System.out.printf("Taxes: %.2f$%n",totalAmountOfTaxes);
            System.out.println("-----------");
            if (command.equals("special")){
                totalPrice*=0.9;
            }
            System.out.printf("Total price: %.2f$%n",totalPrice);
        }

    }
}
