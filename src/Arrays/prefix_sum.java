package Arrays;
import java.util.Arrays;
public class prefix_sum {
    static int[] prefSum(int[] nums){
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            nums[i] = sum;
        }
//        or
//        for(int i = 1; i < nums.length; i++){
//            nums[i] += nums[i-1];
//        }
        return nums;
    }

    static int sub_prefix_sum_brute_force(int[] num, int l, int r){
        // one based indexing rakhni hai
        int[] nums = new int[num.length + 1];
        for(int i = 1; i <= num.length; i++){
            nums[i] = num[i-1];
        }

        int sum = 0;
        for(int i = l; i <= r; i++){
            sum += nums[i];
        }

        return sum;
    }

    static int sub_prefix_sum_optimized(int[] nums, int l, int r){
        prefSum(nums);
        int[] sums = new int[nums.length + 1];
        System.arraycopy(nums, 0, sums, 1, nums.length);
        return nums[r-1]-nums[l-2];
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(prefSum(new int[]{1,2,3,4,5,6})));
        System.out.println(Arrays.toString(prefSum(new int[]{2,1,3,4,5})));
        System.out.println(Arrays.toString(new int[]{sub_prefix_sum_brute_force(new int[]{2, 4, 1, 3, 6}, 2, 5)}));

        int[] sum = new int[]{sub_prefix_sum_optimized(new int[]{2, 4, 1, 3, 6, 5}, 3, 5)};
                                                                // 2,6,7,10,16,21 -> bina one indexing ke pref[r-1]-pref[l-2]
        System.out.println(Arrays.toString(sum));
    }
}
