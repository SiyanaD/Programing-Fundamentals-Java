package ListsExercise;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P4ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("End")){
            if (command.contains("Add")){
                int numberToAdd= Integer.parseInt(command.split("\\s+")[1]);
                numbers.add(numberToAdd);
                
            } else if (command.contains("Insert")) {
                String[] commandParts = command.split("\\s+");
                int numberToInsert = Integer.parseInt(commandParts[1]);
                int index = Integer.parseInt(commandParts[2]);
                if (index>=0 && index<=numbers.size()-1){
                    numbers.add(index,numberToInsert);
                }
                else {
                    System.out.println("Invalid index");
                }
            } else if (command.contains("Remove")) {
                int indexForRemove = Integer.parseInt(command.split("\\s+")[1]);
                if (indexForRemove>=0&& indexForRemove<=numbers.size()-1){
                    numbers.remove(indexForRemove);

                }
                else {
                    System.out.println("Invalid index");
                }
                
            } else if (command.contains("Shift left")) {
                int countShiftLeft = Integer.parseInt(command.split("\\s+")[2]);
                for (int time = 1; time <=countShiftLeft ; time++) {
                    int firstNumber = numbers.get(0);
                    numbers.remove(0);
                    numbers.add(firstNumber);
                }
                
            } else if (command.contains("Shift right")) {
                int countShiftRight = Integer.parseInt(command.split("\\s+")[2]);
                for (int timeR = 1; timeR <=countShiftRight; timeR++) {
                    int lastNumber =numbers.get(numbers.size()-1);
                    numbers.remove(numbers.size()-1);
                    numbers.add(0,lastNumber);

                }
                
            }

            command=scanner.nextLine();
        }
        for (int number:numbers) {
            System.out.print(number + " ");
        }
    }
}
