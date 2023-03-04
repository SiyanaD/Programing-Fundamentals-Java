package mapsLambdaAndStreamAPIExercise.Order;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Map<String, Products> mapProduct = new LinkedHashMap<>();

        while (!command.equals("buy")){
            String [] data = command.split("\\s+");
            String name = data[0];
            double price = Double.parseDouble(data[1]);
            int quantity = Integer.parseInt(data[2]);

            if (mapProduct.containsKey(name)){
                mapProduct.get(name).setPrice(price);
                mapProduct.get(name).setQuantity(mapProduct.get(name).getQuantity()+quantity);

            }
            else {
                mapProduct.put(name,new Products(name,price,quantity));
            }
            command=scanner.nextLine();
        }
        mapProduct.forEach((k,v)-> System.out.printf("%s -> %.2f%n",k,v.getPrice()*v.getQuantity()));


    }

}
