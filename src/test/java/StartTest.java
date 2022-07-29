import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@SuppressWarnings("ALL")
class StartTest {
    @Test
    void 대소문자_변환() {
        String input = "StuDY";
        String expect = "sTUdy";

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

        String result = sb.toString();
        System.out.println(result);
        Assertions.assertEquals(expect, result);
    }

    @Test
    void 문장_속_단어() {
        String input = "my name is hwangdezang 12345678901";
        String[] words = input.split(" ");
        String result = "";
        for (String word : words) {
            if (word.length() > result.length()) {
                result = word;
            }
        }
        Assertions.assertEquals("hwangdezang", result);
    }
}
