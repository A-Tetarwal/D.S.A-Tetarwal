package twoDimArrays;

import java.util.Arrays;

public class addTwoMatrix {
    static int[][] sumOfTwoMatrix(int[][] nums1, int[][] nums2){
        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                nums1[i][j] += nums2[i][j];
            }
        }
        return nums1;
    }

    public static void main(String[] args) {
        int[][] sum2D = sumOfTwoMatrix(new int[][]{{1,2}, {1, 2}}, new int[][]{{1,2}, {1, 2}});
        System.out.println(Arrays.deepToString(sum2D));
    }
}
