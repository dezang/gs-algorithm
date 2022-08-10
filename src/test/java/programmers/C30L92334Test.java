package programmers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class C30L92334Test {
    @Test
    void name() {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;
        int[] answer = new Solution().solution(id_list, report, 2);
        int[] expected = {2, 1, 1, 0};
        Assertions.assertArrayEquals(expected, answer);
    }

    static class Solution {
        public int[] solution(String[] id_list, String[] report, int k) {
            int[] answer = new int[id_list.length];
            // 중복 신고 제거
            Set<String> resportSet = Arrays.stream(report).collect(Collectors.toSet());

            // 유저별 신고당한 횟수 저장
            HashMap<String, Integer> reportedCountMap = new HashMap<>();
            for (String userReport : resportSet) {
                String[] split = userReport.split(" ");
                reportedCountMap.put(split[1], reportedCountMap.getOrDefault(split[1], 0) + 1);
            }

            // 정지 대상자 선별
            ArrayList<String> stopUsers = new ArrayList<>();
            Set<Map.Entry<String, Integer>> entries = reportedCountMap.entrySet();
            for (Map.Entry<String, Integer> entry : entries) {
                if (entry.getValue() >= k) {
                    stopUsers.add(entry.getKey());
                }
            }
            System.out.println(stopUsers);

            // 각 유저별로, 리포트에 있으면 메일 횟수 증가
            HashMap<String, Integer> sendCountMap = new HashMap<>();
            for (String userReport : resportSet) {
                String[] split = userReport.split(" ");
                String reporter = split[0];
                String target = split[1];
                if (stopUsers.contains(target)) {
                    sendCountMap.put(reporter, sendCountMap.getOrDefault(reporter, 0) + 1);
                }
            }
            System.out.println(sendCountMap);

            for (int i = 0; i < id_list.length; i++) {
                answer[i] = (sendCountMap.getOrDefault(id_list[i], 0));
            }

            return answer;
        }
    }
}
