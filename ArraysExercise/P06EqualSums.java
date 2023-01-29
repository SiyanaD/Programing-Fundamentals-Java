package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P06EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] a = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int index = 0; index <=a.length-1 ; index++) {
            int currentNum = a[index];
            int leftSum = 0;
            int rightSum = 0;
            for (int indexLeft = 0; indexLeft < index; indexLeft++) {
                leftSum+=a[indexLeft];
            }
            for (int indexRight = index+1; indexRight<=a.length-1; indexRight++) {
                rightSum+=a[indexRight];
            }
            if (leftSum==rightSum){
                System.out.println(index);
                return;
            }

        }
        System.out.println("no");

    }
}
