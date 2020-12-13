/* HW from 10.12.2020
1. input two int numbers from the user a, b
   print a > b, or a < b or a == b 
   for example, if a = 3 and b = 4:
       print "3 < 4"
   for example, if a = 7 and b = 1:
       print "7 > 1"
   for example, if a = 9 and b = 9:
       print "9 == 9"
2. write a loop which prints all the numbers from 5 to 10
3. write a loop which inputs a number from the user until a number bigger than 100 is given
4. *etgar: print all the even numbers from 4 to 100.
           should be like: 4, 6, 8, 10, ... 100
5. *etgar: input two numbers from the user until the two numbers are the same

*/


package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

    // ex1
        System.out.println("Please enter two integers: ");
        int a = prn.nextInt();
        int b = prn.nextInt();
        if (a > b)
        {
            System.out.println(String.format("%d > %d", a, b));
        }
        else if (a < b)
        {
            System.out.println(String.format("%d < %d", a, b));
        }
        else
            System.out.println(String.format("%d = %d", a, b));

    // ex2
        int c = 5;
        while (c <= 10)
        {
            System.out.println("The current number is " + c);
            c++;
        }

    // ex3
        System.out.println("Please enter an integer: ");
        int num = prn.nextInt();
        while (num <= 100)
        {
            System.out.println("Please enter another number: ");
            num = prn.nextInt();
        }
        System.out.println(String.format("The last number you entered, %d, is larger than 100", num));

    // ex4 (etgar)
        int evennum = 2;
        while (evennum < 100)
        {
            evennum += 2;
            System.out.println(evennum);
        }
        System.out.println("That was all even numbers between 4 and 100.");

    // ex 5 (etgar)
        System.out.println("Please enter two integers:  ");
        int com1 = prn.nextInt();
        int com2 = prn.nextInt();
        while (com1 != com2)
        {
            System.out.println("Please enter two more numbers: ");
            com1 = prn.nextInt();
            com2 = prn.nextInt();
        }
        System.out.println(String.format("The last two numbers, %d and %d, are equal.", com1, com2)); 
        
    }
}
