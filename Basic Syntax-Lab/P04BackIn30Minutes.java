package BasicSyntaxLab;

import java.util.Scanner;

public class P04BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int convertHours = hours*60;

        int allMinutes = convertHours+minutes+30;
        int realHour = allMinutes/60;
        int realMin = allMinutes%60;

        if (realHour>23){
            realHour=0;
        }
        System.out.printf("%d:%02d",realHour,realMin);


    }

}
