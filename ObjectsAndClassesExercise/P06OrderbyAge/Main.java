package ObjectsAndClassesExercise.P06OrderbyAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Person> nameOfPerson=new ArrayList<>();

        while (!input.equals("End")){

            String name = input.split("\\s+")[0];
            String id = input.split("\\s+")[1];
            int age = Integer.parseInt(input.split("\\s+")[2]);

            Person person = new Person(name,id,age);
            nameOfPerson.add(person);
            nameOfPerson.sort(Comparator.comparing(Person::getAge));
            input = scanner.nextLine();
        }
        for (Person person:nameOfPerson){
            System.out.printf("%s with ID: %s is %d years old.%n",person.getName(),
                    person.getId(),person.getAge());
        }
    }
}
