package MidExamPreparation13February2023;

import java.util.Arrays;
import java.util.Scanner;

public class P02TreasureHunt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] treasureChest = scanner.nextLine().split("\\|");
        String commands = scanner.nextLine();
        while (!commands.equals("Yohoho!")){
            String[] command = commands.split("\\s+");
            String firstCommand = command[0];

            switch (firstCommand){
                case "Loot":
                    for (int item = 1; item <command.length ; item++) {
                        boolean alreadyContains = false;
                        for (int i = 0; i <treasureChest.length ; i++) {
                            if (command[item].equals(treasureChest[i])){
                                alreadyContains=true;
                                break;
                            }
                        }
                        if (!alreadyContains){
                            String newChest = command[item]+" " + String.join(" ",treasureChest);
                            treasureChest=newChest.split(" ");
                        }
                    }
                    break;
                case "Drop":
                    int position = Integer.parseInt(command[1]);
                    if (position<=treasureChest.length-1&&position>=0){

                        String dropItem =treasureChest[position];

                        for (int i = position; i <treasureChest.length-1 ; i++) {

                            treasureChest[i]=treasureChest[i+1];
                        }
                        treasureChest[treasureChest.length-1]=dropItem;
                    }
                    break;
                case "Steal":
                    break;


            }



            commands = scanner.nextLine();

        }
    }
}
