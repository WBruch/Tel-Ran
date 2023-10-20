package summaryFriday.sum_20_10;

import summaryFriday.sumTasks.task1.Monkey;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MonkeyTest {
    public static void main(String[] args) {

        Monkey monkey1 = new Monkey("A", 3, "grey", false, 10.9);
        Monkey monkey2 = new Monkey("A", 2, "white", true, 10.1);
        Monkey monkey3 = new Monkey("T", 3, "grey", false, 5);
        Monkey monkey4 = new Monkey("J", 2, "black", true, 7);
        Monkey monkey5 = new Monkey("Y", 1, "grey", true, 6);

        List<Monkey> monkeys = new ArrayList<>();
        monkeys.add(monkey1);
        monkeys.add(monkey2);
        monkeys.add(monkey3);
        monkeys.add(monkey4);
        monkeys.add(monkey5);

        /**
         * Составить тестовый список экземпляров данного класса List monkeys и на его основе
         *
         * Получить Map имя / информация, голодна ли обезьянка
         * Получить Map цвет / количество обезьян данного цвета
         * Получить Map цвет / список имен обезьян данного цвета
         * Создать компаратор и отсортировать исходный список по весу и имени
         */
//  Получить Map имя / информация, голодна ли обезьянка
        Map<String, List<Boolean>> collect = monkeys.stream().collect(Collectors.groupingBy(Monkey::getName, Collectors.mapping(Monkey::isHungry, Collectors.toList())));
        System.out.println(collect);

//  Получить Map цвет / количество обезьян данного цвета
        Map<String, Long> groupByColour = monkeys.stream().collect(Collectors.groupingBy(monkey -> monkey.getColour(), Collectors.counting()));
        System.out.println(groupByColour);

//  Получить Map цвет / список имен обезьян данного цвета
        Map<String, List<String>> groupByColourToList = monkeys.stream().collect(Collectors.groupingBy(monkey -> monkey.getColour(), Collectors.mapping(monkey -> monkey.getName(), Collectors.toList())));
        System.out.println(groupByColourToList);

//  Создать компаратор и отсортировать исходный список по весу и имени
//        List<Monkey> sortedList = monkeys.stream().sorted((o1, o2) -> o1.getWeight() == o2.getWeight() ? 0 : (o1.getWeight() < o2.getWeight() ? -1 : 1)).toList();
        List<Monkey> sorted = monkeys.stream().sorted(Comparator.comparingDouble(Monkey::getWeight).thenComparing(Monkey::getName)).toList();
        System.out.println(sorted);
    }
}

