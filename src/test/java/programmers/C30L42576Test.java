package programmers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class C30L42576Test {
    @Test
    void problem() {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        String answer = solution(participant, completion);
        Assertions.assertEquals("leo", answer);
    }

    private String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> analytics = new HashMap<>();
        for (String player : participant) {
            analytics.put(player, analytics.getOrDefault(player, 0) + 1);
        }

        for (String player : completion) {
            analytics.put(player, analytics.get(player) - 1);
        }

        for (String key : analytics.keySet()) {
            if (analytics.get(key) != 0) {
                answer = key;
                break;
            }
        }

        return answer;
    }
}
