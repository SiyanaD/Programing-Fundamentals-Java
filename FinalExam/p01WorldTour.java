package FinalExam;

import java.util.Scanner;

public class p01WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(scanner.nextLine());
        String data = scanner.nextLine();

        while (!data.equals("Travel")){

            String[] input = data.split(":");
            //•	"Add Stop:{index}:{string}":
            //o	Insert the given string at that index only if the index is valid
            if(input[0].equals("Add Stop")){

                int index = Integer.parseInt(input[1]);
                String string = input[2];

                if (index>=0 && index<=sb.length()-1){//валидираме индекса
                sb.insert(index,string);

                }

            }
            //•	"Remove Stop:{start_index}:{end_index}":
            //o	Remove the elements of the string
            // from the starting index to the end index (inclusive) if both indices are valid
            else if (input[0].equals("Remove Stop")) {
                int startIndex = Integer.parseInt(input[1]);
                int endIndex = Integer.parseInt(input[2]);


                if (startIndex>=0 && startIndex<=sb.length()-1 && endIndex>=0 && endIndex<=sb.length()-1){//валидираме индексите if both indices are valid
                    sb.delete(startIndex,endIndex+1);

                }

            }

            //•	"Switch:{old_string}:{new_string}":
            //o	If the old string is in the initial string, replace it with the new one (all occurrences)
            else if (input[0].equals("Switch")) {
                String oldString =input[1];
                String newString = input[2];
                //!!! правим замяната на oldString с newString, само ако стария съществува
                if (sb.toString().contains(oldString)){
                String replaceString = sb.toString().replaceAll(oldString,newString);
                sb.setLength(0);// така изтриваме записа който имаме до момента
                sb.append(replaceString);// слагаме новия запис

                }
            }

            //Note: After each command, print the current state of the string!
            System.out.println(sb);
            data=scanner.nextLine();
        }
        //After the "Travel" command, print the following: "Ready for world tour! Planned stops: {string}"

        System.out.printf("Ready for world tour! Planned stops: %s%n",sb.toString());
    }
}
