package Mentoring_Session.Week4;

import java.util.Scanner;
public class Q5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0 ; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.print("Reversed Array:");
        for(int i = n-1; i>= 0; i--){
            System.out.print(" " + nums[i]);
        }
    }
}