public class targetSumArray {
    static int targetSum1(int[] array){
        int pairs=0;
        for (int i = 0; i< array.length; i++){
            for (int j=i+1; j< array.length; j++){
                if (array[i]+array[j]==7){
                    pairs++;
                }
            }
        }
        return pairs;
    }

    static int targetSum2(int[] array){
        int triplets=0;
        for (int i=0; i<array.length; i++){
            for (int j=i+1; j<array.length; j++){
                for (int k=j+1; k<array.length; k++){
                    if (array[i]+array[j]+array[k]==12){
                        triplets++;
                    }
                }
            }
        }
        return triplets;
    }

    static boolean ifUnique(int[] array){
        boolean isUnique=false;
        for (int i=0; i<array.length; i++){
            for (int j=i+1; j< array.length; j++){
                isUnique= array[i] != array[j];
            }
        }
        return isUnique;
    }

    static int secondLargest(int[] array){
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for (int j : array) {
            if (max < j) {
                max = j;
            }
        }
        for (int i = 0; i< array.length; i++){
            if (array[i] == max) {
                array[i] = Integer.MIN_VALUE;
            } else secondMax=Arrays.maxValueInArray(array);
        }
        return secondMax;
    }



    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6,2,3};
        int[] array2 = {4,6,3,5,8,2};
        int[] array3 = {1,4,5,6,3};
        int[] array4 = {1,2,3,4,2,1,3};
        int[] array5 = {9,8,9,6,9,5,8};
//        int pairVal = targetSum1(array2);
//        System.out.println(pairVal);

//        int tripletVal = targetSum2(array3);
//        System.out.println(tripletVal);

//        boolean uniqueValue= ifUnique(array4);
//        System.out.println(uniqueValue);

        int secondMaxie = secondLargest(array5);
        System.out.println("second max element in arrary5 is: "+ secondMaxie);
    }
}
