package mapsLambdaAndStreamAPIExercise;

import java.util.*;

public class p04SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String,String> registerStudents = new LinkedHashMap<>();

        for (int people = 1; people <=n; people++) {
            String input = scanner.nextLine();
            String [] data = input.split("\\s+");
            String type = data[0];


            if (type.equals("register")){
                String name = data[1];
                String carNumber = data[2];
                if (registerStudents.containsKey(name)){

                    System.out.printf("ERROR: already registered with plate number %s%n",carNumber);
                } else if (!registerStudents.containsKey(name)) {
                    registerStudents.put(name,carNumber);
                    System.out.printf("%s registered %s successfully%n",name,carNumber);

                }


            } else if (type.equals("unregister")) {
                String name = data[1];

                if (!registerStudents.containsKey(name)){

                    System.out.printf("ERROR: user %s not found%n",name);


                } else  {
                    registerStudents.remove(name);
                    System.out.printf("%s unregistered successfully%n",name);

                }


            }



        }
        registerStudents.forEach((k,v)-> System.out.printf("%s => %s%n",k,v));
    }
}
