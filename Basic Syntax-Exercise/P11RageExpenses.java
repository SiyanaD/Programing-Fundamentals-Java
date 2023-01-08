package BasicSyntaxExercise;

import java.util.Scanner;

public class P11RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGame = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice =  Double.parseDouble(scanner.nextLine());
        double keyboardPrice =  Double.parseDouble(scanner.nextLine());;
        double displayPrice =  Double.parseDouble(scanner.nextLine());

        double totalPrice =0;

        int brokeHeadset = lostGame/2;
        int brokeMouse = lostGame/3;
        int brokeKeyboard = lostGame/6;
        int brokeDisplay = lostGame/12;

        totalPrice = headsetPrice*brokeHeadset+mousePrice*brokeMouse+
                keyboardPrice*brokeKeyboard+displayPrice*brokeDisplay;

        System.out.printf("Rage expenses: %.2f lv.",totalPrice);


    }
}
