package MethodsExercise;

import java.util.Scanner;

public class P07NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        nxnMatrix(n);
    }
    public static void nxnMatrix(int n){
        for (int rows = 1; rows <= n; rows++) {
            for (int c = 1; c <= n; c++) {
                System.out.print(n + " ");

            }
            System.out.println();

        }
    }
}
