
package ntp.ı;

import java.util.Scanner;


 @author Serhat

public class NTPII {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        System.out.println("Please write a three number -> (Z+)");
        float x = number.nextFloat();
        float y = number.nextFloat();
        float z = number.nextFloat();

        //bug1.0
        if (x == y || x == z || y == z) {
            System.out.println("Please enter different integers");
        }

        //bug1.1
        else if (x - (int) x != 0 || y - (int) y != 0 || z - (int) z != 0) {
            System.out.println("Please write a positive integer");
        } else if (x < 0 || y < 0 || z < 0) {
            System.out.println("Please write a positive number");
        }

        //Vers1
        else if (x > y && x > z) {

            System.out.println("Largest number: " + x);
            
            if (y > z) {

                System.out.println("Second largest number: " + y);
                System.out.println("Smallest number: " + z);
                
            } else {

                System.out.println("Second largest number: " + z);
                System.out.println("Smallest number: " + y);

            }
        } //Vers2
        else if (y > x && y > z) {

            System.out.println("Largest number:  " + y);

            if (x > z) {

                System.out.println("Second largest number: " + x);
                System.out.println("Smallest number: " + z);

            } else {

                System.out.println("Second largest number: " + z);
                System.out.println("Smallest number: " + x);

            }
        } //Vers3
        else if (z > x && z > y) {

            System.out.println("Largest number: " + z);

            if (x > y) {

                System.out.println("Second largest number: " + x);
                System.out.println("Smallest number: " + y);

            } else {

                System.out.println("Second largest number: " + y);
                System.out.println("Smallest number: " + x);

            }
        }

    }

}
