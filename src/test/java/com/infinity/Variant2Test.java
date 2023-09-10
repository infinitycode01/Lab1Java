package com.infinity;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Variant2Test {
    ///////////////////////////////////////
    @Test(dataProvider = "intTaskProvider")
    public static void intTaskTest(int kilogram, int tonn) {
        assertEquals(Variant2.intTask(kilogram), tonn);
    }
    @DataProvider
    public Object[][] intTaskProvider() {
        return new Object[][] { { 1000, 1 }, { 57, 0 }, { 2004, 2 }, { 72043, 72 } };
    }
    ///////////////////////////////////////
    @Test(dataProvider = "booleanTaskProvider")
    public void booleanTaskTest(int A, boolean boolTest) {
        assertEquals(Variant2.booleanTask(A), boolTest);
    }
    @DataProvider
    public Object[][] booleanTaskProvider() {
        return new Object[][] { { 1, true }, { 2, false }, { -3, true }, { -4, false } };
    }
    ///////////////////////////////////////
    @Test(dataProvider = "ifTaskProvider")
    public void ifTaskTest(int number, int result) {
        assertEquals(Variant2.ifTask(number), result);
    }
    @DataProvider
    public Object[][] ifTaskProvider() {
        return new Object[][] { { 2, 3 }, { -1, -3 }, { 0, -2 } };
    }
    ///////////////////////////////////////
    @Test(dataProvider = "caseTaskProvider")
    public void caseTaskTest(int grade, String result) {
        assertEquals(Variant2.caseTask(grade), result);
    }
    @DataProvider
    public Object[][] caseTaskProvider() {
        return new Object[][] { { 1, "Bad" }, { 2, "Unsatisfactory" }, { 3, "Satisfactory" }, { 4, "Good" }, { 5, "Excellent" }, { 98, "Error" } };
    }
    ///////////////////////////////////////
    @Test(dataProvider = "forTaskProvider")
    public void forTaskTest(int A, int B, String result) {
        assertEquals(Variant2.forTask(A, B), result);
    }
    @DataProvider
    public Object[][] forTaskProvider() {
        return new Object[][] { { 3, 5, "3 4 5 3" }, { -4, 0, "-4 -3 -2 -1 0 5" }, { 1, 2, "1 2 2" } };
    }
    ///////////////////////////////////////
    @Test(dataProvider = "whileTaskProvider")
    public void whileTaskTest(int A, int B, int result) {
        assertEquals(Variant2.whileTask(A, B), result);
    }
    @DataProvider
    public Object[][] whileTaskProvider() {
        return new Object[][] { { 10, 9, 1 }, { 10, 6, 1 }, { 10, 5, 2 }, { 10, 4, 2 }, { 10, 3, 3 }, { 10, 2, 5 }, { 10, 1, 10 } };
    }
    ///////////////////////////////////////
    @Test(dataProvider = "minmaxTaskProvider")
    public void minmaxTaskTest(int[][] rectangles, int minArea) {
        assertEquals(Variant2.minmaxTask(rectangles), minArea);
    }
    @DataProvider
    public Object[][] minmaxTaskProvider() {
        return new Object[][] {
                { new int[][] { { 3, 4 }, { 2, 5 }, { 6, 2 }, { 1, 8 } }, 8 },
                { new int[][] { { 2, 2 }, { 3, 3 }, { 4, 4 } }, 4 },
                { new int[][] { { 1, 1 }, { 2, 2 }, { 3, 3 } }, 1 }
        };
    }
    ///////////////////////////////////////
    @Test(dataProvider = "arrayTaskProvider")
    public void arrayTaskTest(int N, int[] result) {
        assertEquals(Variant2.arrayTask(N), result);
    }
    @DataProvider
    public Object[][] arrayTaskProvider() {
        return new Object[][] {
                { 5, new int[] { 2, 4, 8, 16, 32 } },
                { 2, new int[] { 2, 4 } },
                { 3, new int[] { 2, 4, 8 } }
        };
    }
    ///////////////////////////////////////
    @Test(dataProvider = "matrixTaskProvider")
    public void matrixTaskTest(int M, int N, int[][] result) {
        assertEquals(Variant2.matrixTask(M, N), result);
    }
    @DataProvider
    public Object[][] matrixTaskProvider() {
        return new Object[][] {
                { 2, 2, new int[][] { { 5, 10 }, { 5, 10 } } },
                { 2, 4, new int[][] { { 5, 10, 15, 20 }, { 5, 10, 15, 20 } } },
                { 5, 7, new int[][] { { 5, 10, 15, 20, 25, 30, 35 }, { 5, 10, 15, 20, 25, 30, 35 }, { 5, 10, 15, 20, 25, 30, 35 }, { 5, 10, 15, 20, 25, 30, 35 }, { 5, 10, 15, 20, 25, 30, 35 } } }
        };
    }


}
