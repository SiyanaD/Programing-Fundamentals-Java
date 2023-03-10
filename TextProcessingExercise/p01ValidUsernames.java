package TextProcessingExercise;

import java.util.Scanner;

public class p01ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         String input = scanner.nextLine();
         String [] data = input.split(", ");
         StringBuilder sb = new StringBuilder();

         for (String word:data){


             if (word.length()>=3&&word.length()<=16) {

                 for (int i = 0; i < word.length(); i++) {

                     char symbol = word.toLowerCase().charAt(i);


                     if (Character.isLowerCase(symbol) || Character.isDigit(symbol) ||
                             symbol == 45 || symbol == 95) {
                         sb.append(symbol);


                     } else {
                         break;
                     }
                 }
             }




             if (word.length()==sb.length()){
                 System.out.println(word);}
             sb.setLength(0);


         }
    }
        }









