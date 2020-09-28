package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int minimal = 0;
        int[] p = new int[n];
        for (int j = 0; j < n; j++) {
            p[j] = scan.nextInt();
            if (j == 0 || p[j] > minimal) {
                minimal = p[j];
            }
        }
        System.out.print(minimal);
    }
}