package mapsLambdaAndStreamAPIExercise;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class p01CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      String input = scanner.nextLine();
      String [] inputArr = input.split("\\s+");
      Map<Character,Integer> mapSymbols = new LinkedHashMap<>();

      for (String text :inputArr){

          for (int i = 0; i <text.length(); i++) {
              char symbol = text.charAt(i);
              if (!mapSymbols.containsKey(symbol)){

                  mapSymbols.put(symbol,1);

              }
              else {
                  mapSymbols.put(symbol, mapSymbols.get(symbol)+1);
              }

          }
      }
      // for (Map.Entry<Character,Integer> entry : mapSymbols.entrySet()){
         //  DecimalFormat df = new DecimalFormat("#.####");
          // System.out.printf("%c -> %d%n",entry.getKey(),entry.getValue());
      // }
        mapSymbols.forEach((key, value) -> System.out.printf("%c -> %d%n",key,value));


    }
}
