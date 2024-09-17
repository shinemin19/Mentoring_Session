package MockQuiz;

import java.util.Scanner;

public class Q4FiboLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a1 = 0;
        int a2 = 1;
        while(a1 <= n){
            System.out.print(a1 + " ");
            int a3 = a1 + a2;
            a1 = a2;
            a2 = a3;
        }
    }
}
