package mapsLambdaAndStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class p07LegendaryFarming {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean isWinner = false;
        Map<String,Integer> mapItem = new LinkedHashMap<>();
        mapItem.put("shards",0);
        mapItem.put("fragments",0);
        mapItem.put("motes",0);
        String winner = "";

        while (!isWinner){

            String [] input = scanner.nextLine().split("\\s+");

            for (int i = 0; i <input.length-1 ; i+=2) {

                int quantity = Integer.parseInt(input[i]);
                String name = input[i+1].toLowerCase();

                mapItem.putIfAbsent(name,0);
                mapItem.put(name,mapItem.get(name)+quantity);

                if (name.equals("shards")||name.equals("fragments")||name.equals("motes")){
                    if (mapItem.get(name)>=250){
                        mapItem.put(name,mapItem.get(name)-250);
                        winner=name;
                        isWinner=true;
                        break;

                    }
                }
            }
        }
        if (winner.equals("shards")){
            System.out.println("Shadowmourne obtained!");
        } else if (winner.equals("fragments")) {

            System.out.println("Valanyr obtained!");
        } else if (winner.equals("motes")) {
            System.out.println("Dragonwrath obtained!");

        }
        mapItem.forEach((k,v)-> System.out.printf("%s: %d%n",k,v));


    }
    }

