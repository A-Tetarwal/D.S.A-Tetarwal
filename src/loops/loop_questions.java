package loops;

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

    static void nFactorial(){
        System.out.println("enter n, get factorial");
        int n = sc.nextInt();

        int factorial=1;
        for(int i=n; i>=1; i--){
            factorial= factorial*i;
        }
        System.out.println(factorial);
    }

    static void factorials_of_n(){
        System.out.println("enter n, get factorials for each till n");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            int factorial=1;
            for(int j=i; j>=1; j--){
                factorial= factorial*j;
            }
            System.out.println(factorial);
        }

        System.out.println("or, by method 2");

        int factorial = 1;
        for(int i=1; i<=n; i++){
            factorial=factorial*i;
            System.out.println(factorial);
        }
    }

    static void a_raisedToThePower_b(){
        System.out.println("enter a: ");
        int a = sc.nextInt();
        System.out.println("enter b: ");
        int b = sc.nextInt();

/*
        int poweredValue = 1;
        while(b==1){
            poweredValue = poweredValue*a;
            b--;
        }
        System.out.println(poweredValue);
*/
        int poweredValue=1;
        for (int i= 1; i<=b; i++){
            poweredValue*=a;
        }
        System.out.println("a^b: "+ poweredValue);
    }

    public static void main(String[] args) {
//        number_of_digits();
//        sum_of_digits();
//        reversing_digits();
//        sum_of_series();
//        nFactorial();
//        factorials_of_n();
        a_raisedToThePower_b();
    }
}
