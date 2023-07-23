package FinalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p02MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String regex = "([@#])(?<firstWord>[A-Za-z]{3,})\\1\\1(?<secondWord>[A-Za-z]{3,})\\1";
        //[@#] - първия символ или втория символ
        //{3,} - минимум 3 букви(символа) трябва да съдържа

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        Map<String,String> mirrorWord = new LinkedHashMap<>();

        int reverseWord= 0;
        int pairsWord = 0;

        while (matcher.find()){
            pairsWord++;
            String firstWord = matcher.group("firstWord");
            String secondWord = matcher.group("secondWord");
            if (firstWord.equals(reverseWord(secondWord))){
                reverseWord++;
                mirrorWord.put(firstWord,secondWord);

            }
        }
        if (pairsWord==0){// няма валидни двойки думи
            System.out.println("No word pairs found!");
        }
        else {
            System.out.printf("%d word pairs found!%n",pairsWord);
        }
        if (reverseWord==0){
            System.out.println("No mirror words!");
        }
        else {
            int index = 0;// премахване на запетайката на последната дума
            int lastIndex = mirrorWord.size()-1;//// премахване на запетайката на последната дума


            System.out.println("The mirror words are:");

            for (Map.Entry<String, String> entry : mirrorWord.entrySet()) {

             System.out.printf("%s <=> %s",entry.getKey(),entry.getValue());

            if (index!=lastIndex){
                System.out.print(", ");
            }

            index++;
        }
        }


    }
    private  static  String reverseWord(String text){ //reversed word
        StringBuilder reverseWord = new StringBuilder();
        for (int i = text.length()-1; i >=0 ; i--) {

            reverseWord.append(text.charAt(i));

        }
        return reverseWord.toString();
    }
}
