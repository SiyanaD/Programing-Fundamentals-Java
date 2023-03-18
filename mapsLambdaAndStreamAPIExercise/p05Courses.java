package mapsLambdaAndStreamAPIExercise;

import java.util.*;

public class p05Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        Map<String, List<String>> mapCourseAndStudents = new LinkedHashMap<>();

        while (!command.equals("end")){
            String [] data = command.split(" : ");
            String courseName = data[0];
            String studentName = data[1];

            if (!mapCourseAndStudents.containsKey(courseName)){

                mapCourseAndStudents.put(courseName,new ArrayList<>());
            }
            mapCourseAndStudents.get(courseName).add(studentName);
            command = scanner.nextLine();
        }

        mapCourseAndStudents.entrySet().forEach((entry)->{System.out.printf("%s: %s%n",entry.getKey(),entry
                .getValue().size());
            entry.getValue().forEach(studentsName-> System.out.printf("-- %s%n",studentsName));});


    }
}
