package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kegs = Integer.parseInt(scanner.nextLine());
        double maxVolume = 0;
        String maxKegModel ="";
        for (int i = 0; i < kegs; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double currentVolume = Math.PI*Math.pow(radius,2)*height;
            if (currentVolume>maxVolume){
                maxVolume= currentVolume;
                maxKegModel=model;
            }
        }
        System.out.println(maxKegModel);
    }
}
