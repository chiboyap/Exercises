/* Programmer: ALIONYE PASCHAL CHINAEMEREM
   Date: 9/1/2020
   Time: 2:31 PM
*/

import java.util.Scanner;

public class Ex2_28 {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the diameter of the Radius of the Circle: ");
        double r = input.nextInt();
        System.out.printf("Radius = %f%n", r);

        System.out.printf("Diameter = %f%n", (2 * r)); // diplsays the diameter
        System.out.printf("Circumference = %f%n", (2 * Math.PI * r )); //displays circumference
        System.out.printf("Area = %f", (Math.PI * r *r));
    }
}
