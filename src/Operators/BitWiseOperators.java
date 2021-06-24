/*
    a - before getting into this lets know that bits have a set value of numbers which go like 16 8 4 2 1 ....
    basically like 2^4  2^3  2^2  2^1  2^0..... .Binary means either 0 or 1 or true and false so when we say 10, it actually means 1 in 2 place and 0 in 1 place so that binary code translates to two. If we want to make 26 into binary, we will put 1 in 16 place then 1 in 8 place and 1 in 2 place and 0's in rest of the places so we get 11010 .

    b - & , this is also known as ampersand symbol generally and here known as and. So when we use this with two numbers for example 10 and 13 that in binary is 1010 and 1101 then :
    If there is 0 in 1st no. and 1 in 2nd then - it will take 0      If there is 1 in 1st no. and 0 in 2nd then - it will take 0
    If there is 1 in 1st no. and 1 in 2nd then - it will take 1
    If there is 0 in 1st no. and 0 in 2nd then - it will take 0

    So the above number will be 1000 which will output if printed as 8

    c - | , this is called as pipe symbol and here it means or. So:
    If there is 0 in 1st no. and 1 in 2nd then - it will take 1
    If there is 1 in 1st no. and 0 in 2nd then - it will take 1
    If there is 1 in 1st no. and 1 in 2nd then - it will take 1
    If there is 0 in 1st no. and 0 in 2nd then - it will take 0

    Note - dont memorise but try to understand the & and | concepts.

    d - >>, this is right shift which basically adds a 0 in the left and moves the numbers to the right leaving the last no.
    Example - 8 that is 1000 when right shifted will be 0100  which is 4
    (Left shift will bring it back to 8) thus we learn that right shift divides by 2 and left shift multiplies by 2 or doubles it.

    e - << , this is left shift which basically adds 0 to the right and then takes all the numbers to left leaving the first no
     Example - 12 is 01100 on left shifting, it will be 11000 which is 24.
 */

package Operators;

import java.util.Scanner;

public class BitWiseOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter something: ");
        int a = sc.nextInt();
        System.out.println("Enter something: ");
        int b = sc.nextInt();
        int c = a&b;
        int d = a|b;
        System.out.println("New int c is a&b: "+c);
        System.out.println("New int c is a|b: "+d);

        //Now from now we will understand shift operators like >> (Right Shift) and << (Left Shift)
        /*
            For example if we will write 13>>1 ---> It will give 13*2 --> 26
            For example if we will write 13<<1 ---> It will give 13/2 --> 6
            And now if we write 13>>1 ---> It will give 13*2=26*2=52

            So we can say >> (Right shift) works as multiplication and
                          << (Left Shift) works as division
        */
        int x = a<<1;
        int z = a<<2;
        int y = a>>1;
        System.out.println("New a<<1 is: "+x);
        System.out.println("New a>>1 is: "+y);
        System.out.println("New a<<2 is: "+z);
    }
}
