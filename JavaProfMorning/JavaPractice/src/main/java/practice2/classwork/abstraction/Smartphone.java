package practice2.classwork.abstraction;

public class Smartphone extends VideoPhone {

    private String operationSystem;

    public Smartphone(int year, String operationSystem) {
        super(year);
        this.operationSystem = operationSystem;
    }

    public void install(String program) {
        System.out.println("Устанавливаю " + program + " для " + operationSystem);
    }

    @Override
    public void call(int outputNumber) {
        install("Skype");
        System.out.println("Вызываю " + outputNumber + " по Skype!" );
    }


}
