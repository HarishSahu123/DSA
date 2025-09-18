package org.practice.dsa.array.basicArray.twoDimentionArray;

import java.lang.reflect.Array;

public class TwodBasic {


    public static void main(String[] args) {

        //1 .way
        int[][] arr1 = new int[3][4]; // 3 rows, 4 columns
        int[][] arr2 = new int[2][2]; // 2 rows, 2 columns

        //Declare and initialize with values

       //1 . Way to create two Dimension Array
        int[][] arr3 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        //2.way to create 2 Dimension Array
        int[][] arr4 = new int[2][2];
        arr2[0][0] = 7;
        arr2[0][1] = 8;
        arr2[1][0] = 9;
        arr2[1][1] = 10;
        printArray(arr3);
        }
    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {         // rows
            for (int j = 0; j < arr[i].length; j++) {  // columns
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    }

