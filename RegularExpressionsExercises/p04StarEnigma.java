package RegularExpressionsExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p04StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> attacked= new ArrayList<>();
        List<String> destroyed = new ArrayList<>();
        String countLetters = "[starSTAR]";
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            int count = 0;
            String input = scanner.nextLine();
            Pattern pattern = Pattern.compile(countLetters);
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()){
                count++;
            }
            StringBuilder sb = new StringBuilder(input);
            for (int j = 0; j <sb.length() ; j++) {
                int charSymbol =sb.charAt(j);
                int result = charSymbol-count;
                sb.setCharAt(j,(char)result);
            }
            String regexName = "^[^@\\-!:>]*@(?<planetName>[A-Za-z]+)[^@\\-!:>]*:(?<population>[\\d]+)[^@\\-!:>]*!(?<attackType>[AD])" +
                    "![^@\\-!:>]*->(?<soldierCount>[\\d]+)[^@\\-!:>]*$";
            Pattern pattern1 = Pattern.compile(regexName);
            Matcher matcher1 = pattern1.matcher(sb.toString());
            while (matcher1.find()){
                String planetName = matcher1.group("planetName");
                int population = Integer.parseInt(matcher1.group("population"));
                String attackType = matcher1.group("attackType");
                int soldierCount =Integer.parseInt(matcher1.group("soldierCount"));
                if (attackType.equals("A")){
                    attacked.add(planetName);

                }
                else {
                    destroyed.add(planetName);

                }
            }
        }
        System.out.printf("Attacked planets: %d%n",attacked.size());
        attacked.stream().sorted(String::compareTo).forEach(p-> System.out.printf("-> %s%n",p));
        System.out.printf("Destroyed planets: %d%n",destroyed.size());
        destroyed.stream().sorted(String::compareTo).forEach(p-> System.out.printf("-> %s%n",p));
    }
}
