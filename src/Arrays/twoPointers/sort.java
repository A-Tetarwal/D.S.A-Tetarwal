package Arrays.twoPointers;

import java.util.Arrays;

public class sort {
    public int[] srt01_method1(int[] nums){
        int count = 0;
        for(int each: nums){
            if(each == 0){
                count++;
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(i < count){
                nums[i] = 0;
            }
            else nums[i] = 1;
        }
        return nums;
    }

    public int[] srt01_method2(int[] nums){ // here we'll use two pointers
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            if(nums[left] == 1 && nums[right] == 0){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
            if(nums[left] == 0){
                left++;
            }
            if(nums[right] == 1){
                right--;
            }
        }
        return nums;
    }

    public int[] srt01_method3(int[] nums){ // according to chatGPT this is a better approach
        // for loop se to nahin ho raha abhi upar wale tarike se, jb ho jaye tb kr lena
        // ek naye tarike se ho jayega
        int right = 0;
        for (int left = 0; left < nums.length; left++){
            if(nums[left] == 0){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right++] = temp;
            }
        }
        return nums;
    }

    public int[] oddEveArray(int[] nums){
        int go = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]%2 == 0){
                int temp = nums[i];
                nums[i] = nums[go];
                nums[go++] = temp;
            }
        }
        return nums;
    }

    public int[] sqrOfEach_method1(int[] nums){
        for (int i = 0; i < nums.length; i++){
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    public int[] sqrOfEach_method2(int[] nums){
        int proceed = 0;
        for (int )
    }
}

class finale {
    public static void main(String[] args) {
        sort array1 = new sort();
        int[] newArr = array1.srt01_method1(new int[]{0,1,1,0,1,0,0,1,0});
        System.out.println(Arrays.toString(newArr));
        System.out.println(Arrays.toString(array1.srt01_method2(new int[]{0,1,1,0,1,0,0,1,0})));
        System.out.println(Arrays.toString(array1.srt01_method3(new int[]{0,1,1,0,1,0,0,1,0})));

        System.out.println(Arrays.toString(array1.oddEveArray(new int[]{1,2,3,4,5,6,7})));

        System.out.println(Arrays.toString(array1.sqrOfEach_method1(new int[]{2,3,4,-1,-2})));
    }
}
