package practice2.classwork.enums.task1;

enum Season {
    WINTER("snow"),
    SPRING("green"),
    SUMMER("sun"),
    AUTUMN("rain");

    // best practice use final for variable,guarantee
    // that it will not be accidentally modified or reassigned
    // to a different value within the class or its subclasses.
    private String value;

    Season(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static void main(String[] args) {
        Season[] seasons = Season.values();
        for (Season season : seasons) {
            System.out.println(season); // 1
            System.out.println(season.getValue() + "\n"); // 2
        }

        System.out.println("Winter: " + Season.WINTER); // 3
        System.out.println("Winter with value of: " + Season.valueOf("WINTER")); // 4

        System.out.println(Season.WINTER.ordinal()); //5

    }
}
