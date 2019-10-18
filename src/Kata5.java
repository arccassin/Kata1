import java.util.Arrays;

import static java.util.Comparator.reverseOrder;

/**
 * Created by User on 12 Окт., 2019
 */
public class Kata5 {
//    public static long nextBiggerNumber(long n) {
//        long res = -1;
//        char[] chArrIn  = Long.toString(n).toCharArray();
//        char[] chArrExp= chArrIn.clone();
//
//        Arrays.sort(chArrExp);
//        char[] chArrChecking = new char[chArrExp.length];
//        for (int i = 0; i < chArrChecking.length; i++) {
//            chArrChecking[i] = chArrExp[chArrExp.length - i - 1];
//        }
//        if (Arrays.equals(chArrChecking, chArrIn)){
//            return res;
//        }
//
//        long lCheking = Long.valueOf(String.valueOf(chArrChecking));
//        lCheking -= n;
//
//        int stop = 0;
//        for (int i = 0; i < lCheking; i++) {
//            ++n;
//            char[] chArrAct = Long.toString(n).toCharArray();
//            Arrays.sort(chArrAct);
//            if (Arrays.equals(chArrAct, chArrExp)) {
//                return n;
//            }
//        }
//        return res;
//    }

    public static long nextBiggerNumber(long n)
    {
        char [] s = String.valueOf(n).toCharArray();
        for(int i = s.length - 2; i >= 0; i--){
            for (int j = s.length-1; j > i; j--){
                if(s[i] < s[j]){
                    char tmp = s[i];
                    s[i] = s[j];
                    s[j] = tmp;
                    Arrays.sort(s, i+1, s.length);
                    return Long.valueOf(String.valueOf(s));
                }
            }
        }
        return -1;
    }


}
