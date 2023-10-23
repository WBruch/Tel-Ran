package org.example.lesson_17_Exeptions_and_IO.tasks;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LuhnAlgorithm {


    public static void main(String[] args) {

        System.out.println(getCard());
    }

    public static ArrayList<Integer> generator(int quantity) {
        ArrayList<Integer> cardNumber;
        Random random = new Random();
        List<Integer> intermediateNumber = IntStream.rangeClosed(0, quantity)
                .map(el -> random.nextInt(10))
                .boxed()
                .toList();

        cardNumber = new ArrayList<>(intermediateNumber);

        for (int i = 0; i < cardNumber.size(); i += 2) {
            if (intermediateNumber.get(i) * 2 > 9) {
                cardNumber.set(i, intermediateNumber.get(i) * 2 - 9);
            } else {
                cardNumber.set(i, intermediateNumber.get(i) * 2);
            }
        }
        return cardNumber;
    }

    public static ArrayList<Integer> getValidNumbers(int typeOfValidation) {
        int controlSum = 0;
        ArrayList<Integer> cardNumber;
        do {
            cardNumber = generator(typeOfValidation);
            controlSum = cardNumber.stream().reduce(Integer::sum).get();
        } while (controlSum % 10 != 0);

        return cardNumber;
    }

    public static ArrayList<Integer> getCardNumber() {
        return getValidNumbers(15);
    }

    public static ArrayList<Integer> getCvvNumber() {
        return getValidNumbers(2);
    }

    public static String getValidDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/yy");
        LocalDate validDate = LocalDate.now().plusMonths(new Random().nextInt(48, 60));
        return validDate.format(formatter);
    }

    public static String getCard() {
        String stringNumber = getCardNumber().stream()
                .map(el -> el + "")
                .reduce(String::concat)
                .get();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < stringNumber.length(); i += 4) {
            stringBuilder.append(stringNumber, i, i + 4).append(" ");
        }
        return stringBuilder.append("CVV ").append(getCvvNumber().stream()
                        .map(el -> el + "")
                        .reduce(String::concat)
                        .get())
                .append(" ")
                .append("EXP.DATE ")
                .append(getValidDate())
                .toString();
    }
}
