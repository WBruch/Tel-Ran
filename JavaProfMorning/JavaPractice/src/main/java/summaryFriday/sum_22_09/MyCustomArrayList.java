package summaryFriday.sum_22_09;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyCustomArrayList implements Iterable<String> {

    private String[] data;

    public MyCustomArrayList(String[] data) {
        this.data = data;
    }

    @Override
    public Iterator<String> iterator() {

        return new Iterator<String>() {
            int currentIndex = data.length - 1;

            @Override
            public boolean hasNext() {
                return currentIndex >= 0;
            }

            @Override
            public String next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return data[currentIndex--];
            }
        };
    }
}
