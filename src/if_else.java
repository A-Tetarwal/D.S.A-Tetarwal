import java.util.Scanner;

public class if_else {
    static Scanner sc = new Scanner(System.in);
    static int i=sc.nextInt();
    static String ans;
    static void ternary(){
        //ternary operator
        ans= (i % 2 == 0) ? "even" : "odd";
        System.out.println(ans);
    }
    static void question(){
        ans= (i % 2 == 0 && i%3==0) ? "even and divisible by 3" : "conditions not met";
        System.out.println(ans);
    }
    public static void main(String[] args) {
        question();
    }
}
