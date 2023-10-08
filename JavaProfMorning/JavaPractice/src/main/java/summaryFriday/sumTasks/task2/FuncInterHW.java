package summaryFriday.sumTasks.task2;

import summaryFriday.sumTasks.task1.Monkey;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import static java.lang.module.ModuleFinder.compose;

public class FuncInterHW {
    public static void main(String[] args) {
        List<String> jokes = Arrays.asList("joke 1", "joke 2", "joke 3", "joke 4");
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7};
// Создать Supplier randomJoke,
// который выдает пользователю случайный анекдот из заготовленного исходного списка анекдотов.

        Supplier<String> jokeGenerator = () -> {
            String joke = jokes.get(new Random().nextInt(jokes.size()));
            return joke;
        };
        System.out.println(jokeGenerator.get());

// Создать Consumer, который принимает числа и печатает четные числа в поток System.out,
// а нечетные числа в System.err.

        Consumer<Integer[]> printPositiveValues = (i) -> {
            for (Integer d : i) {
                (d % 2 == 0 ? System.out : System.err).println(d);
            }
        };
        printPositiveValues.accept(arr);

//Создать Predicate isYellowMonkey, который проверяет, желтого ли цвета обезьянка Monkey
        Predicate<Monkey> isYellowMonkey = (m) -> m.getColour().equalsIgnoreCase("yellow");
        System.out.println(isYellowMonkey.test(new Monkey("Yankee", 4, "Brown", true, 9.0)));
        System.out.println(isYellowMonkey.test(new Monkey("Jim", 2, "Yellow", false, 5.3)));


// *.Создать с помощью методов Function .compose() и .andThen() функцию convertToCelsius, которая
// заменяет исходное число типа Integer на его строковое представление, добавляя
// в строковом представлении перед числом его знак (+ или -)
// добавляет после числа текст "degrees Celsius"
// ограничивает значения числа значениями +/- 100, выдавая граничные значения при превышении диапазона
//  convertToCelsius.apply(-150) вернет "-100 degrees Celsius"
//  convertToCelsius.apply(150) вернет "+100 degrees Celsius"
        Function<Integer, Integer> limitValues = i -> (i < 100 && i > -100) ? i : i > 0 ? 100 : -100;
        Function<Integer, String> getSign = i ->  ((i > 0) ? ("+" + i) : (i.toString()));
        Function<String, String> getStr = s -> s + " degrees Celsius";
        Function<Integer, String> convertToCelsius = c -> getSign.compose(limitValues).andThen(getStr).apply(c);

        //getSign.apply(el).concat(limitValues.apply(el)).concat(" degrees Celsius"); работает отлично, но не
        // удовлетворяет условию задачи об использовании методов Function

        System.out.println(convertToCelsius.apply(150));
        System.out.println(convertToCelsius.apply(-3));
    }
}
