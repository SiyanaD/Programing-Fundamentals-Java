package ArraysExercise;

import java.util.Scanner;

public class P03ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String [] firstArray = new String[n];
        String [] secondArray = new String[n];
        for (int i = 1; i <=n ; i++) {
            String [] number =scanner.nextLine().split(" ");
            String firstNumber = number[0];
            String secondNumber = number[1];

            if (i%2==0){
                secondArray[i-1]=firstNumber;
                firstArray[i-1] = secondNumber;

            }
            else {
                firstArray[i-1] = firstNumber;
                secondArray[i-1]=secondNumber;

            }
        }
        System.out.println(String.join(" ",firstArray));
        System.out.println(String.join(" ",secondArray));


    }
}
