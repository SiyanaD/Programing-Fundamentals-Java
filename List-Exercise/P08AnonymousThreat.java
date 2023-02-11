package ListsExersice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P08AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String>text = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("3:1")){
            if (command.contains("merge")){
                int startIndex=Integer.parseInt(command.split(" ")[1]);
                int endIndex=Integer.parseInt(command.split(" ")[2]);
                if (startIndex<0){
                    startIndex=0;
                }
                if (endIndex>text.size()-1) {
                    endIndex=text.size()-1;
                }
                if (startIndex>=0 && startIndex<=text.size()-1 && endIndex>=0 && endIndex<=text.size()-1){


                String resultMerge= "";
                for (int index = startIndex; index <=endIndex; index++) {
                    String current = text.get(index);
                    resultMerge+=current;
                }
                for (int index = startIndex; index <=endIndex; index++) {
                    text.remove(startIndex);
                }
                text.add(startIndex,resultMerge);}

            } else if (command.contains("divide")) {
                int index=Integer.parseInt(command.split(" ")[1]);
                int parts = Integer.parseInt(command.split(" ")[2]);
                if (index>=0 && index<=text.size()-1){

                String textForDivide = text.get(index);
                text.remove(index);
                 int countSymbolsPerPart = textForDivide.length()/parts;
                 int beginIndex=0;
                for (int part = 1; part <parts; part++) {
                    String textPerPart = textForDivide.substring(beginIndex,beginIndex+countSymbolsPerPart);
                    text.add(index,textPerPart);
                    index++;
                    beginIndex+=countSymbolsPerPart;
                }
                String textLastPart=textForDivide.substring(beginIndex,textForDivide.length());
                text.add(index,textLastPart);
            }}
            command=scanner.nextLine();
        }
        System.out.println(String.join(" ",text));



    }
}
