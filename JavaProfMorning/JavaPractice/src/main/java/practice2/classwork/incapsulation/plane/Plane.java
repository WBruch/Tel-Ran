package practice2.classwork.incapsulation.plane;

public class Plane {
    public String name;
    public String color;
    public int passengerCount;
    public int maxDistance;

    public Plane(String name) {
        this.name = name;
    }

    public Plane(String name, String color, int passengerCount, int maxDistance) {
        this.name = name;
        this.color = color;
        this.passengerCount = passengerCount;
        this.maxDistance = maxDistance;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
}
