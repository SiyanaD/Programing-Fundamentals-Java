package FinalExam;

import java.util.Scanner;


public class p01SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("Reveal")){

          String [] input = command.split(":\\|:");

            if (input[0].equals("InsertSpace")){
                int index = Integer.parseInt(input[1]);

                sb.insert(index," ");
            }
            else if (input[0].equals("Reverse")) {
                StringBuilder substring = new StringBuilder(input[1]);
                if (sb.toString().contains(substring)){

                  int startIndex=  sb.indexOf(String.valueOf(substring.charAt(0)));//връща стартов индекс от sb
                    // valueOf - превръща char '' в стринг с ""  и с indexOf дава позицията на която се намира стартовия индекс
                    //substring.charAt(0)-взимаме самия индекс на substring стартов индекс като char
                    int endPosition = startIndex+substring.length()-1;
                    //дава индекса на краината позиция на substringa-част от дума
                    sb.delete(startIndex,endPosition+1);
                    // по дефаулт delete започва от стартов индекс но не и вкл. последния индекс и затова добавяме +1
                    substring.reverse();
                    sb.append(substring);
                }
                else {
                    System.out.println("error");
                    //след това се дава да чете нов ред от конзолата и оператора continue
                    command= scanner.nextLine();
                    continue;
                }
            } else if (input[0].equals("ChangeAll")) {
                String occurrence = input[1];
                String replacement = input[2];
                String replaceString = sb.toString().replaceAll(occurrence,replacement);
                //  на sb когато му дадем .toString има replaceAll
                sb.setLength(0);// така изтриваме записа който имаме до момента
                sb.append(replaceString);// слагаме новия запис

            }
            System.out.println(sb.toString());//така принтираме след всяка команда промененото съобщение

            command=scanner.nextLine();
        }
        System.out.print("You have a new text message: "+ sb);
    }
}
