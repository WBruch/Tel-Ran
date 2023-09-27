package org.example.lesson_1;

public class Main1 {

    int a = 5;
    String s = "Hello world";

    public int getMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int a :
                arr) {
            if (a < min) {
                min = a;
            }
        }
        return min;
    }


    public int getSecondMinValue(int[] array) {

        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min2 = min;
                min = array[i];
            } else if (array[i] != min && array[i] < min2) {
                min2 = array[i];
            }
        }

        return min2;
    }


    public int sumArray(int[] array) {
        int sumOdd = 0;
        int sumEven = 0;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sumEven = sumEven + array[i];
            } else {
                sumOdd = sumOdd + array[i];
            }
        }

        sum = sumEven - sumOdd;

        return sum;
    }


    public int getSumArr(int[] array) {

        int left = 0;
        int right = array.length - 1;
        int sum = 0;

        if (array.length == 0) {
            return 0;

        } else {

            while (left <= right) {
                if (left == right) {
                    sum += array[left];
                    break;
                }

                sum += array[left] + array[right];
                left++;
                right--;

            }

        }
        return sum;
    }


    public static void main(String[] args) {

        int[] arr = new int[10];
        int[] arr2 = {1, 3, 56, 8, 5};

        Main1 asd = new Main1();
        System.out.println(asd.getMin(arr2));
        System.out.println(asd.getSecondMinValue(arr2));
        System.out.println(asd.getSumArr(arr2));

    }
}