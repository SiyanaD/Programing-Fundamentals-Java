package TextProcessingExercise;

import java.util.Scanner;

public class p04CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        char[]symbol = text.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char c :symbol){

            char cCast =(char) (c+3);

            //sb.append(String.format("%c",c+3));

            sb.append(cCast);
        }
        System.out.println(sb);


    }
}
