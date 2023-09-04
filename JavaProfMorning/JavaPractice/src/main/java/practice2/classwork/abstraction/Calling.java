package practice2.classwork.abstraction;

public class Calling {
    public static void main(String[] args) {
        AbstractPhone firstPhone = new ThomasEdisonPhone(1879);
        AbstractPhone phone = new ClassicPhone(1984);
        AbstractPhone videoPhone = new VideoPhone(2018);
        User user = new User("Андрей");
        user.callAnotherUser(224466, firstPhone);
        // Вращайте ручку
        //Сообщите номер абонента, сэр
        user.callAnotherUser(224466, phone);
        //Вызываю номер 224466
        user.callAnotherUser(224466, videoPhone);
        //Подключаю видеоканал для абонента 224466

        AbstractPhone smartphone = new Smartphone(2000, "Win 2000");

        user.callAnotherUser(0412231, smartphone);
    }

}
