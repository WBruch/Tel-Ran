package practice1.incapsulation.example1;

public class Program {
    public static void main(String[] args) {
        // Пример работы модификторов доступа
        Person kate = new Person("Kate", 32, "Baker Street", "+12334567");
        kate.displayName();     // работает, метод public
        kate.displayAge();      // работает, метод имеет модификатор доступа по умолчанию
        kate.displayPhone();    // работает, метод protected
        //kate.displayAddress();  // ! Ошибка, метод private

        System.out.println(kate.name);      // работает, модификатор по умолчанию
        System.out.println(kate.address);   // работает, модификатор public
        System.out.println(kate.age);       // работает, модификатор protected
        //System.out.println(kate.phone);   // ! Ошибка, модификатор private
    }
}
