package summaryFriday.algsTasks.task4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(nElementRecursion(7));

        int[][] pathCost = new int[][] {
                {0,  11,  0,  0,  0, 0},
                {10, 10, 10, 10, 10, 0},
                {10, 10, 10,  4, 10, 0},
        };

        int[][] pathCost2 = new int[][] {
                {0,  11,  0,  0,  0, 100},
                {10, 10, 10, 10, 10,   0},
                {10, 10, 10,  4, 10,   0},
        };

        System.out.println(getMinCost(pathCost));
        System.out.println(getMinCost(pathCost2));
    }

    /**
     * Вычислить n-й член последовательности, заданной формулами:
     * a(2n) = a(n) + a(n-1),
     * a(2n+1) = a(n) — a(n-1),
     * a(0) = a(1) = 1.
     */

    private static int nElementRecursion(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else if (n % 2 == 0) {
            return nElementRecursion(n / 2) + nElementRecursion(n / 2 - 1);
        } else {
            return nElementRecursion(n / 2) - nElementRecursion(n / 2 - 1);
        }
    }


    /**
     * В каждой клетке прямоугольной таблицы N*M записано некоторое число.
     * Изначально игрок находится в левой верхней клетке.
     * За один ход ему разрешается перемещаться в соседнюю клетку либо вправо, либо вниз (влево и вверх перемещаться запрещено).
     * При проходе через клетку игрок платит определенную сумму, значение которой записано в этой клетке.
     * Требуется найти минимальную стоимость пути, отдав которую игрок может попасть в правый нижний угол.
     */
    public static int getMinCost(int[][] table) {
        int length = table.length;
        int width = table[0].length;

        int[][] result = new int[length][width];
        result[0][0] = table[0][0];
        for (int i = 1; i < length; i++) {
            result[i][0] = result[i - 1][0] + table[i][0];
        }
        for (int i = 1; i < width; i++) {
            result[0][i] = result[0][i - 1] + table[0][i];
        }

        for (int i = 1; i < length; i++) {
            for (int j = 1; j < width; j++) {
                result[i][j] = table[i][j] + Math.min(result[i - 1][j], result[i][j - 1]);
            }
        }
        return result[length - 1][width - 1];
    }
}
