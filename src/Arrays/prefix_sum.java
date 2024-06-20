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
        System.arraycopy(num, 0, nums, 1, num.length);

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
        return sums[r]-sums[l-1];
    }

    static boolean equal_sum_subarray(int[] nums){
        int[] sumsPref = new int[nums.length];
        System.arraycopy(nums, 0, sumsPref, 0, nums.length);
        prefSum(sumsPref);
        int sum = 0;
        boolean isYes = false;

        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                sum += nums[j];
            }
            if (sumsPref[i] == sum){
                isYes = true;
                break;
            }
            else sum = 0;
        }

        return isYes;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(prefSum(new int[]{1,2,3,4,5,6})));
        System.out.println(Arrays.toString(prefSum(new int[]{2,1,3,4,5})));
        System.out.println(Arrays.toString(new int[]{sub_prefix_sum_brute_force(new int[]{2, 4, 1, 3, 6}, 2, 5)}));

        int[] sum = new int[]{sub_prefix_sum_optimized(new int[]{2, 4, 1, 3, 6, 5}, 3, 5)};
                                                                // 2,6,7,10,16,21 -> bina one indexing ke pref[r-1]-pref[l-2]
        System.out.println(Arrays.toString(sum));

        System.out.println(equal_sum_subarray(new int[]{5,3,2,6,3,1}));
        System.out.println(equal_sum_subarray(new int[]{15,5,6,4,8,2}));
        System.out.println(equal_sum_subarray(new int[]{1,2,3,4,5}));
        System.out.println(equal_sum_subarray(new int[]{5,8,2,3,4}));

        equal_sum_subarray check1 = new equal_sum_subarray();
        boolean checked = check1.equal_sum_subarray_optimized(new int[]{5,3,2,6,3,1});
        System.out.println(checked);
    }
}

class equal_sum_subarray{
    public int[] suffix_sum(int[] nums){
        int sum = 0;
        for (int i = nums.length-1; i >=0; i--){
            sum += nums[i];
            nums[i] = sum;
        }
        return nums;
    }
    public boolean equal_sum_subarray_optimized(int[] nums){
        int[] suffixes = new int[nums.length];
        int[] prefixes = new int[nums.length];
        System.arraycopy(nums,0, suffixes,0, nums.length);
        System.arraycopy(nums,0, prefixes,0, nums.length);

        suffix_sum(suffixes);
        prefix_sum.prefSum(prefixes);
        int ptr2 = nums.length-1;
        boolean isYes = false;
        for(int i = 0; i < ptr2; i++, ptr2--){
            if(prefixes[i] == suffixes[ptr2]){
                isYes = true;
                break;
            }
        }

        return isYes;
    }
}
