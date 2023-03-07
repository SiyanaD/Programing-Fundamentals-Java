package mapsLambdaAndStreamAPIExercise;

import java.util.*;

public class p08CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> mapCompanies = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("End")){

            String [] data = input.split(" -> ");
            String name = data[0];
            String id = data[1];

            if (!mapCompanies.containsKey(name)){

            mapCompanies.putIfAbsent(name,new ArrayList<>());}

            if (!mapCompanies.get(name).contains(id)){
                mapCompanies.get(name).add(id);
            }


            input = scanner.nextLine();

        }
        mapCompanies.entrySet().forEach((entry)-> { System.out.printf("%s%n",entry.getKey());
        entry.getValue().forEach(id-> System.out.printf("-- %s%n",id));});
    }
}
