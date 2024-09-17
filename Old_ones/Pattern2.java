package Mentoring;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("*".repeat(n-i));
            for(int j = 1; j < (2*i); j++){
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = 1; i <= n-1; i++) {
            System.out.print("*".repeat(i));
            for(int j = 1; j < (2*(n-i)); j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
