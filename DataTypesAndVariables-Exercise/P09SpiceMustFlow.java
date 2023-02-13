package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());
        int days = 0;
        int totalAmount = 0;

      while (startingYield>0){
          if (startingYield<100){
              if(totalAmount<26){
                  break;
              }
              totalAmount-=26;
              break;
          }
          totalAmount+=startingYield-26;
          startingYield-=10;
          days++;
      }
        System.out.println(days);
        System.out.println(totalAmount);

    }
}
