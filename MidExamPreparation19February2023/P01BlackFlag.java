package MidExamPreparation13February2023;

import java.util.Scanner;

public class P01BlackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int dailyPlunder = Integer.parseInt(scanner.nextLine());
        double expectedPlunder = Double.parseDouble(scanner.nextLine());

        double totalPlunder = 0;


        for (int i = 1; i <=days ; i++) {

            totalPlunder+=dailyPlunder;

            if (i%3==0){
                double extraPlunder =dailyPlunder*0.5;
                totalPlunder+=extraPlunder;
            }


            if (i%5==0){
               totalPlunder*=0.7;
            }



        }
        if (totalPlunder>=expectedPlunder){
            System.out.printf("Ahoy! %.2f plunder gained.",totalPlunder);
        }
        else {
            double percentage = (totalPlunder/expectedPlunder)*100;
            System.out.printf("Collected only %.2f%% of the plunder.",percentage);
        }
    }
}
