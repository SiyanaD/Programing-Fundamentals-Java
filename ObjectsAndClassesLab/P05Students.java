package ObjectsAndClassesLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P05Students {
 static class Student{
     private String firstName;
     private String lastName;
     private String age;
     private String hometown;

     public String getFirstName() {
         return firstName;
     }

     public String getLastName() {
         return lastName;
     }

     public String getAge() {
         return age;
     }

     public String getHometown() {
         return hometown;
     }

     public void setFirstName(String firstName) {
         this.firstName = firstName;
     }

     public void setLastName(String lastName) {
         this.lastName = lastName;
     }

     public void setAge(String age) {
         this.age = age;
     }

     public void setHometown(String hometown) {
         this.hometown = hometown;
     }
 }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        List<Student> studentsList = new ArrayList<>();

        while (!command.equals("end")){

            String [] students = command.split("\\s+");
            String firstName = students[0];
            String lastName= students[1];
            String age = students[2];
            String hometown = students[3];

            Student currentStudent = new Student();
            currentStudent.setFirstName(firstName);
            currentStudent.setLastName(lastName);
            currentStudent.setAge(age);
            currentStudent.setHometown(hometown);

            studentsList.add(currentStudent);
            command=scanner.nextLine();
        }
        String city = scanner.nextLine();

        for (Student student:studentsList){
            if (city.equals(student.getHometown())){

                System.out.printf("%s %s is %s years old%n",student.getFirstName(),student.getLastName(),student.getAge());
            }

        }
    }
}



