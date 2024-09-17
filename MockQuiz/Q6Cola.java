package MockQuiz;

import java.util.Scanner;

public class Q6Cola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char first = sc.next().charAt(0);
        char second = (first == 'A') ? 'B' : 'A';
        int n = sc.nextInt();
        int endNum = 2;
        int addNum = 4;
        int round = 1;
        while(n > endNum){
            endNum += addNum;
            addNum += 2;
            round++;
        }
        System.out.println( (n > round*round) ? second : first );
    }
}
