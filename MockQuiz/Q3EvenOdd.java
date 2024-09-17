package MockQuiz;

import java.util.Scanner;

public class Q3EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String even = "Even numbers: ";
        String odd = "Odd numbers: ";
        for(int i = 1; i<=n; i+=2){
            odd += i + " ";
        }
        for(int i = 2; i<=n; i+=2){
            even += i + " ";
        }
        System.out.println(even);
        System.out.println(odd);
    }
}
