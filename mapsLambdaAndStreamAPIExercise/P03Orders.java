package mapsLambdaAndStreamAPIExercise;

import java.util.*;

public class P03Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Map<String,ArrayList<Double> > mapProducts = new LinkedHashMap<>();

        while (!command.equals("buy")){
            String [] data = command.split("\\s+");
            String name = data[0];
            double price = Double.parseDouble(data[1]);
            double quantity = Double.parseDouble(data[2]);

            if (mapProducts.containsKey(name)){
                mapProducts.get(name).set(0,price);
                mapProducts.get(name).set(1,mapProducts.get(name).get(1)+quantity);
            }
            else {
                mapProducts.put(name,new ArrayList<>());
                mapProducts.get(name).add(price);
                mapProducts.get(name).add(quantity);
            }

            command = scanner.nextLine();
        }
        mapProducts.forEach((k,v) -> System.out.printf("%s -> %.2f%n",k,
                v.get(0)*v.get(1)));

    }



}
