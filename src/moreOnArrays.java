public class moreOnArrays {

    static void swapUsingTemp(int a, int b){
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("a: "+a+"; b: "+b);
        System.out.println("swap done");
    }

    static void swapUsingSumDiff(){

    }

    static void reverseTheArray(int[] array){

//      using new array
        int[] nuArray;
        nuArray = new int[array.length];
        for (int i = 0; i<array.length; i++){
            nuArray[i]=array[(array.length-1)-i];
            System.out.print(nuArray[i]+" ");
        }
//        another way, traverse the given array in reverse order
        System.out.println();
        for (int i= array.length-1; i>=0; i--){
            System.out.print(array[i]+ " ");
        }
//        reversing the og array
        int j= array.length-1;
        for (int i = 0; i< array.length; i++){
            int temp=array[j];
            array[j] = array[i];
            array[i]=temp;
            j--;
            System.out.print(array[i]+" ");
        }
    }

    public static void main(String[] args) {
//        System.out.print("enter a: ");
//        int a= Java_basics.sc.nextInt();
//        System.out.print("enter b: ");
//        int b= Java_basics.sc.nextInt();
//        System.out.println();
//        swapUsingTemp(a,b);

        int[] array;
        System.out.print("enter array length: ");
        int arrayLength = Java_basics.sc.nextInt();
        array = new int[arrayLength];
        System.out.println("enter array");
        for (int i = 0; i<arrayLength; i++){
            array[i] = Java_basics.sc.nextInt();
        }

        reverseTheArray(array);
    }
}
