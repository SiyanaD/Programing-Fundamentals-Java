package ListsExersice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P09PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int sum = 0;

        while (numbers.size()>0){

            int index = Integer.parseInt(scanner.nextLine());

            if (index<0){
                int firstElement = numbers.get(0);
                numbers.remove(0);
                sum+=firstElement;
                int lastElement = numbers.get(numbers.size()-1);
                numbers.add(0,lastElement);

                modifyList(numbers,firstElement);

                
            } else if (index>numbers.size()-1) {
                int lastElement = numbers.get(numbers.size()-1);
                numbers.remove(numbers.size()-1);
                sum+=lastElement;
                int firstElement = numbers.get(0);
                numbers.add(firstElement);
                modifyList(numbers,lastElement);

                
            } else if (index>=0 && index<=numbers.size()-1) {
                int removeNumber = numbers.get(index);
                sum+=removeNumber;
                numbers.remove(index);
                modifyList(numbers,removeNumber);

            }


        }
        System.out.println(sum);

    }
    public static void modifyList (List<Integer> numbers,int removeNumber){
        for (int index = 0; index <=numbers.size()-1 ; index++) {
            int currentElement = numbers.get(index);
            if (currentElement<=removeNumber){
                currentElement+=removeNumber;
            } else  {
                currentElement-=removeNumber;
            }
            numbers.set(index,currentElement);

        }
    }

}
