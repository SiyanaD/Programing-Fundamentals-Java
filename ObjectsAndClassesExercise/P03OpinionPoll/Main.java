package ObjectsAndClassesExercise.P03OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Person> currentPerson = new ArrayList<>();

        for (int p = 1; p <=n; p++) {
            String data = scanner.nextLine();
            String name=data.split("\\s+")[0];
            int age = Integer.parseInt(data.split("\\s+")[1]);

            if (age>30){

                Person person = new Person(name,age);

                currentPerson.add(person);

            }
        }
        for (Person nameOver30:currentPerson){
            System.out.printf("%s - %d%n",nameOver30.getName(),nameOver30.getAge());


        }
    }
}
