package MidExamPreparation13February2023;

import java.util.Scanner;

public class P01CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialEnergy = Integer.parseInt(scanner.nextLine());

        int energy = initialEnergy;
        int wonCount = 0;
        boolean energyEnough = true;


        String input = scanner.nextLine();

        while (!input.equals("End of battle")){

            int distance = Integer.parseInt(input);


            if (energy-distance<0){
                energyEnough=false;
                break;
            }
            else {
                energy = energy-distance;

                wonCount++;
                if (wonCount%3==0){
                    energy+=wonCount;
                }}


            input = scanner.nextLine();
        }
        if (energyEnough){
            System.out.printf("Won battles: %d. Energy left: %d%n",wonCount,energy);}
        else {
            System.out.printf("Not enough energy! Game ends with %d won battles and %d energy%n",wonCount,energy);
        }
    }
}
