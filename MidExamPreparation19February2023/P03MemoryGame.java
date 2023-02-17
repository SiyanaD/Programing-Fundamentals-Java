package MidExamPreparation13February2023;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> sequenceOfElements = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        int count = 0;

        while (!input.equals("end")){
            count++;
            String [] indexes =input.split("\\s+");
            int firstIndex = Integer.parseInt(indexes[0]);
            int secondIndex = Integer.parseInt(indexes[1]);
            if (cheat(firstIndex,secondIndex,sequenceOfElements)){


                System.out.println("Invalid input! Adding additional elements to the board");

                sequenceOfElements.add(sequenceOfElements.size()/2,String.format("-%da",count));
                sequenceOfElements.add(sequenceOfElements.size()/2,String.format("-%da",count));

            }
            else {
                String firstElement = sequenceOfElements.get(firstIndex);
                String secondElement = sequenceOfElements.get(secondIndex);
                if (firstElement.equals(secondElement)){
                    sequenceOfElements.remove(firstElement);
                    sequenceOfElements.remove(secondElement);
                    System.out.printf("Congrats! You have found matching elements - %s!%n",firstElement);
                } else  {
                    System.out.println("Try again!");
                }

            }
            if (sequenceOfElements.isEmpty()){
                break;
            }


            input=scanner.nextLine();
        }
        if (sequenceOfElements.isEmpty()){
            System.out.printf("You have won in %d turns!%n",count);
        } else {
            System.out.println("Sorry you lose :(");
            System.out.println(String.join(" ",sequenceOfElements));

        }

    }
    public static boolean cheat(int firstIndex,int secondIndex,List<String>elements){
        if (firstIndex==secondIndex||isInvalidIndex(firstIndex,elements)||isInvalidIndex(secondIndex,elements)){
            return true;

        }
        return false;

    }


    public static boolean isInvalidIndex(int index,List<String>elements){
        if (index<0 || index>=elements.size()){
            return true;
        }
        return false;
    }
}
