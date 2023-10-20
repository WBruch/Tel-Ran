package summaryFriday.sumTasks.task1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Monkey{
    private String name;
    private int age;
    private String colour;
    private boolean isHungry;
    private double weight;

    @Override
    public String toString() {
        return "Monkey{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", colour='" + colour + '\'' +
                ", isHungry=" + isHungry +
                ", weight=" + weight +
                '}';
    }
}
