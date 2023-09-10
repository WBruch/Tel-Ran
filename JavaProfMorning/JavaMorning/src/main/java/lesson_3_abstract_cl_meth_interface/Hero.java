package lesson_3_abstract_cl_meth_interface;

public abstract class Hero {

    String name;
    abstract void walk();
    abstract void attack();
    void shot() {
        System.out.println("*****");
    }

    public Hero(String name) {
        this.name = name;
    }
}

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

interface Flyable {

    void fly();

}

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

interface Flyable22 {

    void fly2();

}

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
class Hero1 extends Hero implements Flyable, Flyable22{

    public Hero1(String name) {
        super(name);
    }

    @Override
    void walk() {
        System.out.println("Hero1 walk");
    }

    @Override
    void attack() {
        System.out.println("Hero1 attack");
    }

    @Override
    public void fly() {
        System.out.println("Hero1 fly");
    }

    @Override
    public void fly2() {
        System.out.println("Hero1 fly higher");
    }
}

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
class Hero2 extends Hero {
    public Hero2(String name) {
        super(name);
    }

    @Override
    void walk() {
        System.out.println("Hero2 walk");
    }

    @Override
    void attack() {
        System.out.println("Hero2 attack");
    }
}
