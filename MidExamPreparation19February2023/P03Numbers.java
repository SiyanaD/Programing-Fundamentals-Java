package MidExamPreparation13February2023;

import java.util.*;
import java.util.stream.Collectors;

public class P03Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> sequenceNumbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int sum = 0;
        int count = 0;
        for (int numbers:sequenceNumbers) {
            sum+=numbers;

        }
        double averageSum = sum*1.0/sequenceNumbers.size();

        List<Integer> newElements = new ArrayList<>();
        for (int number:sequenceNumbers) {
            if (number>averageSum){
                newElements.add(number);
            }

        }
        Collections.sort(newElements);
        Collections.reverse(newElements);

       if (newElements.size()>0){
           if (newElements.size()<5){
               System.out.print(newElements.toString().replaceAll("[\\[\\],]",""));
           }
           else {
               List<Integer> top5Numbers = newElements.subList(0,5);
               for (int item:top5Numbers) {
                   System.out.print(item + " ");
               }
           }

       }
       else {
           System.out.println("No");
       }

    }
}
