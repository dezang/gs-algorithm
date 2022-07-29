import java.util.Scanner;

public class Main {
    public static String solution(int n, String ... words) {
        StringBuilder resultSb = new StringBuilder();
        StringBuilder workSb = new StringBuilder();

        if (words.length != n) {
            throw new IllegalArgumentException("Bad Request");
        }

        for(String word : words) {
            workSb.setLength(0);
            workSb.append(word);
            StringBuilder reverse = workSb.reverse();
            resultSb.append(reverse);
            resultSb.append("\n");
        }
        return resultSb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] inputWords = new String[n];
        for (int i = 0; i < n; i++) {
             inputWords[i] = scanner.next();
        }
        System.out.println(solution(n, inputWords));
    }
}
