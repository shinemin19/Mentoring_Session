package MockQuiz;

import java.util.Scanner;

public class Q7Century {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int century = year / 100;
        if(year % 100 != 0) century++;
        if(century == 11 || century == 12 || century == 13){
            System.out.println(century + "th");
        }else{
            int endYear = century % 10;
            switch(endYear){
                case 1:
                    System.out.println(century + "st");
                    break;
                case 2:
                    System.out.println(century + "nd");
                    break;
                case 3:
                    System.out.println(century + "rd");
                    break;
                default:
                    System.out.println(century + "th");
            }
        }
    }
}
