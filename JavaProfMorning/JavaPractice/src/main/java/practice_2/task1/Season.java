package practice_2.task1;

import lombok.Getter;
@Getter
public enum Season {

    WINTER("december", "januar", "februar"),
    SPRING("march", "april", "may"),
    SUMMER("june", "july","august"),
    AUTUMN("september", "oktober", "november");

    private final String month1, month2, month3;

    Season(String month1, String month2, String month3) {
        this.month1 = month1;
        this.month2 = month2;
        this.month3 = month3;
    }
}
