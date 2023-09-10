package practice_3.task4;

public enum BirdType {
    SWIM("can swim"),
    FLY("can fly"),
    BOTH("can fly & swim");

    private String ability;

    BirdType(String ability) {
        this.ability = ability;
    }

    public String getAbility() {
        return ability;
    }
}
