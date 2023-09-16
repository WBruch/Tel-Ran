package org.tasks_4;

import java.util.*;

public class Home_Tasks {
    /**
     * Уровень сложности 5 из 10:
     */

// Найти сумму всех элементов ArrayList<Integer>.
    public int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer current :
                list) {
            sum += current;
        }
        return sum;
    }


// Найти среднее значение элементов LinkedList<Integer>.

    public double avgValue(ArrayList<Integer> list) {
        double result = 0;
        for (Integer current :
                list) {
            result += current;
        }
        return result / list.size();
    }


// Перебрать ArrayList<String> и вывести все элементы на экран.

    public void printValue(ArrayList<Integer> list) {
        for (Integer current :
                list) {
            System.out.println(current);
        }
    }


// Перебрать LinkedList<String> и найти самую длинную строку.

    public String getLongestString(ArrayList<String> strings) {

        String string = "";
        for (String current :
                strings) {
            string = string.length() > current.length() ? string : current;
        }
        return string;
    }


    /**
     * Уровень сложности 6 из 10:
     */


// Перебрать ArrayList<Integer> и найти наименьший элемент.
    public Integer getSmallestValue(ArrayList<Integer> list) {
        int result = Integer.MAX_VALUE;
        for (Integer current :
                list) {
            if (result > current) {
                result = current;
            }
        }
        return (Integer) result;

    }


// Перебрать LinkedList<Integer> и найти наибольший элемент.

    public Integer getLargestValue(ArrayList<Integer> list) {
        int result = Integer.MIN_VALUE;
        for (Integer current :
                list) {
            if (result < current) {
                result = current;
            }
        }
        return (Integer) result;
    }


// Перебрать ArrayList<String> и найти количество элементов, начинающихся с определенной буквы.

    public int getTheNumberOfElementsStartingWithCertainLetter(ArrayList<String> strings, char letter) {
        int counter = 0;
        for (String current :
                strings) {
            if (current.startsWith(String.valueOf(letter))) {
                counter++;
            }
        }
        return counter;
    }


//  Перебрать LinkedList<String> и найти первое вхождение определенной строки.

    public int getFirstOccurrenceOfString(LinkedList<String> strings, String value) {

        return strings.indexOf(value);
    }


//  Создать LinkedList с объектами вашего собственного класса
//  и удалить все элементы, удовлетворяющие определенному условию.

    public LinkedList<TestPerson> personLinkedList(int quantity) {
        LinkedList<TestPerson> list = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < quantity; i++) {
            list.addLast(new TestPerson(random.nextInt(0, 100)));
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).age < 18 || list.get(i).age > 60) {
                list.remove(list.get(i));
            }
        }
        return list;
    }


    /**
     * Уровень сложности 7 из 10:
     */

// Перебрать ArrayList<Integer> и удалить все четные числа.
    public ArrayList<Integer> removeEvenNumbers(ArrayList<Integer> list) {
        ArrayList<Integer> oddList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0) {
                oddList.add(list.get(i));
            }
        }
        return oddList;
    }


    // Перебрать LinkedList<Integer> и заменить все элементы, кратные 3, на нули.
    public ArrayList<Integer> removeOddNumbers(ArrayList<Integer> list) {
        ArrayList<Integer> evenList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 3 == 0) {
                evenList.add(0);
            } else {
                evenList.add(list.get(i));
            }
        }
        return evenList;
    }


    // Перебрать ArrayList<String> и объединить все элементы в одну строку.
    public String concatenateAllElements(ArrayList<String> list) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String current :
                list) {
            stringBuilder.append(current);
        }
        return stringBuilder.toString();
    }


    // Перебрать LinkedList<String> и удалить все элементы, содержащие определенную подстроку.
    public LinkedList<String> removeAllElementsContainingSubstring(LinkedList<String> list, String subString) {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains(subString)) {
                list.remove(i);
                i--;
            }
        }
        return list;
    }


    // Создать ArrayList с объектами вашего собственного класса и вывести только те,
