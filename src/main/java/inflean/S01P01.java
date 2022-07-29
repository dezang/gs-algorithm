package inflean;

/**
 * 문자 찾기
 */
public class S01P01 {
    public static int solution (String str, char t) {
        int answer = 0;
        String upperStr = str.toUpperCase();
        char upperChar = Character.toUpperCase(t);
        for (int i = 0; i < upperStr.length(); i++) {
            if (upperStr.charAt(i) == upperChar) answer++;
        }
        return answer;
    }
}
