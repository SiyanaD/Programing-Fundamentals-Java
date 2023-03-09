package TextProcessingLab;

import java.util.Scanner;

public class p01ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        while (!input.equals("end")){

            String reversed = "";

            char [] a  = input.toCharArray();

            for (int i = a.length-1; i >=0 ; i--) {

                reversed+=a[i];

            }

            System.out.printf("%s = %s%n",input,reversed);


            input = scanner.nextLine();
        }


    }
}
