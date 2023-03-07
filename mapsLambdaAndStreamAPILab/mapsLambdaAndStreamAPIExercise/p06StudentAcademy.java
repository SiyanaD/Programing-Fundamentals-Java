package mapsLambdaAndStreamAPIExercise;

import java.util.*;

public class p06StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      int n = Integer.parseInt(scanner.nextLine());

      Map<String,List<Double>> studentsList= new LinkedHashMap<>();


        for (int student = 1; student <=n; student++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!studentsList.containsKey(name)){
                studentsList.put(name,new ArrayList<>());
            }
            studentsList.get(name).add(grade);

        }

        Map<String,Double>studentsAverageGrade = new LinkedHashMap<>();

        for (Map.Entry<String,List<Double>> entry :studentsList.entrySet()){
            double avrGrade = 0;
            for (int i = 0; i <entry.getValue().size(); i++) {

                avrGrade = avrGrade+entry.getValue().get(i);

            }
            avrGrade=avrGrade/entry.getValue().size();
            if (avrGrade>=4.5){
                studentsAverageGrade.put(entry.getKey(),avrGrade);
            }
        }
        studentsAverageGrade.forEach((k,v) -> System.out.printf("%s -> %.2f%n",k,v));



    }


}
