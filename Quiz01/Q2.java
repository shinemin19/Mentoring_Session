package Quiz01;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        if(month == 1 || month == 2){
            month += 12;
            year -= 1;
        }
        int j = year/100;
        int k = (year % 100);
        int q = sc.nextInt();
        month += 1;
        int h = ( q + ((26 * month)/10) + k + (k/4) + j/4 + (5*j) ) % 7;
        switch(h){
            case 0:
                System.out.println("Saturday");
                break;
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
        }
    }
}
