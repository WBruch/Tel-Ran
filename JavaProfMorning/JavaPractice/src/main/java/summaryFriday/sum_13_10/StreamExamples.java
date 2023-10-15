package summaryFriday.sum_13_10;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExamples {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("a","re","wer","fgh");

//        for (String str : stringList) {
//            // do something with "str"
//        }

//        Stream<String> stringStream = stringList.stream();
//        stringStream.forEach(System.out::println);

        System.out.println("Start");
        Stream<String> stream1 = stringList.stream(); // generation
        Stream<String> stream2 = stream1.filter(s -> s.length() == 3); // intermediate
        Stream<String> stream3 = stream2.map(s -> "word " + s);   // intermediate
        Stream<String> stream4 = stream3.peek(s -> System.out.println("intermediate operation with " + s));

        // some other operations
        System.out.println("some other operations");

        List<String> finalList = stream4.toList(); // terminal
        finalList.forEach(System.out::println);


        List<Integer> integers = Arrays.asList(12, 3, 98, 4, 5, 76);
        List<String> result = integers.stream().filter(integer -> integer % 2 == 0)
                .peek(System.out::println).map(integer -> "Filtered " + integer + " *** ")
                .toList(); // terminal



        List<List<String>> schoolGroups = new ArrayList<>();
        List<String> group1 = Arrays.asList("Ivan","Petr","Jack");
        List<String> group2 = Arrays.asList("John","Peter");
        List<String> group3 = Arrays.asList("Olga","Mark","Olaf");
        schoolGroups.add(group1);
        schoolGroups.add(group2);
        schoolGroups.add(group3);
                                                                    // Collections::stream
        List<String> schoolStudents = schoolGroups.stream().flatMap(group -> group.stream()).toList();
        schoolStudents.forEach(System.out::println);


        List<String> words = Arrays.asList("How", " are", " you ", "?");
        words.stream().flatMap(s -> s.chars().boxed())
                .map(Character::toString)
                .distinct()
                .forEach(System.out::println);


    }

}
