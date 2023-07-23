package FinalExam;

import java.util.Scanner;

public class p01Hogwarts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        StringBuilder sb = new StringBuilder(scanner.nextLine());

        String commands = scanner.nextLine();

        while (!commands.equals("Abracadabra")){

            String [] data = commands.split("\\s+");

            String input = data[0];
            if (!input.equals("Abjuration")&& !input.equals("Necromancy")&& !input.equals("Illusion")&&!input.equals("Divination")&&!input.equals("Alteration")){
                System.out.println("The spell did not work!");
            }
            switch (input){
                case"Abjuration":
                    for (int i = 0; i < sb.length(); i++) {

                        if (Character.isLowerCase(sb.charAt(i))){
                            sb.setCharAt(i,Character.toUpperCase(sb.charAt(i)));

                        }}
                        System.out.println(sb);

                    break;
                case "Necromancy":
                    for (int i = 0; i < sb.length(); i++) {
                        if (Character.isUpperCase(sb.charAt(i))){
                            sb.setCharAt(i,Character.toLowerCase(sb.charAt(i)));
                        }
                    }
                    System.out.println(sb);

                    break;
                case "Illusion":
                    int index = Integer.parseInt(data[1]);
                   String letter =data[2];

                        if (index>0&& sb.length()>=index) {

                            char[] text = letter.toCharArray();
                            for (char c : text) {
                                char cast = (char) (c);
                                sb.setCharAt(index, cast);
                            }
                            System.out.println("Done!");

                            break;
                        }
                        else  {
                            System.out.println("The spell was too weak.");
                        }
                        break;

                case "Divination":
                    StringBuilder substringF = new StringBuilder(data[1]);
                    String substringS = data[2];
                    if (sb.toString().contains(substringF)){
                      int startIndex=  sb.indexOf(String.valueOf(substringF.charAt(0)));
                      int endIndex = startIndex+sb.length()-1;
                      sb.replace(startIndex,endIndex,substringS);
                        System.out.println(sb);
                    }
                    else {
                        break;
                    }

                    break;
                case "Alteration":
                   String removeSubstring = data[1];
                    if (sb.toString().contains(removeSubstring)){
                        int startIndex = sb.indexOf(String.valueOf(removeSubstring.charAt(0)));
                        int endIndex = startIndex+sb.length()-1;
                        sb.delete(startIndex,endIndex);
                        System.out.println(sb);
                    }
                    else {
                        break;
                    }

                    break;


            }


            commands = scanner.nextLine();
        }


    }
}
