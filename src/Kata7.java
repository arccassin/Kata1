import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by User on 15 Окт., 2019
 */
public class Kata7 {
    public static String fireAndFury(final String tweet) {
        String tmpStr = tweet;
        String resStr = "Fake tweet.";

        tmpStr = tmpStr.replaceAll("FIRE", "0");
        tmpStr = tmpStr.replaceAll("FURY", "1");
        tmpStr = tmpStr.replaceAll("\\D", "");
        StringBuilder builder = new StringBuilder();
        char[] arr = tmpStr.toCharArray();

        Pattern p = Pattern.compile("[^EFIRUY]");
        Matcher m = p.matcher(tweet);


        if (arr.length == 0 || m.find()) {
            return resStr;
        }
        char c = arr[0];
        int count = 1;
        boolean flag = false;
        for (int i = 1; i < tmpStr.length() + 1; i++) {
            if (i == tmpStr.length()) {
                flag = true;
            } else {
                if (c == arr[i]) {
                    count++;
                    flag = false;
                } else flag = true;
            }
            if (flag) {
                if (c == '0') {
                    builder.append(" You");
                } else {
                    builder.append(" I am");
                }
                for (int j = 1; j < count; j++) {
                    if (c == '0') {
                        builder.append(" and you");
                    } else {
                        builder.append(" really");
                    }
                }
                if (c == '0') {
                    builder.append(" are fired!");
                } else {
                    builder.append(" furious.");
                }
                count = 1;
            }
            if (i != tmpStr.length()) {
                c = arr[i];
            }

        }
        if (builder.length() != 0) {
            resStr = builder.toString().trim();
        }
        return resStr;
    }

}
