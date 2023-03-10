package TextProcessingLab;

import java.util.Scanner;

public class p05DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder digit = new StringBuilder();
        StringBuilder letters =new StringBuilder();
        StringBuilder other = new StringBuilder();


        for (int i = 0; i <input.length(); i++) {

            if (Character.isDigit(input.charAt(i))){
                digit.append(input.charAt(i));
            }
            else if(Character.isLetter(input.charAt(i))){
                letters.append(input.charAt(i));
            }
            else {
                other.append(input.charAt(i));
            }
        }
        System.out.println(digit);
        System.out.println(letters);
        System.out.println(other);
    }
}
