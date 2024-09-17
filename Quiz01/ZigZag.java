package Quiz01;

import java.util.Scanner;

public class ZigZag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int row = sc.nextInt();
        int up = 2 * (row - 1);
        int lo = 0;
        if(row == 1) System.out.println(str);
        else{
            for(int i = 0; i<row; i++){
                int cur = i;
                if(cur < str.length()) System.out.print(str.charAt(cur));
                while(cur < str.length()){
                    if(up != 0){
                        if(cur + up < str.length()) System.out.print(str.charAt(cur + up));
                        cur += up;
                    }
                    if(lo != 0){
                        if(cur + lo < str.length()) System.out.print(str.charAt(cur + lo));
                        cur += lo;
                    }
                }
                up -= 2;
                lo += 2;
            }
        }

    }
}
