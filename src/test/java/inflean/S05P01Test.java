package inflean;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S05P01Test {
    @Test
    void name() {
        String answer = new S05P01().solution("(()(()))(()");
        Assertions.assertEquals("NO", answer);
    }
}