// которые удовлетворяют определенному условию.
    public void getAdults(int quantity) {
        ArrayList<TestPerson> adults = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < quantity; i++) {
            adults.add(i, new TestPerson(random.nextInt(0, 100)));
            if (adults.get(i).age >= 18) {
                System.out.println(adults.get(i));
            }
        }
    }


    /**
     * Уровень сложности 8 из 10:
     */


//  Перебрать ArrayList<Integer> и найти сумму квадратов всех элементов.
    public int getSumOfSquaresOfAllElements(ArrayList<Integer> list) {
        int result = 0;
        for (Integer current :
                list) {
            result += current * current;
        }
        return result;
    }


    //  Перебрать LinkedList<Integer> и вычислить произведение всех элементов.
    public int getProductOfMultiplicationOfAllElements(LinkedList<Integer> list) {
        int result = 1;
        for (Integer current :
                list) {
            result *= current;
        }
        return result;
    }


    //Перебрать ArrayList<String> и найти самую короткую строку.
    public String getShortestString(ArrayList<String> list) {
        String result = list.get(0);
        for (String str :
                list) {
            if (str.length() < result.length())
                result = str;
        }
        return result;
    }


    // Перебрать LinkedList<String> и заменить все гласные буквы в каждой строке на символ '*'.
    public LinkedList<String> getStringWithoutVowels(LinkedList<String> list) {
        LinkedList<String> result = new LinkedList<>();
        for (String current :
                list) {
            result.add(current.replaceAll("[aeiouyAEIOUY]", "*"));
        }
        return result;
    }


    // Создать LinkedList с объектами вашего собственного класса и отсортировать их в порядке убывания.
    public void getDescendingSort() {
        LinkedList<TestPerson> list = new LinkedList<>();
        list.add(new TestPerson("Anna", 23, "London"));
        list.add(new TestPerson("Antoan", 34, "Leon"));
        list.add(new TestPerson("Michael", 26, "Berlin"));
        list.add(new TestPerson("Anna", 23, "Neuwied"));
        list.add(new TestPerson("Ahmed", 36, "Sieg"));
        Collections.sort(list);
        System.out.println(list);
    }


    /**
     * Уровень сложности 9 из 10:
     */


// Перебрать ArrayList<Integer> и найти второй по величине элемент.
    public int getSecondLargestInteger(ArrayList<Integer> list) {
        list.sort(Comparator.naturalOrder());
        return list.get(list.size() - 2);
    }


    //  Перебрать LinkedList<Integer> и вывести все элементы в обратном порядке.
    public void getReverseOrderedList(LinkedList<Integer> list) {
        list.sort(Comparator.reverseOrder());
        System.out.println(list);
    }


    //  Перебрать ArrayList<String> и вывести все строки, содержащие только буквы.
    public ArrayList<String> getStringsWithoutNumbers(ArrayList<String> list) {
        char[] chars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        ArrayList<String> result = new ArrayList<>();
        int counter = 0;
        for (String string : list) {
            for (char aChar : chars) {
                if (string.indexOf(aChar) >= 0) {
                    counter++;
                }
            }
            if (counter == 0) result.add(string);
            counter = 0;
        }
        return result;
    }


    // Перебрать LinkedList<String> и найти самую длинную строку, не содержащую пробелов.
    public String getLongestString(LinkedList<String> list) {
        LinkedList<String> result = new LinkedList<>();
        for (String current :
                list) {
            if (current.split(" ").length == 1 && !current.contains(" "))
                result.add(current);
        }
//        for (String str:
//                list) {
//            StringTokenizer tk = new StringTokenizer(str);
//            if (tk.countTokens() == 1)
//                System.out.println(str);
//        }
        result.sort(new Comparator<String>() {
                        @Override
                        public int compare(String o1, String o2) {
                            return o1.length() - o2.length();
                        }
                    }
        );

        return result.getLast();
    }


    // Создать ArrayList с объектами вашего собственного класса и отфильтровать только уникальные элементы.
    public ArrayList<TestPerson> getUniqueElements() {
        int counter = 0;
        ArrayList<TestPerson> resultList = new ArrayList<>();
        ArrayList<TestPerson> list = new ArrayList<>();
        list.add(new TestPerson("Anna", 23, "London"));
        list.add(new TestPerson("Ahmed", 36, "Sieg"));
        list.add(new TestPerson("Anna", 23, "London"));
        list.add(new TestPerson("Michael", 26, "Berlin"));
        list.add(new TestPerson("Michael", 26, "Berlin"));

        for (TestPerson person :
                list) {
            for (TestPerson testPerson : list) {
                if (testPerson.equals(person))
                    counter++;
            }
            if (counter == 1)
                resultList.add(person);
            counter = 0;
        }
        return resultList;
    }


    /**
     * Уровень сложности 10 из 10:
     */


