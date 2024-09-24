package Mentoring_Session.Week4;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //actually this problem can be done without an array
        int n = sc.nextInt();
        int[] nums = new int[n];
        double sum = 0; //declare it double type to get avg as double type
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
//            sum += nums[i];
        }
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }
        System.out.println("Average of Elements: " + sum / n);
    }
}
