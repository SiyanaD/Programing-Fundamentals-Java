package ObjectsAndClassesExercise.P04Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Students> currentStudent = new ArrayList<>();

        for (int s = 1; s <=n ; s++) {
            String student = scanner.nextLine();
            String firstName = student.split("\\s+")[0];
            String lastName = student.split("\\s+")[1];
            Double grade = Double.parseDouble(student.split("\\s+")[2]);

            Students students = new Students(firstName,lastName,grade);

            currentStudent.add(students);
        }
        currentStudent.sort(Comparator.comparing(Students::getGrade).reversed());

        for (Students newStudent:currentStudent){
            System.out.printf("%s %s: %.2f%n",newStudent.getFirstName(),
                    newStudent.getLastName(),newStudent.getGrade());

        }
    }
}
