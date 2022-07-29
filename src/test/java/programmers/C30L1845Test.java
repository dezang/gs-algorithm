package programmers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class C30L1845Test {
    @Test
    void name() {
        int[] input = {3,1,2,3};
        C30L1845 problem = new C30L1845();
        int answer = problem.solution(input);
        Assertions.assertEquals(2, answer);

        int[] input2 = {3,3,3,2,2,4};
        answer = problem.solution(input2);
        Assertions.assertEquals(3, answer);
    }
}