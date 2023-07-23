package FinalExam;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class p03MonthlyReport {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String commands=scanner.nextLine();
        Map<String, List<String>> delivery = new LinkedHashMap<>();



        while (!commands.equals("End")){

            String [] data = commands.split("\\s+");
            if (data[0].equals("Deliver")){
               String distributorName = data[1];
               double moneySpend = Double.parseDouble(data[2]);
             if (!delivery.containsKey(distributorName)){

             }



            }
            else if (data[0].equals("Return")) {

            }
            else if (data[0].equals("Sell")) {

            }


            commands = scanner.nextLine();
        }
    }

}
