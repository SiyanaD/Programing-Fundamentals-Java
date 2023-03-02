package mapsLambdaAndStreamAPILab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class p01CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double [] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();

        Map<Double,Integer> map = new TreeMap<>();

        for (double num: numbers){

            if (!map.containsKey(num)){
                map.put(num,0);
            }
            map.put(num,map.get(num)+1);
        }
        for (Map.Entry<Double,Integer> entry:map.entrySet()){
            DecimalFormat df = new DecimalFormat("#.######");
           System.out.printf("%s -> %s%n",df.format(entry.getKey()),entry.getValue());
       }



    }
}
