package mapsLambdaAndStreamAPIExercise;

import java.util.*;

public class p09ForceBook {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> mapSide = new LinkedHashMap<>();


        String  input =scanner.nextLine();
        while (!input.equals("Lumpawaroo")){

            if (input.contains("|")){

                String [] data=input.split("\\s+\\|\\s+");
                String side = data[0];
                String user = data[1];



                mapSide.putIfAbsent(side,new ArrayList<>());

                if (!mapSide.get(side).contains(user)){
                    mapSide.get(side).add(user);
                }

            }
            if (input.contains("->")){

                String [] data=input.split("\\s+->\\s+");
                String side = data[1];
                String user = data[0];


                mapSide.forEach((k,v)->v.remove(user));

                mapSide.putIfAbsent(side,new ArrayList<>());
                mapSide.get(side).add(user);

                System.out.printf("%s joins the %s side!%n",user,side);


            }

            input= scanner.nextLine();
        }
        //mapCompanies.entrySet().forEach((entry)-> { System.out.printf("%s%n",entry.getKey());
        //        entry.getValue().forEach(id-> System.out.printf("-- %s%n",id));});



        mapSide.entrySet().forEach((entry)->{
            if (entry.getValue().size()!=0){

                System.out.printf("Side: %s, Members: %s%n",entry.getKey(),entry.getValue().size());
                entry.getValue().forEach(id-> System.out.printf("! %s%n",id));
            }});



    }
}
