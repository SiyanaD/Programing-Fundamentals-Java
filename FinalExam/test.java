package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.next();
//            String regex = "(^[#$%*&])(?<name>[A-Za-z]+)\\1=(?<length>\\d+)!!(?<geohashcode>.+)$";
            String regex = "([#$%*&]){1}(?<name>[A-Za-z]+)\\1=(?<length>[0-9]+)!!(?<geohashcode>.*)$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            if (matcher.find() && Integer.parseInt(matcher.group("length")) == matcher.group("geohashcode").length()) {

                String name = matcher.group("name");
                int length = Integer.parseInt(matcher.group("length"));
                String geoHashCodeEncrypted = matcher.group("geohashcode");
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < length; i++) {
                    char ch = geoHashCodeEncrypted.charAt(i);
                    sb.append((char) (ch + length));
                }
                System.out.println("Coordinates found! " + name + " -> " + sb.toString());
                return;
            } else {
                System.out.println("Nothing found!");
            }
        }


    }
}
