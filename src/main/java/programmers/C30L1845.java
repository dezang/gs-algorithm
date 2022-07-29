package programmers;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class C30L1845 {
    public int solution(int[] nums) {
        int numOfPickAble = nums.length / 2;
        Set<Integer> integerSet = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int numOfKind = integerSet.size();
        return Math.min(numOfKind, numOfPickAble);
    }
}
