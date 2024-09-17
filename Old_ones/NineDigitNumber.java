package Mentoring;

import java.util.Scanner;

public class NineDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int result = 0;
        int index = 1;
        //Integer.parseInt() Character.getNumericValue()
        //Integer.parseInt( num.charAt(4) + "" )
        if( Character.getNumericValue(num.charAt(4)) % 2 == 0 ){
            index = 0;
        }
        for(; index<num.length(); index += 2){
            result += Character.getNumericValue(num.charAt(index));
        }
        System.out.println(result);
    }
}
