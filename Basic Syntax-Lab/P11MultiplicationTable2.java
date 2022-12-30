package BasicSyntaxLab;

import java.util.Scanner;

public class P11MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int i = Integer.parseInt(scanner.nextLine());


        do {
            System.out.printf("%d X %d = %d%n",n,i,n*i);
            i++;
        }while (i<=10);



        
    }
}
