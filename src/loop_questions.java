import java.util.Scanner;

public class loop_questions {
    static Scanner sc = new Scanner(System.in);

    static void number_of_digits(){
        System.out.println("enter a number");
        int n = sc.nextInt();
        int count = 0;
//        for(int i=1; n>0; i++){
//            n = n/10;
//            count++;
//            if (n==0){
//                System.out.println("rukja");;
//            }
//            break;
//        }

        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println("no. of digits: "+count);
    }

    static void sum_of_digits(){
        System.out.println("enter a number");
        int n= sc.nextInt();
        int nCopy = n;

        int sum=0;
        while(n>0){
            int p = n%10;
            n=n/10;
            sum+=p;
        }
        System.out.println("sum: "+sum + "\n n: "+nCopy);
    }

    static void reversing_digits(){
        System.out.println("enter a number");
        int n= sc.nextInt();

        int num = 0;
        while (n>0){
            int p = n%10;
            num = num*10+p;
            n=n/10;
        }
        System.out.println("reversed: "+num);
    }

    static void nFactorial(){
        System.out.println("enter n, get factorial");
        int n = sc.nextInt();

        int factorial=0;
        for(int i=1; i<=n; i++){
            factorial=i;
            factorial= factorial*
        }
        System.out.println(factorial);
    }

    static void sum_of_series(){
        // series: S = 1-2+3-4...n
        System.out.println("enter n for sum: S = 1-2+3-4...n");
        int n = sc.nextInt();
        int sum = 0;
        for (int i=1; i<=n; i++){
            if (i%2==0){
                sum-=i;
            }else sum+=i;
        }
        System.out.println("sum: "+ sum);
    }
    public static void main(String[] args) {
//        number_of_digits();
//        sum_of_digits();
//        reversing_digits();
//        sum_of_series();
        nFactorial();
    }
}
