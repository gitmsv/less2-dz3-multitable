/*
* This application displays the multiplication table of a given numbr number,
* numbr is user-defined
 */
package ua.jvlab.smlnk;

import java.util.Scanner;

/**
 * @author: $.m.lnk
 * @version: 1.0.0
 * @date: 09.01.2018
 */
public class TablRuns {

    /**
     * @param args the command line arguments, number is user-defined
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        {
            int numbr;
            System.out.println("Enter the number to output the multiplication"
                    + " table X 10:");
            numbr = sc.nextInt();
            System.out.println("-- result --");
            for (int i = 1; i <= 10; i++) {
                System.out.println(numbr + " x " + i + " = " + numbr * i);
                sc.close();
            }

        }

    }
}
