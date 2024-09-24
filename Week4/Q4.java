package Mentoring_Session.Week4;

import java.util.Scanner;
public class Q4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //this problem can be done without array
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0 ;i<n; i++){
            nums[i] = sc.nextInt();
        }
        int even = 0;
        for(int num: nums){
            if(num % 2 == 0) even++;
        }
        System.out.println("Count of Even Numbers: " + even);
    }
}