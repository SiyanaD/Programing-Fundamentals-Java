package mapsLambdaAndStreamAPIExercise;

import java.util.*;

public class p10SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Integer> mapUsernameLanguage = new LinkedHashMap<>();

        Map<String,Integer> mapUsernamePoints=new LinkedHashMap<>();




        while (!input.equals("exam finished")){
            String [] data = input.split("-");
            String username = data[0];

           if (data.length==3){
               String language = data[1];
               int points = Integer.parseInt(data[2]);

               if (!mapUsernamePoints.containsKey(username)){
                   mapUsernamePoints.put(username,points);
               }
               else {
                   int currentPoints = mapUsernamePoints.get(username);
                   if (points>currentPoints){
                       mapUsernamePoints.put(username,points);

                   }

               }



               if (!mapUsernameLanguage.containsKey(language)){
                   mapUsernameLanguage.put(language,1);
               }
               else {
                   mapUsernameLanguage.put(language,mapUsernameLanguage.get(language)+1);

               }
           }
           else {
               mapUsernamePoints.remove(username);

           }

            input = scanner.nextLine();

            }

        System.out.println("Results:");



        mapUsernamePoints.entrySet().
                forEach(e-> System.out.printf("%s | %d%n",e.getKey(),e.getValue()));

        System.out.println("Submissions:");
       mapUsernameLanguage.entrySet()
               .forEach(e-> System.out.printf("%s - %d%n",e.getKey(),e.getValue()));






        }






    }

