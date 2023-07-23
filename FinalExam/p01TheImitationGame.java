package FinalExam;

import java.util.Scanner;

public class p01TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //On the first line of the input, you will receive the encrypted message
        String encryptedMessage = scanner.nextLine();
        StringBuilder sb = new StringBuilder(encryptedMessage);


        //After that, until the "Decode" command is given, you will be receiving strings
        // with instructions for different operations that need to be performed
        String input = scanner.nextLine();

        while (!input.equals("Decode")){

            //input = •	"Move {number of letters}":
            if (input.contains("Move")){
                //Moves the first n letters to the back of the string
                int nLetters=Integer.parseInt(input.split("\\|")[1]);

                //взимам всички символи от 0 индекс до последния
                String firstLetters = sb.substring(0,nLetters);//взимаме буквите за местене
                sb.replace(0,nLetters,"");//от 0 индекс до буквите за местене заменяме с нищо
                sb.append(firstLetters);


            }
            else if (input.contains("Insert")) {
                //input= •	"Insert {index} {value}"
                //Inserts the given value before the given index in the string
                int index = Integer.parseInt(input.split("\\|")[1]);//индексът на който ще вмъкваме
                String value=input.split("\\|")[2];//текста, който трябва да вмъкваме
                sb.insert(index,value);


            }
            else if (input.contains("ChangeAll")) {
                //input = •	"ChangeAll {substring} {replacement}"
                //Changes all occurrences of the given substring with the replacement text
                String textForChange = input.split("\\|")[1];//текст който трябва да се променя
                String replacementText = input.split("\\|")[2];//текстът който ще заместваме

//
                //replace на sb няма да ни свърши работа, колкото replaceAll на Stringa
                String currentMessage = sb.toString();//Моментното съобщение
               currentMessage= currentMessage.replace(textForChange,replacementText);
               //след модификацията отново слагаме съобщението в sb
               sb=new StringBuilder(currentMessage);

            }
            input = scanner.nextLine();
        }
        System.out.printf("The decrypted message is: %s%n",sb);

    }
}
