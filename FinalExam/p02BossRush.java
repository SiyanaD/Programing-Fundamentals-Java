package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p02BossRush {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <n ; i++) {
            String data = scanner.nextLine();
            String regex = "([\\\\|])(?<name>[A-Z]{4,})\\1:([#])(?<twoWords>[A-Za-z]+\\s[A-Za-z]+)\\3";

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(data);
            if (matcher.find()){
                String name = matcher.group("name");
                String twoWords = matcher.group("twoWords");
                System.out.printf("%s, The %s%n",name,twoWords);
                System.out.printf(">> Strength: %s%n",name.length());
                System.out.printf(">> Armor: %s%n",twoWords.length());


            }
            else {
                System.out.println("Access denied!");
            }

        }
    }
}
