package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        HashSet<String> hashSet = new HashSet<>(firstSet);
        hashSet.retainAll(secondSet);
        hashSet.removeAll(thirdSet);
        HashSet<String> hashSetTwo = new HashSet<>(thirdSet);
        hashSetTwo.removeAll(firstSet);
        hashSetTwo.removeAll(secondSet);
        hashSet.addAll(hashSetTwo);
        return hashSet;
    }
}
/*boolean retainAll(Collection<?> c)
	Retains only the elements in this set that are contained in the specified collection (optional operation)

 */