package Mentoring_Session.Week4;

import java.util.Scanner;
public class Q7{
    public static void main(String[] args){
        //this can be done using only one array
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i<n ; i++){
            nums[i] = sc.nextInt();
        }
        //take another inputs for second array and add it to the first array
        //without creating another arrays
        System.out.print("Element-wise Sum:");
        for(int i = 0; i<n; i++){
            nums[i] += sc.nextInt();
            System.out.print(" " + nums[i]);
        }
    }
}
