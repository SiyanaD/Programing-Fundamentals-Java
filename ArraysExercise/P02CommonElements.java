package ArraysExercise;

import java.util.Scanner;

public class P02CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] firstArray = scanner.nextLine().split(" ");
        String [] secondArray = scanner.nextLine().split(" ");
        for (String elementsSecondArray:secondArray) {
            for (String elementsFirstArray : firstArray){
                if (elementsSecondArray.equals(elementsFirstArray)){
                    System.out.print(elementsFirstArray + " ");
                    break;
                }
            }

        }
    }
}
