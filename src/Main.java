import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        // before - enhanced for loop
        System.out.println(Arrays.toString(nums));
        for (int n: nums) {
            n = n * n;
        }
        // after - no change
        System.out.println(Arrays.toString(nums));

        // before - regular for loop
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        // after - changes occur
        System.out.println(Arrays.toString(nums));
    }
}