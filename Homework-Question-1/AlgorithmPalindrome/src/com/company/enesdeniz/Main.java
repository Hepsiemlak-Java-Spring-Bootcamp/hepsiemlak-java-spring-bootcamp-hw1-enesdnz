package com.company.enesdeniz;

import java.util.ArrayList;
import java.util.List;
/**
 * Adds the number by taking the reverse of the given number in the loop.
 * Checks if the sum is a palindrome and calculates.
 * It records the number of times the operation is repeated and prints the steps of the most repeated number to the screen.
 *
 * Created by Muhammet Enes Deniz on 02/02/2022.
 */
public class Main {

    public static void main(String[] args) {

        //variable definitions are done here
        long maxPalindromeCount = 0; int maxPalindromeNumber = 0;
        List<Long> numberChain = new ArrayList<>();

        for(int number = 10; number < 100; number++)
        {
            //Goes to the function for palindrome calculation
            long getPalindromeCalculate = getPalindromeCount(number,0, numberChain);
            //If the count is more than the previous count in the returned result, the new count will be that
            //and the numeric value with the longest chain is kept
            if(maxPalindromeCount < getPalindromeCalculate )
            {
                maxPalindromeCount = getPalindromeCalculate;

                maxPalindromeNumber = number;

            }
        }

        //the number with the longest chain is sent back to the calculation and the values in the chain are saved
        List<Long> maxNumberChain = new ArrayList<>();
        getPalindromeCount(maxPalindromeNumber, 0, maxNumberChain);

        //Printing the results to the screen is done here
        System.out.println("The number with the longest chain in this loop : " + maxPalindromeNumber);
        System.out.println("Length of longest chain in this loop : " + maxPalindromeCount);
        System.out.println("Chain : ");
        maxNumberChain.forEach(System.out::println);


    }

    /**
     * The inverse of the number sent as a parameter to this method is sent
     * @param number
     * @return returns the reverse of the number
     */
    private static long Reverse(long number) {

        String stringNumber = String.valueOf(number);

        String reverseNumber = new StringBuilder(stringNumber).reverse().toString(); //

        return Long.parseLong(reverseNumber);
    }

    /**
     * If the number is a palindrome, it returns count. If not, it continues to calculate recursively.
     * @param number
     * @param count
     * @param list
     * @return
     */
    private static long getPalindromeCount(long number,long count, List<Long> list)
    {
        if(isPalindrome(number,Reverse(number)))
        {
            return count;
        }
        else
        {
            list.add(number + Reverse(number));
            return getPalindromeCount(number + Reverse(number), ++count, list); //recalculation is done
        }
    }

    /**
     * In this method, it is checked whether the number is a palindrome or not.
     * @param number
     * @param reverseNumber
     * @return this number palindrome or not (boolean)
     */
    private static boolean isPalindrome(long number, long reverseNumber) {

        return number == reverseNumber;
    }
}