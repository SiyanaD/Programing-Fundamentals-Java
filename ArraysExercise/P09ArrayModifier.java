package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P09ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String commands = scanner.nextLine();

        while (!commands.equals("end")){
            String [] commandsPart = commands.split(" ");
            String commandsType = commandsPart[0];
            switch (commandsType) {
                case "swap":
                    int index1=Integer.parseInt(commandsPart[1]);
                    int elements1=numbers[index1];
                    int index2=Integer.parseInt(commandsPart[2]);
                    int elements2=numbers[index2];
                    numbers[index1]=elements2;
                    numbers[index2]=elements1;
                    break;

                case "multiply":
                    int multiplyElementsIndex1 = Integer.parseInt(commandsPart[1]);
                    int multiplyElement1=numbers[multiplyElementsIndex1];
                    int multiplyElementsIndex2= Integer.parseInt(commandsPart[2]);
                    int multiplyElement2=numbers[multiplyElementsIndex2];
                    int product = multiplyElement1*multiplyElement2;
                    numbers[multiplyElementsIndex1]=product;
                    break;

                case "decrease":
                    for (int index = 0; index <=numbers.length-1 ; index++) {
                        numbers[index]=numbers[index]-1;

                    }break;
            }

            commands = scanner.nextLine();
        }

        for (int index = 0; index <=numbers.length-1 ; index++) {
            if (index!=numbers.length-1){
                System.out.print(numbers[index]+ ", ");
            }
            else {
                System.out.print(numbers[index]);
            }

        }

    }
}
