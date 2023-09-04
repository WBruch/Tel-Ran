package org.tasks_1;

public class ArrayTasks {

    /**
     * Найти среднее арифметическое положительных элементов массива.
     * <p>
     * Найти сумму всех элементов в массиве, которые делятся на 3 и одновременно не делятся на 5.
     * <p>
     * Найти в массиве наибольшую сумму подряд идущих элементов.
     */

//Task1
    public double getArithmeticMeanOfPositiveElements(int[] array) {

        int counter = 0;
        int sum = 0;

        for (int i :
                array) {
            if (i > 0) {
                sum += i;
                counter++;
            }
        }

        return ((double) sum / counter);
    }

    //Task2
    public int getSumElemDiv(int[] array) {

        int sum = 0;

        for (int i :
                array) {
            if ((i % 3 == 0) && (i % 5 != 0)) {
                sum += i;
            }
        }

        return sum;
    }

    //Task3
    public int getLargestSumOfConsecutiveElements(int[] array) {

        int sum = 0;
        int largestSum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length && (j < i + 2); j++) {
                sum = array[i] + array[j];
                if (sum > largestSum) {
                    largestSum = sum;
                }
            }
        }

        return largestSum;
    }


    public static void main(String[] args) {

        ArrayTasks task = new ArrayTasks();
        int[] array = {1, 1, -5, 3, 15, -6, 9, 10};

        System.out.printf("среднее арифметическое положительных элементов массива : %f%n", task.getArithmeticMeanOfPositiveElements(array));
        System.out.printf("сумма всех элементов в массиве, которые делятся на 3 и одновременно не делятся на 5 : %d%n", task.getSumElemDiv(array));
        System.out.printf("наибольшая сумма подряд идущих элементов в массиве : %d%n", task.getLargestSumOfConsecutiveElements(array));


    }
}
