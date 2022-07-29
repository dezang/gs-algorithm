package inflean;

/**
 * 대소문자 변환
 */
public class S01P02 {
    public static String solution(String input) {
        char[] chars = input.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else {
                System.out.println("Unexpected input.");
            }
        }

        return sb.toString();
    }
}
