public class Arrays {
    static void arrayBasic(){
        //array declaration
        int [] ages;
        ages=new int[5];

        //array literal
        int[] intArray = {1,2,4,5,6,7,8,9,10};
        System.out.print("{");
        for (int i=0; i<9; i++){
            System.out.print(intArray[i]+" ");
        }
        System.out.println("}");
    }

    static void array(){
        int[] array = new int[300];

        for (int i=0; i<300; i++){
            array[i]=i+1;
            System.out.print("array["+i+"]: "+array[i]+", ");
        }
    }

    static void array_2_dimension(){
        //2-D array
        int[][] array2d = new int[3][4];

        //2-D array literal
        int[][] intArray2d = {{1,2,3}, {2,3,4}, {4,5,6}, {7,8,9}, {10}};

        //method 1
        for (int i=0; i<5; i++){
            System.out.println(java.util.Arrays.toString(intArray2d[i]));
        }

        //method 2
        for (int i=0; i<5; i++){
            System.out.print("[");
            for (int j=0; j<intArray2d[i].length; j++){
                System.out.print(intArray2d[i][j]+" ");
            }
            System.out.println("]");
            System.out.println();
        }
    }

    static void array_forEachLoop(){
        int[][] intArrays = {{1,2,4},{5,6,7},{8,9,10}};
        for (int[] num: intArrays){
            System.out.println(java.util.Arrays.toString(num));
        }

//        or
        int[] intArray = {1,2,4,5,6,7,8,9,10};
        for (int num: intArray){
            System.out.println(num);
        }
    }

    static void whileLoop(){
        int[] intArray = {1,2,4,5,6,7,8,9,10};
        int i=0;
        while (i<intArray.length){
            System.out.print(intArray[i]+" ");
            i++;
        }
    }

    static void sumOf_elements(){
        int[] arr = {1,5,3};
        int sum=0;
        for (int vals: arr){
            sum+=vals;
        }
        System.out.println(sum);
    }

    static int maxValueInArray(int[] array){
        int[] arr = {1,5,3};
        int max=0;
        for (int maxi: array){
            if (max<=maxi){
                max=maxi;
            }
        }
        return max;
    }

    static int basic_search(){
//        search x=5
        int[] arr ={1,5,3};
        int x=5;
        int index=-1;
        for (int i=0; i<arr.length; i++){
            if (x==arr[i]){
                index=i;
                break;
            }
        }
        return index;
    }

    static void number_of_occurrences(){
        int[] arr= {1,3,4,5,8,4,9,2,3,4,3,4};
        int[] array= {1,2,2,2,2,3,4,5};

        int x=2;
        int occurrence=0;
        for (int num: array){
            if (x==num){
                occurrence++;
            }
        }
        System.out.println(occurrence);
    }

    static int lastOccurence(int x){
        int[] arr= {1,3,4,5,8,4,9,2,3,4,3,4};
        int index=-1;
        for (int i=0; i<arr.length; i++){
            if (x==arr[i]){
                index = i;
            }
        }
        return index;
    }

    static int total_elements_greaterThanX(int x){
        int[] arr= {1,3,4,5,8,4,9,2,3,4,3,4};
        int elementsGreater=0;
        for (int num: arr){
            if (x<num){
                elementsGreater++;
            }
        }
        return elementsGreater;
    }

    static boolean ifSorted(){
        int[] arr= {1,3,4,5,8,4,9,2,3,4,3,4};
        boolean isSorted= true;
        for (int i = 0; i<arr.length-1; i++){
            isSorted= arr[i] > arr[i + 1];
        }
        return isSorted;
    }

    public static void main(String[] args) {
//        array();
//        whileLoop();
//        sumOf_elements();
//        maxValueInArray();

//        int ans = basic_search();
//        System.out.println(basic_search());

//        number_of_occurrences();

//        int index_of = lastOccurence(3);
//        System.out.println(index_of);

//        int numberOf= total_elements_greaterThanX(3);
//        System.out.println(numberOf);

        boolean ifSorted = ifSorted();
        System.out.println(ifSorted);
    }
}