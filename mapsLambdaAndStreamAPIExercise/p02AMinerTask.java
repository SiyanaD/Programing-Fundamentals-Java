package mapsLambdaAndStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class p02AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Map<String,Integer> collect = new LinkedHashMap<>();
        while (!command.equals("stop")){
            int quantity = Integer.parseInt(scanner.nextLine());

            collect.putIfAbsent(command,0);
            collect.put(command,collect.get(command)+quantity);




           // if (!collect.containsKey(command)){
             //   collect.put(command,quantity);
            //}
            //else {
              //  collect.put(command,collect.get(command)+quantity);
            //}

            command = scanner.nextLine();
        }
        collect.forEach((k,v)->System.out.printf("%s -> %d%n",k,v));
    }
}
