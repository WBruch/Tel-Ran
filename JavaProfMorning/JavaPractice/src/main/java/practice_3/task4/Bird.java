package practice_3.task4;

abstract class Bird {
    private String name;

    abstract void voice();

    BirdType type;

    public Bird(String name, BirdType type) {
        this.name = name;
        this.type = type;
    }
}
