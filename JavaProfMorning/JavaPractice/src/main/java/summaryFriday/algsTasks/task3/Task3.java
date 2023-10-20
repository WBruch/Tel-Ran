package summaryFriday.algsTasks.task3;

/**
 *  Оценить эффективность алгоритма решения задачи Ханойской башни, предложенного на занятии (см. HanoiTower.java в репозитории)
 *
 *  Поскольку в решении рекурсивная функция вызывается два раза, а количество вызовов зависит от n, то сложность
 *  такого алгоритма составляет 2^n.
 *
 *
 * Написать функцию sum(n, m), вычисляющую сумму тех чисел в диапазоне от 1 до n, которые делятся на m.
 * Например:
 * sum(7, 2) = 2 + 4 + 6 = 12
 * sum(12, 3) = 3 + 6 + 9 + 12 = 30
 * Решить задачу:
 * а) через цикл
 * б) через рекурсию
 */
public class Task3 {
    public static void main(String[] args) {

        System.out.println(sum(7, 2));
        System.out.println(sum(12, 3));
        System.out.println("*******************");
        System.out.println(sum1(7, 2));
        System.out.println(sum1(12, 3));

    }

    public static int sum(int a, int b) {
        int c = a / b;
        int sum = 0;
        while (c > 0) {
            sum += c * b;
            c--;
        }
        return sum;
    }

    public static int sum1(int a, int b){
        int c = a / b;
        int d = c * b;
        return recursiveSum(d, b);
    }

    private static int recursiveSum(int d, int b) {
        if (d <= 0) return 0;
        return d + recursiveSum(d - b, b);
    }
}
