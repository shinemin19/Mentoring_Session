package MockQuiz;

import java.util.Scanner;

public class Q8ValidIP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ip = sc.nextLine().split("\\.");
        Boolean valid = true;
        for(int i = 0; i<4; i++){
            int x = Integer.parseInt(ip[i]);
            if(x < 0 || x > 256){
                valid = false;
                break;
            }
        }
        System.out.println( valid? "Valid" : "Invalid");
    }
}
