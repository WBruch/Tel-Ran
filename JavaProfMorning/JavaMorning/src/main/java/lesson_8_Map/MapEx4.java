package lesson_8_Map;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Map;
import java.util.TreeMap;

public class MapEx4 {
    public static void main(String[] args) {
        Map<Integer,String> map = new TreeMap<>();
        map.put(1,"qwe");
        map.put(14,"qr");
        map.put(51,"qdf");
        map.put(16,"qwee");
        map.put(21,"uyy");

        System.out.println(map);

        Map<Car, String> carStringMap = new TreeMap<>();
        carStringMap.put(new Car("Passat",false,86),"Volkswagen");
        carStringMap.put(new Car("Polo",false,70),"Volkswagen");
        carStringMap.put(new Car("Up",false,56),"Volkswagen");
        carStringMap.put(new Car("Golf",false,99),"Volkswagen");
        carStringMap.put(new Car("Golf gti",true,120),"Volkswagen");
        System.out.println(carStringMap);
    }
}
@Getter
@AllArgsConstructor
@ToString
class Car implements Comparable<Car>{
   private String model;
   private boolean isSport;
   private int horsePower;


    @Override
    public int compareTo(Car o) {
        return this.horsePower - o.horsePower;
    }
}
