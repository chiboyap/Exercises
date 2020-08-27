

/* Created By Alionye Chinaemerem Paschal
 * on 8/18/2020 - by 3:48 PM
 */

// the program performs simple payoll calculation
import java.util.Scanner;

public class Ex2_8 {
    public static void main (String []args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Intger:");
        int b = input.nextInt();
        System.out.print("Enter the Intger:");
        int c = input.nextInt();
        int a = b * c;
        System.out.printf("The Product of %d and %d is %d", b, c, a);

    }
}
