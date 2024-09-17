package Mentoring;

import java.util.Scanner;

public class RepeatedChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
//        str = str.replaceAll("\\?+", "?");
//        str = str.replaceAll("!+", "!");
//        System.out.println(str);
        char prev = '*';
        StringBuilder ans = new StringBuilder();

        for(int i = 0; i < str.length(); i++){
            char cur = str.charAt(i);
            if((cur == '?' || cur == '!') && cur == prev){
                continue;
            }
            ans.append(cur);
            prev = cur;
        }
        System.out.println(ans.toString());
    }
}
