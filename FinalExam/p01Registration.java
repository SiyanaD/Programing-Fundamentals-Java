package FinalExam;

import java.util.Scanner;

public class p01Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(scanner.nextLine());

        String commands = scanner.nextLine();
        while (!commands.equals("Registration")){
            String[] input = commands.split("\\s+");
            if (input[0].equals("Letters")){
                if (input[1].equals("Lower")){
                    for (int i = 0; i < sb.length(); i++) {
                       sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));
                    }
                    System.out.println(sb);
                }
                else if (input[1].equals("Upper")){
                    for (int i = 0; i < sb.length(); i++) {
                        sb.setCharAt(i,Character.toUpperCase(sb.charAt(i)));
                    }
                    System.out.println(sb);
                }
            } else if (input[0].equals("Reverse")) {
                int startIndex = Integer.parseInt(input[1]);
                int endIndex = Integer.parseInt(input[2]);

                if (startIndex>0&&endIndex>0 & startIndex<sb.length()& endIndex<sb.length()){


                    StringBuilder revSub =new StringBuilder(sb.subSequence(startIndex,endIndex+1));

                revSub.reverse();
                    System.out.println(revSub);

                }
                else {
                    commands=scanner.nextLine();
                    continue;
                }
            }
            else if (input[0].equals("Substring")) {
                StringBuilder substring = new StringBuilder(input[1]);
                if (sb.toString().contains(substring)){

                    int startIndex=  sb.indexOf(String.valueOf(substring.charAt(0)));
                    int endPosition = startIndex+substring.length()-1;
                    sb.delete(startIndex,endPosition+1);
                    System.out.println(sb);
                }
                else {
                    System.out.printf("The username %s doesn't contain %s.%n",sb,substring);
                    commands=scanner.nextLine();
                    continue;
                }

            } else if (input[0].equals("Replace")) {
                String givenIndex = input[1];
                String dash = "-";
                String replacement = sb.toString().replaceAll(givenIndex,dash);
                sb.setLength(0);
                sb.append(replacement);

                System.out.println(sb);


            } else if (input[0].equals("IsValid")) {

                String givenChar = input[1];

                if (sb.toString().contains(givenChar)){
                    System.out.println("Valid username.");
                }
                else {
                    System.out.printf("%s must be contained in your username.%n",givenChar);
                  return;

                }

            }


            commands=scanner.nextLine();
        }
    }
}
