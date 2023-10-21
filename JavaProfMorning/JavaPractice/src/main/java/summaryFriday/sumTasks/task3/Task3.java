package summaryFriday.sumTasks.task3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import summaryFriday.sum_08_09.Cat;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.partitioningBy;

public class Task3 {

    public static void main(String[] args) {

    }

    /**
     * Переписать фрагменты кода с применением стримов:
     */
    // 1.
    // public static void feed(List catList) {
    //        for (int i = 0; i < catList.size(); i++) {
    //            if (catList.get(i).isHungry()) {
    //                catList.get(i).setHungry(false);
    public static void feed(List<Cat> catList) {
        catList.stream()
                .filter(Cat::isHungry)
                .forEach(cat -> cat.setHungry(false));
    }

    //2)
//    public static int getSum(List integers) {
//        int oddSum = 0;
//        for(Integer i: integers) {
//            if(i % 2 != 0) {
//                oddSum += i;
//            }
//        }
//        return oddSum;
//    }

    public static int getSum(List<Integer> integers) {
        return integers.stream()
                .filter(el -> el % 2 != 0)
                .reduce(Integer::sum)
                .get();
    }

// 3)
//
//    public static Map> getMap() {
//        Map> map = new TreeMap<>();
//        for (int i = 0; i < 100; i++) {
//            if (i % 3 == 0) {
//                if (map.containsKey(true)) {
//                    map.get(true).add(i);
//                } else {
//                    map.put(true, new ArrayList<>());
//                    map.get(true).add(i);
//                }
//            } else {
//                if (map.containsKey(false)) {
//                    map.get(false).add(i);
//                } else {
//                    map.put(false, new ArrayList<>());
//                    map.get(false).add(i);
//                }
//            }
//        }
//        return map;

    public static Map<Boolean, List<Integer>> getMap() {
        return IntStream.range(0, 100)
                .boxed()
                .collect(Collectors.partitioningBy(el -> el % 3 == 0));
    }

    // 4) Код в классе de.telran.lesson20230929.Dictionary (см. репозиторий)
    public static Map<String, Long> dictionary(String text) {
        return Stream.of(text.split(""))
                .collect(Collectors.groupingBy(Object::toString, Collectors.counting()));
    }

}
