package summaryFriday.sum_01_09;


import java.util.Random;

public class Weapon {

    private String name;
    private int force;

    public Weapon(String name, int force) {
        this.name = name;
        this.force = force;
    }

    public static Weapon generateRandomWeapon(){
        String[] names = {"Sword", "Knife", "Gun", "Stick", "Pen"};
        int[] forces = {20, 10, 50, 5, 2};
        int number = names.length;
        Random random = new Random();
        int randomInd = random.nextInt(number);
        Weapon weapon = new Weapon(names[randomInd], forces[randomInd]);
        return weapon;
    }

}
