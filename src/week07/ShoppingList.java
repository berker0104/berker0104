package week07;


import java.util.Scanner;


public class ShoppingList {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String items = " ";
        String answer = " ";


        do {

            System.out.println("Enter item name: ");
            String item = input.nextLine();
            items += item + " , ";

            System.out.println("Would you like to add more items?");
            answer = input.next();
            input.nextLine();
        } while (answer.equals("yes"));

        System.out.println("All items = " + items);

    }
}










/*

Shopping List [do while, String]

    create a program that create a shopping list for the user.
    The program will ask the user to enter the items one by one.

    the flow:
        ask the user for the item
        add item to the shopping list
        ask user if they want to add more items

    when the user is done creating the list print it

 */