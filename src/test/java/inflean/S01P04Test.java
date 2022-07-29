package inflean;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S01P04Test {
    @Test
    void name() {
        String sol = new S01P04().solution(3, "good", "Time", "Big");
        Assertions.assertEquals("doog\nemiT\ngiB\n", sol);
    }
}