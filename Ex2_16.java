
/* Created By Alionye Chinaemerem Paschal
 * on 8/19/2020 - by 3:28 PM
 */

import java.util.Scanner;

public class Ex2_16 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the First Intger: ");
        int a = input.nextInt();
        //int b = input.nextInt();
       /* int result = Math.max(a, b);
        System.out.println(result);*/

        System.out.println("Enter the second Intger: ");
        int b = input.nextInt();
        if (a > b)
        System.out.println(a + " is larger");
        else if (a < b)
        System.out.println(b + " is larger");
        else
        System.out.println("These numbers are equal");
    }
}
