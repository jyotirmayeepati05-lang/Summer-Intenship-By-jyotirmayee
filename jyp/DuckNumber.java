package com.jyp;
public class DuckNumber {
    public static void main(String[] args) {
        int n = 1904;
        boolean duck = false;

        while (n > 0) {
            if (n % 10 == 0) {
                duck = true;
                break;
            }
            n /= 10;
        }

        if (duck)
            System.out.println("Duck Number");
        else
            System.out.println("Not Duck Number");
    }
}



	