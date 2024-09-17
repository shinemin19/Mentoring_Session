package Quiz01;

import java.util.Scanner;

public class LotteryChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String lottery = sc.nextLine();
        if(lottery.equals("199606")) System.out.println("6000000");
        else{
            String firstThree = lottery.substring(0,3);
            String secondThree = lottery.substring(3);
            String lastTwo = lottery.substring(4);
            int money = 0;
            if(firstThree.equals("173") || firstThree.equals("220")) money += 4000;
            if(secondThree.equals("388") || secondThree.equals("094")) money += 4000;
            if(lastTwo.equals("94")) money += 2000;
            System.out.println(money);
        }
    }
}
