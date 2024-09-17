package Mentoring;

import java.util.Scanner;

public class InsideOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if(str.length() % 2 == 0){
            StringBuilder sb = new StringBuilder(str.substring(0,str.length()/2));
            System.out.print(sb.reverse().toString());
            sb = new StringBuilder(str.substring(str.length()/2));
            System.out.print(sb.reverse().toString());
        }else{
            StringBuilder sb = new StringBuilder(str.substring(0,str.length()/2));
            System.out.print(sb.reverse().toString());
            System.out.print(str.charAt(str.length()/2));
            sb = new StringBuilder(str.substring(str.length()/2 + 1));
            System.out.print(sb.reverse().toString());
        }
    }
}
