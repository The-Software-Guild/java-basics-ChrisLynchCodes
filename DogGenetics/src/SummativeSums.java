public class SummativeSums {

    public static int summativeSums(int[] nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        return sum;

    }
}
