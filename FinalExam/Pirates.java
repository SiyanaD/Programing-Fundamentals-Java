package FinalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String line = scanner.nextLine();

        Map<String, Town> towns = new LinkedHashMap<>();
        //създаваме си  static class Town и добавяме constructor, getter and setter

        while (!line.equals("Sail")) {


            String[] data = line.split("\\|\\|");
            String name = data[0];
            int population = Integer.parseInt(data[1]);
            int gold = Integer.parseInt(data[2]);

            if (towns.containsKey(name)) {//ако града се съдържа в конзолата и трябва да добавим стойността
                Town town = towns.get(name);//towns.get(name) - връща града с това име
                town.setGold(town.getGold() + gold);//добавяме новата стойност на златото + старата
                town.setPopulation(town.getPopulation() + population);
            } else {
                Town town = new Town(name, population, gold);//ако града не се съдържа, трябва да създадем нов град

                towns.put(name, town);//добавяме града, като key даваме името на града а като value самия обект town
            }
            line = scanner.nextLine();
        }
        line = scanner.nextLine();
        while (!line.equals("End")) {
            String[] data = line.split("=>");
            String event = data[0];

            String name = data[1];// еднакво е и за двата casе-a
          Town town =  towns.get(name);//от мапа с градове взимаме града
            switch (event) {

                case "Plunder":

                    int people = Integer.parseInt(data[2]);
                    int gold = Integer.parseInt(data[3]);
                    town.setGold(town.getGold()-gold);//изваждаш златото
                    town.setPopulation(town.getPopulation()-people); //изваждаш броя на убитите хора
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n",name,gold,people);

                    if (town.getGold()==0||town.getPopulation()==0){//	If any of those two values (population or gold) reaches zero
                        System.out.printf("%s has been wiped off the map!%n",name);
                        towns.remove(town.getName());//remove it from your collection of targeted cities
                    }
                    //There will be no case of receiving more people or gold than there is in the city.- дадено по узловие и няма нужда от проверка

                    break;
                case "Prosper":
                    int goldProsper = Integer.parseInt(data[2]);
                    if (goldProsper<0){
                        System.out.println("Gold added cannot be a negative number!");
                        line=scanner.nextLine();//игнорираш командата
                        continue;//игнорираш командата с 2 та елемента: line=scanner.nextLine(); и  continue;
                    }
                    town.setGold(town.getGold()+goldProsper);
                    System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n",goldProsper,name,town.getGold());//town.getGold()- total gold връща

                    break;
            }

            line = scanner.nextLine();
        }
        if (towns.isEmpty()){ //If there are no settlements left to plunder, print-ako града е празен
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }
        else {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n",towns.size());//towns.size() - броя на градовете
            //{town1} -> Population: {people} citizens, Gold: {gold} kg- принтираме с  toString - метода
            towns.values().forEach(System.out::println);

        }



    }

    static class Town {
        String name;
        int population;
        int gold;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPopulation() {
            return population;
        }

        public void setPopulation(int population) {
            this.population = population;
        }

        public int getGold() {
            return gold;
        }

        public void setGold(int gold) {
            this.gold = gold;
        }

        public Town(String name, int population, int gold) {
            this.name = name;
            this.population = population;
            this.gold = gold;
        }

        @Override
        public String toString() {
            return String.format("%s -> Population: %d citizens, Gold: %d kg",name,population,gold);
        }
    }

}

