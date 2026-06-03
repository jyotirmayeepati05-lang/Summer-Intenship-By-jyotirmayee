package com.jyp;

public class PrimeNumber {
	public static void main(String[] args) {
        int n =1904;

        for (int num = 2; num <= n; num++) {
            boolean prime = true;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime)
                System.out.print(num + " ");
        }
    }

}