// 3,2,1,1,2,3,4,10
// Перебрать ArrayList<Integer> и найти наибольшую возрастающую последовательность элементов.
    public List<Integer> findLongestIncreasingSequence(ArrayList<Integer> numbers) {
        int n = numbers.size();
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (numbers.get(i) > numbers.get(j) && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }
        }

        int maxLength = 0;
        int endIndex = 0;

        for (int i = 0; i < n; i++) {
            if (dp[i] > maxLength) {
                maxLength = dp[i];
                endIndex = i;
            }
        }

        List<Integer> longestSequence = new ArrayList<>();
        longestSequence.add(numbers.get(endIndex));

        for (int i = endIndex - 1; i >= 0; i--) {
            if (numbers.get(i) < numbers.get(endIndex) && dp[i] == dp[endIndex] - 1) {
                longestSequence.add(numbers.get(i));
                endIndex = i;
            }
        }

        return reverseList(longestSequence);
    }

    public static List<Integer> reverseList(List<Integer> list) {
        List<Integer> reversedList = new ArrayList<>(list);
        int left = 0;
        int right = reversedList.size() - 1;
        while (left < right) {
            int temp = reversedList.get(left);
            reversedList.set(left, reversedList.get(right));
            reversedList.set(right, temp);
            left++;
            right--;
        }
        return reversedList;
    }



    // Перебрать LinkedList<Integer> и удалить все дубликаты элементов.
    public LinkedList<Integer> getUniqueValuesFromList(LinkedList<Integer> intList) {
        HashSet<Integer> result = new HashSet<>();
        LinkedList<Integer> intResult = new LinkedList<>();
        result.addAll(intList);
        intResult.addAll(result);
        return intResult;
    }


    // Перебрать ArrayList<String> и создать новый список, содержащий только уникальные строки.
    public ArrayList<String> getUniqueStringsFromList(ArrayList<String> strList) {
        HashSet<String> result = new HashSet<>();
        ArrayList<String> strResult = new ArrayList<>();
        result.addAll(strList);
        strResult.addAll(result);
        return strResult;
    }


    // Перебрать LinkedList<String> и объединить все строки в одну с использованием разделителя.
    public String getSumString(LinkedList<String> list) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String current :
                list) {
            stringBuilder.append(current);
            stringBuilder.append("*");
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        return stringBuilder.toString();
    }


    //
    public void getSortedPersons() {
        LinkedList<TestPerson> list = new LinkedList<>();
        list.add(new TestPerson("Anna", 23, "London"));
        list.add(new TestPerson("Antoan", 34, "Leon"));
        list.add(new TestPerson("Michael", 26, "Berlin"));
        list.add(new TestPerson("Anna", 23, "Neuwied"));
        list.add(new TestPerson("Ahmed", 36, "Sieg"));
        Collections.sort(list);
        System.out.println(list);
    }


    public static void main(String[] args) {
        Home_Tasks task = new Home_Tasks();
        ArrayList<Integer> listInt = new ArrayList<>();
        listInt.add(180);
        listInt.add(4);
        listInt.add(6);
        listInt.add(7);
        listInt.add(10);
        listInt.add(922);
        listInt.add(13);
        listInt.add(14);

        ArrayList<String> strlist = new ArrayList<>();
        strlist.add("odin");
        strlist.add("odinA");
        strlist.add("OneTwoThreeFour");
        strlist.add("odin");
        strlist.add("12_monkeys");
        strlist.add("odin");
        strlist.add("odinB");

        System.out.println(task.findLongestIncreasingSequence(listInt));
    }
}
