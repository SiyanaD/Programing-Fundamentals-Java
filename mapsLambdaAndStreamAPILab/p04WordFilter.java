package mapsLambdaAndStreamAPILab;

import java.util.Arrays;
import java.util.Scanner;

public class p04WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split("\\s+");
        Arrays.stream(input).filter(word->word.length()%2==0).
                forEach(word-> System.out.println(word));


    }
}
