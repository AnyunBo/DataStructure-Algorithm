package com.pbb.algorithm.fibn;

/**
 * 斐波那契数
 * 前两个数相加
 */
public class FibNaUtil {


    public static int fibN01(int num) {
        if (num <= 1) {
            return num;
        }
        return fibN01(num - 1) + fibN01(num - 2);
    }


    /**
     * 0  1  1  2  3  5  8 13 .....
     *
     * @param n
     * @return
     */
    public static int fibNa02(int n) {
        if (n <= 1) {
            return n;
        }
        int firstNum = 0;
        int secondNum = 1;
        for (int i = 0; i < n; i++) {
            int sum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = sum;

        }
        return secondNum;
    }

    /**
     * 0  1  1  2  3  5  8 13 .....
     *
     * @param n
     * @return
     */
    public static int fibNa03(int n) {
        if (n <= 1) {
            return n;
        }
        int firstNum = 0;
        int secondNum = 1;
        for (int i = 0; i < n; i++) {
            secondNum += firstNum;
            firstNum = secondNum - firstNum;
        }
        return secondNum;
    }
}
