package MethodsExercise;

import java.util.Scanner;

public class P03CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char start = scanner.nextLine().charAt(0);
        char end = scanner.nextLine().charAt(0);
        charactersInRange(start,end);

    }
    public static void charactersInRange(char start, char end){
        if (start>end){
            char startPoint= start;
            start = end;
            end = startPoint;

        }
        for (int i = start+1; i <end ; i++) {
            System.out.printf("%c ",i);

        }

    }
}
