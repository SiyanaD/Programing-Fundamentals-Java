package BasicSyntaxExercise;

import java.util.Scanner;

public class P10PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double saber = Double.parseDouble(scanner.nextLine());
        double robes = Double.parseDouble(scanner.nextLine());
        double belts = Double.parseDouble(scanner.nextLine());

        double sumLight = Math.ceil(students+0.10*students)*saber;
        double sumRobes = students*robes;
        double sumBelts = (students-students/6)*belts;

        double totalSum = sumLight+sumRobes+sumBelts;
        if(totalSum<=money){
            System.out.printf("The money is enough - it would cost %.2flv.", totalSum);
        }
        else {
            double needMoney = totalSum-money;
            System.out.printf("George Lucas will need %.2flv more.", needMoney);
        }


    }

}
