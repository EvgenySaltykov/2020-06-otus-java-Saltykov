package otus.home_work.hw04;

import java.util.Comparator;

public class IntegerComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer first, Integer second) {
        return (second - first);
    }
}
