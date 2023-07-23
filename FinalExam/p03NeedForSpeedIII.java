package FinalExam;

import java.util.*;

public class p03NeedForSpeedIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,List<Integer>> mapCar = new LinkedHashMap<>();

        int numberOfCars = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <=numberOfCars ; i++) {
            //On the next n lines, the cars themselves will follow with their mileage and fuel available,
            // separated by "|" in the following format
            String [] input= scanner.nextLine().split("\\|");
            //"{car}|{mileage}|{fuel}"
            String modelCar = input[0];
            int mileage = Integer.parseInt(input[1]);
            int fuel = Integer.parseInt(input[2]);
            mapCar.putIfAbsent(modelCar,new ArrayList<>());
            mapCar.get(modelCar).add(mileage);//0 - индекс
            mapCar.get(modelCar).add(fuel);//1-индекс
            System.out.println();
        }

        //Then, you will be receiving different commands, each on a new line,
        // separated by " : ", until the "Stop" command is given:
        String commands = scanner.nextLine();
        while (!commands.equals("Stop")){
            String [] data = commands.split(" : ");

            //•	"Drive : {car} : {distance} : {fuel}":
            if (data[0].equals("Drive")){
                String car = data[1];
                int distance = Integer.parseInt(data[2]);
                int fuel = Integer.parseInt(data[3]);
                //o	You need to drive the given distance,
                // and you will need the given fuel to do that.
                // If the car doesn't have enough fuel, print: "Not enough fuel to make that ride"
                int currentFuel = mapCar.get(car).get(1);//текущо количество на горивото в колата
                int currentKm = mapCar.get(car).get(0);//текущо количество на км на колата
                if (currentFuel<fuel){
                    System.out.println("Not enough fuel to make that ride");
                }

                //o	If the car has the required fuel available in the tank, increase its mileage with the given distance,
                // decrease its fuel with the given fuel, and print:
                //"{car} driven for {distance} kilometers. {fuel} liters of fuel consumed."
                else {
                    //decrease its fuel with the given fuel
                    mapCar.get(car).set(1,currentFuel-fuel);
                    // increase its mileage with the given distance
                    mapCar.get(car).set(0,currentKm+distance);
                    System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n",
                                         car,distance,fuel);
                }
                //o	You like driving new cars only, so if a car's mileage reaches 100 000 km, remove it from the collection(s)
                // and print: "Time to sell the {car}!"
                if (mapCar.get(car).get(0)>=100000){
                    System.out.printf("Time to sell the %s!%n",car);
                    mapCar.remove(car);
                }
                
            }
            //Refuel : {car} : {fuel}":
            else if (data[0].equals("Refuel")) {
                String carForRefuel = data[1];
                int fuelForRefuel = Integer.parseInt(data[2]);

                int currentAmountOfFuel = mapCar.get(carForRefuel).get(1);//текущо количество гориво


                //o	Each tank can hold a maximum of 75 liters of fuel,
                // so if the given amount of fuel is more than you can fit in the tank,
                // take only what is required to fill it up.
                //o	Print a message in the following format: "{car} refueled with {fuel} liters"-и за двата случая принтираме когато по малко и по голямо от 75
                if (fuelForRefuel+currentAmountOfFuel>75){
                    mapCar.get(carForRefuel).set(1,75);
                    System.out.printf("%s refueled with %d liters%n", carForRefuel,75-currentAmountOfFuel);

                }
                //ако fuelForRefuel+currentAmountOfFuel<75
                //o	Print a message in the following format: "{car} refueled with {fuel} liters"
                else {
                    System.out.printf("%s refueled with %d liters%n", carForRefuel, fuelForRefuel);
                    mapCar.get(carForRefuel).set(1,fuelForRefuel+currentAmountOfFuel);
                }


            }



            //Revert : {car} : {kilometers}
            else if (data[0].equals("Revert")) {
                String carForRevert = data[1];
                int kilometersForRevert = Integer.parseInt(data[2]);

                int currentKilometers = mapCar.get(carForRevert).get(0);
                //o	If the mileage becomes less than 10 000km after it is decreased, just set it to 10 000km and
                //DO NOT print anything.
                if (currentKilometers-kilometersForRevert<10000){
                    mapCar.get(carForRevert).set(0,10000);
                }

                //o	Decrease the mileage of the given car with the given kilometers and print the kilometers you have decreased
                // it with in the following format:
                //"{car} mileage decreased by {amount reverted} kilometers"
                else {
                    mapCar.get(carForRevert).set(0,currentKilometers-kilometersForRevert);
                    System.out.printf("%s mileage decreased by %d kilometers%n",carForRevert,kilometersForRevert);
                }
            }

            commands=scanner.nextLine();
        }

        //Upon receiving the "Stop" command, you need to print all cars in your possession in the following format:
        //"{car} -> Mileage: {mileage} kms, Fuel in the tank: {fuel} lt."
        mapCar.entrySet().forEach(entry->{
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n",
                               entry.getKey(),entry.getValue().get(0),entry.getValue().get(1));
        });

    }
}
