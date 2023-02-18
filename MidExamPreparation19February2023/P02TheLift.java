package MidExamPreparation13February2023;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02TheLift {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int waitingPeople = Integer.parseInt(scanner.nextLine());
        List<Integer> wagons = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        for (int wagon = 0; wagon <= wagons.size()-1; wagon++) {
            if (waitingPeople>0){
                int currentPeopleInWagon = wagons.get(wagon);

                while (currentPeopleInWagon<4){
                    currentPeopleInWagon++;
                    if (waitingPeople<=0){
                        break;
                    }
                    wagons.set(wagon,currentPeopleInWagon);
                    waitingPeople--;


                }
            }
        }
        if (waitingPeople<=0 && wagons.get(wagons.size()-1)<4){
            System.out.println("The lift has empty spots!");
        }

        else if (waitingPeople>0 && wagons.get(wagons.size()-1)>=4) {
            System.out.printf("There isn't enough space! %d people in a queue!%n",waitingPeople);

        }

        System.out.println(wagons.toString().replaceAll("[\\[\\],]",""));

    }

}
