package Mentoring_Session.Week4;

import java.util.Scanner;
public class Q3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //actually you don't even need the array for this
        int n = sc.nextInt();
        int[] nums = new int[n];
        //take inputs
        for(int i = 0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        //get the max
        int max = nums[0]; //assume the first element as max
        //the first element doesn't need to be compared as it is already stored in max
        for(int i = 1; i<n; i++){
            if(nums[i] > max) max = nums[i];
        }
        System.out.println("Maximum Element: " + max);
    }
}
