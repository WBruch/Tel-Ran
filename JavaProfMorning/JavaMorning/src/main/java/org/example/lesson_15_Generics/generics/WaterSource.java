package org.example.lesson_15_Generics.generics;

public class WaterSource {
    private double liters;

    public double getLiters() {
        return liters;
    }

    public void setLiters(double liters) {
        this.liters = liters;
    }
}

class ElectricSource {
    private float kilowatt;

    public float getKilowatt() {
        return kilowatt;
    }

    public void setKilowatt(float kilowatt) {
        this.kilowatt = kilowatt;
    }
}

/**
 *
 * @param <S> source type
 */
class Source<S> {
    private S quantity;

    public Source(S quantity) {
        this.quantity = quantity;
    }

    public S getQuantity() {
        return quantity;
    }

    public void setQuantity(S quantity) {
        this.quantity = quantity;
    }

    public static void main(String[] args) {
        Source<Double> water = new Source<>(100.5d);
        Source<Float> kilowatt = new Source<>(87.89f);
    }
}