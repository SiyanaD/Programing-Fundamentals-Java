package TextProcessingExercise;

import java.util.Scanner;

public class p02CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split("\\s+");
       char [] str1= input[0].toCharArray();
        char [] str2= input[1].toCharArray();

        int smallerTextLength = Math.min(str1.length,str2.length);
        int maxTextLength = Math.max(str1.length,str2.length);
        int sum = 0;
        for (int i = 0; i <maxTextLength ; i++) {
            if (i<smallerTextLength){
                sum+=str1[i]*str2[i];
            } else if (str1.length>str2.length) {
                sum+=str1[i];
            }
            else {
                sum += str2[i];
            }
        }
        System.out.println(sum);
    }
}
