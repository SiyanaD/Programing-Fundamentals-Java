package FinalExam;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p2EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();//първоначален текст

        //Your task is to write a program that extracts emojis from a text and find the threshold based on the input.
        //You have to get your cool threshold. It is obtained by multiplying all the digits found in the input.
        //The cool threshold could be a huge number, so be mindful.-> long
        long coolThreshold = 1;//праг на готиност=стойността която трябва да постигнем
        //когато една променлива ще участва в операцията умножение слагаме coolThreshold да е = на 1, а не 0
        //за да намерим coolThreshold трябва да умножим всички числа който се срещат в нашия първоначален текст
        for (char symbol:input.toCharArray()){
            if (Character.isDigit(symbol)){
                //'1'-> 1 - преобразуваме символа 1 в цифрата 1
                //int number = (int) symbol;- така взимаме ASCII кода на този символ не числото и в тази задча не ни върши работа

                //'1'-> 1- за да преобразуваме символа '1' в число, първо го преобразуваме в текст "1" и след това в числото 1
                int number = Integer.parseInt(symbol+"");
                coolThreshold*=number;
            }
        }
        System.out.printf("Cool threshold: %d%n",coolThreshold);

        String regex = "([:]{2}|[*]{2})(?<emoji>[A-Z][a-z]{2,})(\\1)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);//съвкупност от текстовете който отговарят на нашия шаблон

        //You need to count all valid emojis in the text and calculate their coolness.
        // The coolness of the emoji is determined by summing all the ASCII values of all letters in the emoji.

        int countValidEmojis = 0;//брой на въведените готини емоджита
        List<String> coolEmoji = new ArrayList<>();//държим нашите най готини емоджита

        while (matcher.find()){//true-> валидно емоджи
            countValidEmojis++;

            //намирам колко е готино това емоджи
            int coolLevelCurrentEmoji=0;//ниво на готиност на текущото емоджи
            String emoji = matcher.group("emoji");//взимаме само групата без разделителите
            //You need to count all valid emojis in the text and calculate their coolness.
            // The coolness of the emoji is determined by summing all the ASCII values of all letters in the emoji.
            for (char symbol : emoji.toCharArray()) {
                coolLevelCurrentEmoji+=(int) symbol;

            }

            //проверявам дали е достатъчно готино трябвя (coolest >= coolThreshold)
            if (coolLevelCurrentEmoji>=coolThreshold){
                coolEmoji.add(matcher.group());
            }

        }


        System.out.printf("%d emojis found in the text. The cool ones are:%n",countValidEmojis);
        coolEmoji.forEach(e-> System.out.println(e));

    }
}
