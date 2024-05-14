import java.util.Scanner;

public class loop_printPatterns {
    static Scanner sc = new Scanner(System.in);
    static void rectangularPattern(){
        for (int i = 0; i<3; i++){
            for (int j=0; j<6;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void hollowRectangle(){
        for(int i=0; i<4; i++){
            for(int j=0; j<6; j++){
                if (i==0 ||i==3){
                    System.out.print("*");
                } else if (j==0||j==5) {
                    System.out.print("*");
                }else System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void triangle(){
        for (int i=0; i<4; i++){
            for (int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void ultaTriangle(){
        for (int i=4; i>0; i--){
            for (int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pyramid(){
        for (int i = 1; i<=4; i++){
            for (int k=1; k<=4-i; k++){
                System.out.print(" ");
            }
            for(int j=1; j<=i+(i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pyramidWithUserInput(){
        System.out.println("enter r(rows) to get pyramid");
        int r = sc.nextInt();

        for (int i=1; i<=r; i++){
            for (int j=1; j<=r-i; j++){
                System.out.print(" ");
            }
            for (int k=1; k<=i+(i-1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        rectangularPattern();
//        hollowRectangle();
//        triangle();
//        ultaTriangle();
//        pyramid();
        pyramidWithUserInput();
    }
}
