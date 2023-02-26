package ObjectsAndClassesExercise.P01AdvertisementMessage;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AdvertisementMessage message = new AdvertisementMessage();

        int n = Integer.parseInt(scanner.nextLine());


        for (int m = 1; m <=n ; m++) {
            String output = message.randomMessage();
            System.out.println(output);




        }


    }
}
