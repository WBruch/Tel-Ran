package summaryFriday.algsTasks;

/**
 * 1 уровень сложности: Дан отсортированный массив, в котором все элементы встречаются дважды (один за другим),
 * а один элемент появляется только один раз.
 * Написать метод для нахождения этого элемента.
 * Решить задачу
 * <p>
 * <p>
 * 1.через простой цикл
 * 2*. через бинарный поиск
 */
public class Task1 {
    public static void main(String[] args) {
        int[] array = {0, 0, 1, 1, 2, 2, 3, 3, 5, 5, 6, 6, 7, 7, 8, 8, 9};
        System.out.println(getUniqueValue(array));
        System.out.println(getUniqueValueBin(array));
    }

    public static int getUniqueValue(int[] array) {
        if (array[0] < array[1]) {
            return array[0];
        } else if (array[array.length - 1] > array[array.length - 2]) {
            return array[array.length - 1];
        }
        for (int i = 0; i < array.length; i += 2) {
            if (i + 1 < array.length) {
                if (array[i] != array[i + 1])
                    return array[i];
            }
        }
        return 0;
    }


    public static int getUniqueValueBin(int[] array) {
        int startIndex = 0;
        int endIndex = array.length - 1;
        if (array[0] < array[1]) {
            return array[0];
        } else if (array[array.length - 1] > array[array.length - 2]) {
            return array[array.length - 1];
        }
        while (startIndex <= endIndex) {
            int middle = startIndex + (endIndex - startIndex) / 2;
            if (middle % 2 != 0 && middle + 1 <= array.length - 1) {
                middle = middle + 1;
                if (middle + 1 == array.length) {
                    return array[middle];
                }
            }

            if (array[middle] > array[middle - 1] && array[middle] < array[middle + 1]) {
                return array[middle];
            } else if (array[middle] == array[middle + 1]) {
                startIndex = middle;
            } else if (array[middle] < array[middle + 1]) {
                endIndex = middle;
            }

        }


        return 0;
    }

}
