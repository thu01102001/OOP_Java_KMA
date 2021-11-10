/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTap8;

/**
 *
 * @author Administrator
 */
//Ứng dụng ATM
//Input: Money / chia hết cho 10 000
//output: Số tờ tiền mỗi loại
import java.util.Scanner;
public class RunMain {
    public static void main(String[] args) {
        int money = 0;
        final int FIVE_HUNDRED_THOUSAND = 500000;
        final int TWO_HUNDRED_THOUSAND = 200000;
        final int ONE_HUNDRED_THOUSAND = 100000;
        final int FIFTY_THOUSAND = 50000;
        final int TWENTY_THOUSAND = 20000;
        final int TEN_THOUSAND = 10000;
        
        int fiveHundredThousand = 0;
        int twoHundredThousand = 0;
        int oneHundredThousand = 0;
        int fiftyThousand = 0;
        int twentyThousand = 0;
        int tenThousand = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Money: ");
        money = sc.nextInt();
        sc.close();
        if(money >= FIVE_HUNDRED_THOUSAND) {
            fiveHundredThousand = money / FIVE_HUNDRED_THOUSAND;
            money = money % FIVE_HUNDRED_THOUSAND;
            System.out.printf("Mệnh giá %d: %d \n", FIVE_HUNDRED_THOUSAND,fiveHundredThousand);
        }
        if(money >= TWO_HUNDRED_THOUSAND) {
            twoHundredThousand = money / TWO_HUNDRED_THOUSAND;
            money = money % TWO_HUNDRED_THOUSAND;
            System.out.printf("Mệnh giá %d: %d \n", TWO_HUNDRED_THOUSAND,twoHundredThousand);
        }
        if(money >= ONE_HUNDRED_THOUSAND) {
            oneHundredThousand = money / ONE_HUNDRED_THOUSAND;
            money = money % ONE_HUNDRED_THOUSAND;
            System.out.printf("Mệnh giá %d: %d \n", ONE_HUNDRED_THOUSAND,oneHundredThousand);
        }
        if(money >= FIFTY_THOUSAND) {
            fiftyThousand = money / FIFTY_THOUSAND;
            money = money % FIFTY_THOUSAND;
            System.out.printf("Mệnh giá %d: %d \n", FIFTY_THOUSAND,fiftyThousand);
        }
        if(money >= TWENTY_THOUSAND) {
            twentyThousand = money / TWENTY_THOUSAND;
            money = money % TWENTY_THOUSAND;
            System.out.printf("Mệnh giá %d: %d \n", TWENTY_THOUSAND,twentyThousand);
        }
        if(money >= TEN_THOUSAND) {
            tenThousand = money / TEN_THOUSAND;
            money = money % TEN_THOUSAND;
            System.out.printf("Mệnh giá %d: %d \n", TEN_THOUSAND,tenThousand);
        }
    }
}
