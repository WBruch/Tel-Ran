package practice1.incapsulation.example2;

public class Program {
    public static void main(String[] args) {

        // Пример инкапсуляции путем использования методов доступа.
        Person kate = new Person("Kate", 30);
        System.out.println(kate.getAge());      // 30
        kate.setAge(33);
        System.out.println(kate.getAge());      // 33
        kate.setAge(123450);
        System.out.println(kate.getAge());      // 33
    }
}
