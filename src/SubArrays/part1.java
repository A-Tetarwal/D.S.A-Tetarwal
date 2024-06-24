package SubArrays;

public class part1 {
    static void printAllSubArrays(int[] nums){
        for(int i = 0; i < nums.length; i++){ // 1 to n jayega
            for(int k = i; k < nums.length; k++){ // har baar i se shuru hoga
                for (int j = i; j <= k; j++) { // har baar i se shuru hokar k tk jayega. (k lagatar badh rha h)
                    System.out.print(nums[j]);
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        printAllSubArrays(new int[]{1,2,3,4,5});
    }
}
