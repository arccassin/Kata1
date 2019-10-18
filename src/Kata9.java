/**
 * Created by User on 17 Окт., 2019
 */
public class Kata9 {
    public static int pointsNumber(int radius) {
        int inc = 0;
        int sqrRadius = radius * radius;
        for (int i = -radius; i <= radius; i++) {
            int sqrI = i * i;
            for (int j = -radius; j <= radius; j++) {
                if ((sqrI + j * j) <= sqrRadius) {
                    inc++;
                }
            }
        }
        return inc;
    }
}
