package inflean;

/**
 * 문장 속 단어
 */
public class S01P03 {
    public static String solution(String input) {
        String[] words = input.split(" ");
        String result = "";
        for (String word : words) {
            if (word.length() > result.length()) {
                result = word;
            }
        }
        return result;
    }
}
