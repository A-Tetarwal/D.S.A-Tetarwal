package Arrays;

import Basics.Java_basics;

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
    }

    static void reverseArraySelf(int[] array){
//        reversing the og array
        System.out.println();
        int j= array.length-1;
        for (int i = 0; i<j; i++, j--){
            int temp=array[j];
            array[j] = array[i];
            array[i]=temp;
        }
        // printing above array
        for (int arrVal: array){
            System.out.print(arrVal+" ");
        }
    }

    static void rotateArray(int[] array){
        System.out.println("enter times rotation");
        int timesRotation = Java_basics.sc.nextInt()% array.length;

        int j=0;
        for (int i = 0; i< array.length; i++){
            if (i!= array.length-1) {
//                array[i + timesRotation] = array[i];
                j=i+timesRotation;
//                System.out.print(array[j]);
            }else {
                j= i+timesRotation-1;
//                System.out.print(array[j]);
            }
            System.out.print(array[j]);
        }
    }

    static void rotateArraySelf(int[] array ,int timesRotation){
        timesRotation%= array.length;
        int j= array.length-1;
        for (int i= array.length-timesRotation; i< j; i++, j--){
            int temp=array[j];
            array[j] = array[i];
            array[i]=temp;
        }

        j=array.length-timesRotation-1;
        for (int i=0; i< j; i++, j--){
            int temp=array[j];
            array[j] = array[i];
            array[i]=temp;
        }

        reverseArraySelf(array);
    }

    static void queryBruteForce(int[] values, int[] array){
        boolean isPresent = false;
        for (int i = 0; i < values.length ; i++) {
            for (int j = 0; j < array.length ; j++) {
                if (values[i] == array[j]) {
                    isPresent= true;
                    System.out.println("Yes for index["+j+"], "+values[i]+" is present in given array");
                }
            }
            if (!isPresent){
                System.out.print(values[i]+ ": no, ");
            }
        }
    }

    public static void main(String[] args) {
//        System.out.print("enter a: ");
//        int a= Basics.Java_basics.sc.nextInt();
//        System.out.print("enter b: ");
//        int b= Basics.Java_basics.sc.nextInt();
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

//        System.out.println("enter times rotation");
//        int timesRotation = Basics.Java_basics.sc.nextInt();

//        reverseTheArray(array);
//        rotateArraySelf(array, timesRotation);
        queryBruteForce(new int[]{1, 2, 3, 4}, array);
    }
}
