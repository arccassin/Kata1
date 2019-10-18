import java.util.ArrayList;
import java.util.List;

/**
 * Created by MYE on 08.10.19.
 */
// Make sure your class is public
public class Kata4 {

    public static List<String> availableMoves(String position) {
        ArrayList<String> resList = new ArrayList<>();
        if ((position == null) || (position.length() != 2)) return resList;
        char posCh = position.charAt(0);
        int posInt = Integer.parseInt(position.substring(1));
        if ((posCh > 'H') || (posCh < 'A') || (posInt < 1) || (posInt > 8)) return resList;

        char[] arrChar = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
        for (char ch: arrChar) {
            int iDelta = posCh - ch;
            for (int i = 1; i < 9; i++) {
                if (((i == (posInt - iDelta)) || (i == (posInt + iDelta)) || (iDelta == 0) || (posInt == i))
                        && (!((iDelta == 0) && (posInt == i)))){
                    resList.add(String.valueOf(ch) + i);
                }
            }
        }
        return resList;
    }


}