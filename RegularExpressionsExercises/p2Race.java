package RegularExpressionsExercises;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class p2Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> participants = Arrays.stream(scanner.nextLine().
                split(", ")).collect(Collectors.toList());
        Map<String,Integer> namesWithDigits=new LinkedHashMap<>();

        for (String names : participants) {

            namesWithDigits.putIfAbsent(names,0);
        }
        String input =scanner.nextLine();

        String regexText = "[A-Za-z]+";
        Pattern patternText = Pattern.compile(regexText);

        String regexDigits = "[\\d]{1}";
        Pattern patternDigits = Pattern.compile(regexDigits);
        while (!input.equals("end of race")){
            StringBuilder sb = new StringBuilder();
            Matcher matcherText = patternText.matcher(input);

            while (matcherText.find()){

                sb.append(matcherText.group());
            }

            if (namesWithDigits.containsKey(sb.toString())){
                Matcher  matcherDigits = patternDigits.matcher(input);
                while (matcherDigits.find()){
                    int sumDigits = 0;
                    int digits = Integer.parseInt(matcherDigits.group());
                    sumDigits+=digits;
                    namesWithDigits.put(sb.toString(),namesWithDigits.get(sb.toString())+sumDigits);

                }


            }
            input = scanner.nextLine();
        }


        String text ="";
        for (int i = 0; i <participants.size(); i++) {
            if (i==3){
                break;
            }
            text=i==0?"st":i==1?"nd":i==2?"rd":"";
            System.out.printf("%d%s place: %s%n",i+1,text,participants.get(i));

        }


    }
}
