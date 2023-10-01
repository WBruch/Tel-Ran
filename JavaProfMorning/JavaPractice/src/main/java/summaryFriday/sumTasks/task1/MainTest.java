package summaryFriday.sumTasks.task1;

import java.util.*;

public class MainTest {
    public static void main(String[] args) {
        List<Monkey> monkeys = new ArrayList<>();
        monkeys.add(new Monkey("Anton", 5, "Brown", true, 10.15));
        monkeys.add(new Monkey("Berkley", 3, "Grey", false, 8.2));
        monkeys.add(new Monkey("Charles", 4, "Brown", true, 9.7));
        monkeys.add(new Monkey("Diana", 2, "Grey", false, 17.8));
        monkeys.add(new Monkey("Elly", 5, "Brown", true, 10.5));
        monkeys.add(new Monkey("Gregory", 3, "Grey", false, 8.9));
        monkeys.add(new Monkey("Yankee", 4, "Brown", true, 9.0));
        monkeys.add(new Monkey("Zack", 2, "Grey", false, 5.8));

// Получить Map имя / информация, голодна ли обезьянка
        Map<String, Boolean> nameBooleanMap = new HashMap<>();
        for (Monkey current :
                monkeys) {
            nameBooleanMap.put(current.getName(), current.isHungry());
        }
        System.out.println(nameBooleanMap);
        System.out.println("_______________________________");

// Получить Map цвет / количество обезьян данного цвета
        Map<String, Integer> colorQuantity = new HashMap<>();
        for (Monkey current :
                monkeys) {
            colorQuantity.put(current.getColour(), colorQuantity.getOrDefault(current.getColour(), 0) + 1);
        }
        System.out.println(colorQuantity);
        System.out.println("_______________________________");

// Получить Map> цвет / список имен обезьян данного цвета
        Map<String, List<String>> colorName = new HashMap<>();
        for (Monkey current :
                monkeys) {
            String color = current.getColour();
            List<String> names = colorName.get(color);
            if (names == null) {
                names = new ArrayList<>();
            }
            names.add(current.getName());
            colorName.put(color, names);
        }
        System.out.println(colorName);
        System.out.println("_______________________________");

// Создать компаратор и отсортировать исходный список по весу и имени
        Comparator<Monkey> comparator = new Comparator<Monkey>() {
            @Override
            public int compare(Monkey o1, Monkey o2) {

                int result = (int) (Math.ceil(o1.getWeight()) - Math.ceil(o2.getWeight()));
                // приходится округлять вес в большую сторону при помощи Math.ceil, т.к. при разнице
                // в весе менее 1кг (int) округляет разницу до 0 и сравнивает по имени
                if (result != 0) return result;

                result = o1.getName().compareTo(o2.getName());
                return result;
            }
        };
        System.out.println(monkeys);
        System.out.println("***********************");
        monkeys.sort(comparator);
        System.out.println(monkeys);
        System.out.println("***********************");

    }
}
