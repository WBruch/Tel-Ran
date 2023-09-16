package summaryFriday.sum_15_09;

import java.util.Objects;

public class A {
    String s;
    int i;
    boolean b;

    @Override
    public boolean equals(Object another) {
        if (another instanceof A) {
            A anotherA = (A) another;
            return s.equals(anotherA.s);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(s, i, b);
    }
}
