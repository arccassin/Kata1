/**
 * Created by User on 09 Окт., 2019
 */
public class Kata3 {
    public static char findMissingLetter(char[] array)
    {
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] != (array[i] - 1)) return (char)(array[i] - 1);
        }
        return ' ';
    }
}
