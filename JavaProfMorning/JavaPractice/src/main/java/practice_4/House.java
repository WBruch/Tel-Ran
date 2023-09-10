package practice_4;

public class House implements Comparable<House> {
    private int number;
    private double area;
    private int price;
    private String city;

    public House(int number, double area, int price, String city) {
        this.number = number;
        this.area = area;
        this.price = price;
        this.city = city;
    }

    @Override
    public String toString() {
        return "House{" +
                "number=" + number +
                ", area=" + area +
                ", price=" + price +
                ", city='" + city + '\'' +
                '}';
    }


    @Override
    public int compareTo(House o) {
//        return (int)(this.area - o.area);
//        return Integer.compare((int)this.area ,(int)o.area);
//        return  this.city.compareTo(o.city);
        if (this.number != o.number) {
            return this.number - o.number;
        } else if (this.area != o.area) {
            return (int) (this.area - o.area);
        } else {
            return this.city.compareTo(o.city);
        }
    }

//        int i = Integer.compare(this.number, o.number);
//        if (i != 0) return i;
//
//        i = Integer.compare(this.area, o.area);
//        if (i != 0) return i;
//
//        return this.city.compareTo(o.getCity());
}
