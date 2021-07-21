package com.gushi.notes.arrary;

/**
 * @author Gushi1912 | gushiyang@sheca.com
 * @version 0.0.1
 * 2021/7/19
 * 数组的一些常用简单操作
 */
public class ArrayOperation {
    public static void main(String[] args) {
        int[] a = {13,3,4,5,6,34,54,32};

        int[][] b = {{1,2,3},{3,2,1},{2,3,1}};
        int[][] c = {{3,2,1},{2,3,1},{1,2,3}};
        //找出数组中的最大元素
//        System.out.println(findMax(a));

        //数组复制
//        int[] clone = a.clone();
//        printArray(clone);
//        printArray(arrayCopy(a));
//        System.out.println(clone.equals(a));
//        System.out.println(arrayCopy(a).equals(a));


        //数组颠倒
//        reverseArray(a);
//        printArray(a);


        //矩阵相乘
        int[][] d = matrixMultiply(b, c);
        print(d);
    }


    /**
     * 找出数组中最大的元素
     * @return
     */
    public static int findMax(int[] a) {
        int n = a.length;
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) max = a[i];
        }
        return max;
    }

    /**
     * 数组复制
     */
    public static int[] arrayCopy(int[] a) {
        int n = a.length;
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = a[i];
        }
        return b;
    }

    /**
     * 打印数组
     */
    public static void printArray(int[] a) {
        int n = a.length;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n;i++){
            builder.append(a[i] + ",");
        }
        String array = builder.toString().substring(0, builder.toString().length() - 1);
        System.out.println(array);
    }

    //颠倒数组
    public static int[] reverseArray(int[] a) {
        int n = a.length;
        int temp = 0;
        for (int i = 0; i < n/2; i++){
            temp = a[i];
            a[i] = a[n - 1 - i];
            a[n - 1 - i] = temp;
        }
        return a;
    }

    //矩阵相乘,方阵
    public static int[][] matrixMultiply(int[][] a, int[][] b) {
        int n = a[0].length;
        int[][] c = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }


    //打印二维数组
    public static void print(int[][] a) {
        int n = a[0].length;

        for (int i = 0; i < n ; i++) {
            for ( int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
