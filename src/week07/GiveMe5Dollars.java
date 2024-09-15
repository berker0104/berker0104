package week07;

import java.util.Scanner;

/*
keep asking to enter 5
thank you for 5 dollars
 */


public class GiveMe5Dollars {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dollars;

        do {
            System.out.println("Give me $5");
             dollars = input.nextInt();

        } while (dollars != 5);

        System.out.println("Thank you for $5");
        input.close();



    }
}