public class Kata1 {
    public static int[] countPositivesSumNegatives(int[] input) {
        if ((input == null) || (input.length == 0)){
            return new int[0];
        }
        int resArr[] = new int[2];
        for (int i : input) {
            if (i > 0) {
                resArr[0] += 1;
            }
            if (i < 0) {
                resArr[1] += i;
            }
        }
        return resArr;
    }
}