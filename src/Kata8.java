/**
 * Created by User on 16 Окт., 2019
 */
public class Kata8 {
    public static String print(int n) {
        if ((n <= 0) || (n % 2 == 0)) {
            return null;
        }
        int middle = n / 2 + 1;
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i < n + 1; i++) {
            int spaceCount = Math.abs(middle - i);
            int count = (n - spaceCount);
            for (int j = 0; j < count; j++) {
                if (j < spaceCount) {
                    builder.append(" ");
                } else {
                    builder.append("*");
                }
            }
                builder.append("\n");
        }

        return builder.toString();
    }
}
