package MockQuiz;

import java.util.Scanner;

public class Q5MeanStandard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        double sq_sum = 0;
        for(int i = 0; i< 10; i++){
            double x = sc.nextDouble();
            sum += x;
            sq_sum += (x*x);
        }
        System.out.println("Mean: " + sum/10);
        System.out.println(String.format("SD: %.5f", Math.sqrt((sq_sum - (sum * sum)/10 ) / 9)));
    }
}
