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

    public static void main(String[] args) {
        System.out.println(Arrays.toString(prefSum(new int[]{1,2,3,4,5,6})));
        System.out.println(Arrays.toString(prefSum(new int[]{2,1,3,4,5})));
    }
}
