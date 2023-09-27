package org.example.lesson_7_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 */
public class TasksEx {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(1, "John");
        hashMap.put(32, "Marta");
        hashMap.put(30, "Mick");
        hashMap.put(64, "Ivan");
        hashMap.put(75, "Anna");
        hashMap.put(6, "John2");

        HashMap<String, Integer> hashMap2 = new HashMap<String, Integer>();
        hashMap2.put("John", 23);
        hashMap2.put("Marta", 123);
        hashMap2.put("Mick", 34);
        hashMap2.put("Ivan", 34);
        hashMap2.put("Anna", 23);
        hashMap2.put("John2", 67);

        HashMap<String, Integer> hashMap3 = new HashMap<String, Integer>();
        hashMap3.put("John", 3);
        hashMap3.put("Marta", 13);
        hashMap3.put("Mick", 999999);

        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>(hashMap);

        HashMap<String, HashMap<String, Integer>> nestedHashMap = new HashMap<>();
        nestedHashMap.put("odin", hashMap2);
        nestedHashMap.put("dva", hashMap3);


        TasksEx ex = new TasksEx();
        System.out.println(ex.getKeyWithMaxSumOfValues(nestedHashMap));

    }

    // Переберите все ключи и значения в HashMap и TreeMap и выведите их на экран.
    public void iterateMap(HashMap<Integer, String> hashMap, TreeMap<Integer, String> treeMap) {

        for (Map.Entry<Integer, String> current : hashMap.entrySet()) {
            System.out.println("Key: " + current.getKey() + " | " + "Val: " + current.getValue());
        }

        for (Map.Entry<Integer, String> current : treeMap.entrySet()) {
            System.out.println("Key: " + current.getKey() + " | " + "Val: " + current.getValue());
        }
    }


    // Переберите только ключи в HashMap и TreeMap и найдите сумму их длин.
    public int getSumOfLegths(HashMap<Integer, String> hashMap, TreeMap<Integer, String> treeMap) {
        int result = 0;
        for (Integer current : hashMap.keySet()) {
            result += current.toString().length();
        }
        for (Integer current : treeMap.keySet()) {
            result += current.toString().length();
        }

        return result;
    }

    // Переберите только значения в HashMap и TreeMap и найдите их среднее значение.
    public double getAvgValue(HashMap<Integer, String> hashMap, TreeMap<Integer, String> treeMap) {
        double result = 0;
        for (String current : hashMap.values()) {
            result += current.length();
        }
        for (String current : treeMap.values()) {
            result += current.length();
        }
        return result / hashMap.size() + treeMap.size();
    }


    // Переберите HashMap и найдите ключ с максимальным значением.
    public int getMaxKeyValue(HashMap<Integer, String> hashMap) {
        int result = Integer.MIN_VALUE;
        for (Integer current :
                hashMap.keySet()) {
            if (current > result) result = current;
        }
        return result;
    }

    // * Переберите TreeMap и найдите ключ с минимальным значением.
    public int getMinKeyValue(TreeMap<Integer, String> hashMap) {
        int result = Integer.MAX_VALUE;
        for (Integer current :
                hashMap.keySet()) {
            if (current < result) result = current;
        }
        return result;
    }

    //  * Переберите HashMap и удалите все элементы с четными значениями.
    public HashMap<Integer, String> getOddValues(HashMap<Integer, String> hashMap) {
        HashMap<Integer, String> result = new HashMap<Integer, String>();
        for (Map.Entry<Integer, String> current :
                hashMap.entrySet()) {
            if (current.getValue().length() % 2 != 0) result.put(current.getKey(), current.getValue());
        }
        return result;
    }

    //  * Переберите TreeMap и удалите все элементы с ключами, начинающимися с буквы 'A'.
    public TreeMap<String, Integer> getMapWithoutA(TreeMap<String, Integer> treeMap) {
        TreeMap<String, Integer> result = new TreeMap<>();
        for (Map.Entry current :
                treeMap.entrySet()) {
            if (!current.getKey().toString().startsWith("A"))
                result.put(current.getKey().toString(), Integer.parseInt(current.getValue().toString()));
        }
        return result;
    }


    //  * Переберите TreeMap и найдите наибольший ключ, который меньше или равен заданному ключу.
    public int getMaxKeyValue(TreeMap<Integer, String> hashMap, Integer key) {
        int result = key;
        int temp = Integer.MIN_VALUE;
        for (Integer current :
                hashMap.keySet()) {
            if (current <= key) {
                if (current > temp) {
                    temp = current;
                    result = current;
                }
            }
        }
        return result;
    }


    //  * Переберите HashMap и найдите ключ с максимальной суммой значений в его вложенных
//  HashMap: HashMap<String, HashMap<String, Integer>> nestedHashMap = new HashMap<>();
    public String getKeyWithMaxSumOfValues(HashMap<String, HashMap<String, Integer>> nestedHashMap) {
        String result = null;
        int maxSum = 0;
        for (Map.Entry<String, HashMap<String, Integer>> current :
                nestedHashMap.entrySet()) {
            int sum = 0;
            for (Map.Entry<String, Integer> intCurrent :
                    current.getValue().entrySet()) {
                sum += intCurrent.getValue();
            }
            if (sum > maxSum) {
                result = current.getKey();
                maxSum = sum;
            }
        }

        return result;
    }


}
