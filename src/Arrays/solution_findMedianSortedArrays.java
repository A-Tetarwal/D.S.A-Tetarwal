package Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        double median = 0;

        // odd : (n+1)/2 term
        // even : (n/2 + (n/2 + 1))/2
        int[] mergedArr = new int[nums1.length + nums2.length];
        for(int i = 0; i < nums1.length; i++){
            mergedArr[i] = nums1[i];
        }
        for(int i = 0; i < nums2.length; i++){
            mergedArr[nums1.length + i] = nums2[i];
        }

        int n = mergedArr.length;
        // Traverse through all elements in the array
        for (int i = 0; i < n - 1; i++) {
            // Last i elements are already sorted
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the element found is greater than the next element
                if (mergedArr[j] > mergedArr[j + 1]) {
                    // Swap mergedArr[j] and mergedArr[j+1]
                    int temp = mergedArr[j];
                    mergedArr[j] = mergedArr[j + 1];
                    mergedArr[j + 1] = temp;
                }
            }
        }

        if(n%2 == 0){
            median = (double)(mergedArr[(n)/2] + mergedArr[(n/2)-1])/2;
        }
        else if(n%2 != 0){
            median = mergedArr[(n-1)/2];
        }


        return median;
    }
}