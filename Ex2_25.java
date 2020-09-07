/* Programmer: ALIONYE PASCHAL CHINAEMEREM
   Date: 9/1/2020
   Time: 1:56 PM
*/

import java.util.Scanner;

public class Ex2_25 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("Enter any integer number: "); //prompt the user for input
        num = input.nextInt();

        //check if number is even or odd
        if (num % 2 == 0)
            System.out.printf("%d is an Even number", num);
        else
            System.out.printf("%d is an Odd number", num);
    }
}
