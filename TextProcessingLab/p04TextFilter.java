package TextProcessingLab;

import java.util.Scanner;

public class p04TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String word :bannedWords){
            if (text.contains(word)){
               String replaceWord = repeatString("*",word.length());
               text=text.replace(word,replaceWord);
            }
        }
        System.out.println(text);

    }
    static String repeatString(String str,int length){
        String replace = "";
        for (int i = 0; i < length; i++) {
            replace+=str;

        }
        return replace;
    }
}
