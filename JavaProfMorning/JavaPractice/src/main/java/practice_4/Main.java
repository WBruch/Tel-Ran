package practice_4;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Необходимо продемонстрировать работу интерфейсв Comparable на примере класса House.
 *
 * 1.Создать класс House с 4 полями: номер дома, площадь дома, цена дома, город
 * 2. Переопределить метод toString(), что бы можно было распечатать объект House в читабельном виде
 * 3. Имплементировать интерфейс Comparable
 * 4. Создать основной класс Main внутри которого создать несколько разных объектов типа House
 * 5. Отсортировать список домов по площади дома, реализовав метод compareTo с использование if
 * 5*  Отсортировать список домов по площади дома методом класса обертки возвращаемого типа метода compareTo
 * 6. Отсортировать список по названию городов
 * 7. Написать реализацию метода compareTo так, что бы учитывалось при сравнении 3 поля: number, area, city
 *  - если номера домов разные, то сортируем по номеру дома
 *  - если номера домов одинаковые, то сортируем по площади
 *   - если площади разные, сортируем по площади, если одинаковые, то сортируем по названию города
 *
 * Подсказка: в методе compareTo будет 3 логических части
 */
public class Main {
    public static void main(String[] args) {
        House h1 = new House(12,100.2,120000,"Neuwied");
        House h2 = new House(34,150.0,122000,"Asbach");
        House h3 = new House(1,90.2,450000,"Trier");
        House h4 = new House(67,130.5,650000,"Sieg");


        List<House> houseList = new ArrayList<>();
        houseList.add(h1);
        houseList.add(h2);
        houseList.add(h3);
        houseList.add(h4);

        System.out.println(houseList);
        Collections.sort(houseList);
        System.out.println(houseList);


    }
}
