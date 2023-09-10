package com.infinity;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Variant2 {
    public static int powForInteger(int base, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException("Illegal argument");
        }
        int result = 1;

        for (int i = 0; i < exponent; i++) {
            result *= base;
        }

        return result;
    }

    /**
     *
     * @param kilogram
     * @return tonn
     */
    public static int intTask(int kilogram) {
        return kilogram / 1000;
    }

    /**
     *
     * @param A - intager
     * @return true if A is odd, else false
     */
    public static boolean booleanTask(int A) {
        return A % 2 != 0;
    }

    public static int ifTask(int number) {
        if (number > 0) {
            return number + 1;
        } else {
            return number - 2;
        }
    }

    public static String caseTask(int grade) {
        switch (grade) {
            case (1):
                return "Bad";
            case (2):
                return "Unsatisfactory";
            case (3):
                return "Satisfactory";
            case (4):
                return "Good";
            case (5):
                return "Excellent";
            default:
                return "Error";
        }
    }

    /**
     *
     * @param A (A < B)
     * @param B
     * @return all integers between A - B and their count
     */
    public static String forTask(int A, int B) {
        int count = 0;
        String result = "";

        for (int i = A; i <= B; i++) {
            result += Integer.toString(i) + " ";
            count++;
        }
        return result + count;
    }

    /**
     *
     * @param A
     * @param B
     * @return number of segments B, placed on segment A
     */
    public static int whileTask(int A, int B) {
        int count = 0;
        while (A >= B && A >= 0) {
            A -= B;
            count++;
        }
        return count;
    }

    /**
     *
     * @param rectangles
     * @return the minimum area of a rectangle from input data
     */
    public static int minmaxTask(int[][] rectangles) {
        int minArea = Integer.MAX_VALUE;

        for (int i = 0; i < rectangles.length; i++) {
            int a = rectangles[i][0];
            int b = rectangles[i][1];

            int area = a * b;

            if (minArea > area) {
                minArea = area;
            }

        }
        return minArea;
    }

    /**
     *
     * @param N
     * @return array containing powers of two
     */
    public static int[] arrayTask(int N) {
        int[] myArray= new int[N];

        for (int i = 0; i < N; i++) {
            myArray[i] = powForInteger(2, i + 1);
        }

        return myArray;
    }

    /**
     *
     * @param M
     * @param N
     * @return matrix where the elements of the J column have the value 5·J (J = 1, …, N).
     */
    public static int[][] matrixTask(int M, int N) {
        int[][] myMatrix = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                myMatrix[i][j] = 5 * (j + 1);
            }
        }
        return myMatrix;
    }


    public static void main(String[] args) {
        System.out.println("Start Lab1");
    }
}