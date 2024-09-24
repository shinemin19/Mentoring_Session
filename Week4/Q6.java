package Mentoring_Session.Week4;

import java.util.Scanner;
public class Q6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0 ; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int find = sc.nextInt();
        int ind = -1;
        for(int i = 0; i<n ;i++){
            if(find == nums[i]){
                ind = i;
                break;
            }
        }
        System.out.println("Index of Target: " + ind);
    }
}