package Mentoring;

import java.util.Scanner;

public class CatRat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int cat = 0;
        int rat = 0;
        for (int i = 0; i < str.length()-2; i++) {
            String cur = str.substring(i, i+3);
            if(cur.equals("cat")) cat++;
            else if(cur.equals("rat")) rat++;
        }
        System.out.println(cat == rat);
    }
}
