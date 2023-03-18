package RegularExpressionsLab;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p02MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String pattern = "\\+359([- ])2\\1\\d{3}\\1\\d{4}\\b";

        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(input);
        List<String> matchedPhones = new LinkedList<>();

        while (matcher.find()){
            matchedPhones.add(matcher.group());
        }
        System.out.println(String.join(", ",matchedPhones));


    }
}
