package Arrays;

import static Basics.Java_basics.sc;

public class presentQuery {
    static int[] makeFrequencyArray(int[] arr){
        int[] freq = new int[100005];

        for (int i = 0; i<arr.length; i++){
            freq[arr[i]]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        int[] freq = makeFrequencyArray(new int[]{1, 2, 3, 4, 5, 6});
        System.out.println("Enter number of queries");
        int q = sc.nextInt();

        while(q>0){
            System.out.println("Enter number you want to search");
            int x = sc.nextInt();

            if (freq[x] > 0){
                System.out.println("Yes");
            }
            else System.out.println("No");

            q--;
        }
    }
}
