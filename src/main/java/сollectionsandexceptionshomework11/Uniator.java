package сollectionsandexceptionshomework11;

import java.util.HashSet;
import java.util.Set;

public class Uniator {

    static void union(Set<?>... set) {
        Set<?> result = new HashSet<>();
        for (Set nextSet : set) {
            result.addAll(nextSet);
        }
        System.out.println(result);
    }

    static void intersect(Set<?> first, Set<?> second) {
        Set<Object> result = new HashSet<>();
        for (Object elemenFirst : first) {
            if (second.contains(elemenFirst)) {
                result.add(elemenFirst);
            }
        }
        System.out.println(result);
    }

    static void intersect(Set<?>... set) {
        Set<Object> result = new HashSet<>();
        Set<?> first = set[0];

        for (Object nextEl : first) {
            boolean containsAll = true;

            for (int i = 1; i < set.length; i++) {
                if (!set[i].contains(nextEl)) {
                    containsAll = false;
                    break;
                }
            }

            if (containsAll) {
                result.add(nextEl);
            }
        }

        System.out.println(result);
    }
}
