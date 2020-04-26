package io;

import java.util.Arrays;
import java.util.Scanner;

/********************
 * Java Learnings   *
 * @java.learnings  *
 ********************/

public class ReadingFromConsole {
    public static void main(String[] args) {
        System.out.println("Enter 3 ints:");

        int[] ints = new int[3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < ints.length; i++) {
            ints[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(ints));
    }
}

/****************
 * Input:       *
 * 1            *
 * 2            *
 * 3            *
 ****************
 * Output:      *
 * [1, 2, 3]    *
 ****************/

