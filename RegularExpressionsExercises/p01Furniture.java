package RegularExpressionsExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class p01Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "[>>]{2}(?<furniture>[A-Za-z+]+)[<<]{2}(?<price>[\\d+]+[\\.]?[\\d]+)!(?<quantity>[\\d]+)\\b";
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);
        List<String> furnishing = new ArrayList<>();
        double totalPrice = 0;
        while (!input.equals("Purchase")){
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()){

                String furniture = matcher.group("furniture");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                furnishing.add(furniture);
                totalPrice +=price*quantity;
            }
            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
       furnishing.forEach((f)->System.out.println(f));
        System.out.printf("Total money spend: %.2f%n",totalPrice);



    }
}
