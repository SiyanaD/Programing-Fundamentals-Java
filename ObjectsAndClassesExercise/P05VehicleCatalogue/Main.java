package ObjectsAndClassesExercise.P05VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Vehicle> vehicleList = new ArrayList<>();
        String input = scanner.nextLine();
        while (!input.equals("End")){
            String type = input.split("\\s+")[0];
            String model = input.split("\\s+")[1];
            String color = input.split("\\s+")[2];
            int horsepower = Integer.parseInt
                    (input.split("\\s+")[3]);

            Vehicle vehicle = new Vehicle(type,model,color,
                    horsepower);
            vehicleList.add(vehicle);
            input = scanner.nextLine();
        }
        String command = scanner.nextLine();
        while (!command.equals("Close the Catalogue")){
            for (Vehicle vehicle :vehicleList) {

                if (command.equals(vehicle.getModel())){
                    System.out.println(vehicle);
                    break;
                }
            }
            command = scanner.nextLine();
        }

        System.out.printf("Cars have average horsepower of: %.2f.%n",getAveridgeHP(vehicleList, "car"));
        System.out.printf("Trucks have average horsepower of: %.2f.%n",getAveridgeHP(vehicleList, "truck"));

    }

    private static double getAveridgeHP(List<Vehicle> vehicleList,
                                        String type) {
        double sum = 0;
        int count = 0;
        if (type.equals("car")){
            for(Vehicle vehicle : vehicleList){
                if (vehicle.getType().equals("car")){
                    sum+=vehicle.getHp();
                    count++;
                }
            }
        } else if (type.equals("truck")) {
            for (Vehicle vehicle:vehicleList){
                if (vehicle.getType().equals("truck")){
                    sum+=vehicle.getHp();
                    count++;
                }
            }

        }
        if (sum==0){
            return 0;
        }
        return sum/count;
    }

}
