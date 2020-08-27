
/* Created By Alionye Chinaemerem Paschal
 * on 8/19/2020 - by 2:48 PM
 */

import java.util.Scanner;

public class Ex2_15 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first intger: ");
        int a = input.nextInt();
        System.out.println("Enter the second intger: ");
        int b = input.nextInt();
        int sum = a+b;
        int prod = a*b;
        int diff = a-b;
        int quot = a/b;
        System.out.printf("Sum of %d and %d is " + sum + "\n", a, b);
        System.out.printf("Product of %d and %d is " + prod+ "\n", a, b);
        System.out.printf("Difference of %d and %d is " + diff+ "\n", a, b);
        System.out.printf("Quotient of %d and %d is " + quot, a, b);
    }
}
