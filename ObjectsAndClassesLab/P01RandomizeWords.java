package ObjectsAndClassesLab;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordsArr = scanner.nextLine().split(" ");
        Random rnd = new Random();
        for (int i = 0; i < wordsArr.length; i++) {
            int rnd2=rnd.nextInt(wordsArr.length);

           String item = wordsArr[i];
           wordsArr[i]=wordsArr[rnd2];
           wordsArr[rnd2]=item;
        }
        System.out.println(String.join(System.lineSeparator(),wordsArr));


    }
}
