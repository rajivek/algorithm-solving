package com;


/*
Question

The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?

1267602-Tl2SF8H7HMnCh0uXOTPBUsyaNA9liPbn5aXGGDvc

*/


public class Problem3 {

    public static void main(String[] args) {

        int x = 6857;
        boolean isPrimeNumber = isPrimeNumber(x);


        System.out.println(isPrimeNumber);

    }

    private static boolean isPrimeNumber(int x) {

        for (int i = 2; i < x; i++) {

            if (x % i == 0) {
                return false;
            }
        }

        return true;
    }
}
