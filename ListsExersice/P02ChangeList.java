package ListsExersice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String commands=scanner.nextLine();
        while (!commands.equals("end")){

            String[]command=commands.split(" ");

            if (command[0].equals("Delete")){
                int element = Integer.parseInt(command[1]);
                numbers.removeAll(Arrays.asList(element));

            } else if (command[0].equals("Insert")) {
                int elementInsert = Integer.parseInt(command[1]);
                int position = Integer.parseInt(command[2]);
                numbers.add(position,elementInsert);

            }
            commands=scanner.nextLine();
        }
        for (int index:numbers) {
            System.out.print(index+ " ");
        }
    }
}
