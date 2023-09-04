package lesson_2_Enum.enums;

public enum Currency {

    USD("$"),
    EUR("&");

    private String symbol;

    Currency(String symbol) {
        this.symbol = symbol;
    }
}
