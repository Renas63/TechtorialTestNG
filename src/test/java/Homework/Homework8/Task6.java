package Homework.Homework8;

import java.util.Scanner;

public class Task6 {
    /*
    Write the program to print the numbers between 10 to 100
    those number will be increased with 10 every time.
Here is the example output:
10
20 30 40 ..
.. 100
     */
    public static void main(String[] args) {
        System.out.println(" Please enter a number between 10 to 100");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int i = 0;// WHILE
        while (i <= 100) {
            System.out.println(i);
            i += 10;


            System.out.println("****************************");
            int j = 10;
            for (j = 10; j <= 100; j += 10) {
                System.out.println(j);
            }

        }
    }
}
