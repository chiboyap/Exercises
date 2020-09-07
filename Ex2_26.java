/* Programmer: ALIONYE PASCHAL CHINAEMEREM
   Date: 9/1/2020
   Time: 2:09 PM
*/

import java.util.Scanner;

public class Ex2_26 {
    public static void main (String [] args){
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integers: ");
        a = input.nextInt();
        b = input.nextInt();

        //check if the first number is a multiple of the second
        if (b % a == 0)
            System.out.printf("%d is a multiple of %d", a, b);
        else
            System.out.printf("%d is not a multiple of %d", a, b);
    }
}

