package RegularExpressionsLab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p01MatchFullName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String regexPattern = "\\b[A-Z][a-z]+ [A-Z][a-z]+\\b";

        Pattern regex = Pattern.compile(regexPattern);
        Matcher matcher = regex.matcher(text);

        while (matcher.find()){
            System.out.print(matcher.group() + " ");
        }
    }

}
