package inflean;

/**
 * 단어 뒤집기
 */
public class S01P04 {
    public static String solution(int n, String ... words) {
        StringBuilder resultSb = new StringBuilder();
        StringBuilder workSb = new StringBuilder();

        if (words.length != n) {
            throw new IllegalArgumentException("Bad Request");
        }

        for(String word : words) {
            workSb.setLength(0);
            workSb.append(word);
            resultSb.append(workSb.reverse());
            resultSb.append("\n");
        }
        return resultSb.toString();
    }
}
