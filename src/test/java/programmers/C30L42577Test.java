package programmers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class C30L42577Test {
    @Test
    void problem() {
        String[] phoneBook = {"119", "97674223", "1195524421"};
        boolean answer = solution(phoneBook);
        Assertions.assertFalse(answer);
    }

    private boolean solution(String[] phoneBook) {
        boolean answer = true;
        HashMap stringHashMap = new HashMap<String, Integer>();
        for (String phone : phoneBook) {
//            stringHashMap.put(phone, )
        }
        return answer;
    }
}
