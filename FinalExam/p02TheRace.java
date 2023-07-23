package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p02TheRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


while (true){
        String input = scanner.nextLine();

        String regex = "(?<symbols>[#$%*&]){1}(?<name>[A-Za-z]+)\\1=(?<length>[0-9]+)!!(?<geohashcode>.*)$";

        Pattern pattern =Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()&&(Integer.parseInt(matcher.group("length"))==matcher.group("geohashcode").length())){
            int length = Integer.parseInt(matcher.group("length"));

            String name = matcher.group("name");
            StringBuilder sb = new StringBuilder();
            String decryptCode = matcher.group("geohashcode");
            for (int i = 0; i <length ; i++) {
                char symbol = decryptCode.charAt(i);
                sb.append((char) (symbol+length));
            }
            System.out.printf("Coordinates found! %s -> %s",name,sb);
            return;// conection with while(true)
        }

        else {
            System.out.println("Nothing found!");
        }




    }}
}
