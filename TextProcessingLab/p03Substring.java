package TextProcessingLab;

import java.util.Scanner;

public class p03Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String removeWord = scanner.nextLine();
        String text = scanner.nextLine();
        int index = text.indexOf(removeWord);
        while (index!=-1){

            text=text.replace(removeWord,"");

            index=text.indexOf(removeWord);

        }
        System.out.println(text);
    }
}
