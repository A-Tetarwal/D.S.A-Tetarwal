package loops;

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

    static void numericalRectangleLooping(){
        for(int i = 1; i<=7; i++){
            for (int j=0; j<8-i; j++){
                System.out.print(i+j);
            }
            for (int k=0; k<i-1; k++){
                System.out.print(k+1);
            }
            System.out.println();
        }

        System.out.println("or");
        System.out.println("enter a number, get a pattern");
        int r = sc.nextInt();
        for (int i = 1; i<=r; i++){
            for (int j=i; j<=r; j++){
                System.out.print(j);
            }
            for (int k=1; k<=i-1; k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }

    static void numericalRectangleIncreasingRepetitive(){
        System.out.println("enter a number, get a pattern");
        int r = sc.nextInt();

        for (int i = 1; i<=4; i++){
            for (int j = 1; j<=r; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void oneTwo_onRepeat_rectangle(){
        System.out.print("enter number of rows: ");
        int r = sc.nextInt();
        System.out.print("enter number of columns: ");
        int c = sc.nextInt();

        for (int i = 1; i<=r; i++){
            if (i%2!=0){
                for (int j =1; j<=c; j++){
                    if (j%2!=0){
                        System.out.print(1);
                    }else System.out.print(2);
                }
            }else {
                for (int j = 1; j<=c; j++){
                    if (j%2!=0){
                        System.out.print(2);
                    }
                    else System.out.print(1);
                }
            }
            System.out.println();
        }

        System.out.println("or");
        for (int i = 1; i<=r; i++){
            for (int j =1; j<=c; j++){
                if ((i+j)%2==0){
                    System.out.print(1);
                }else System.out.print(2);
            }
            System.out.println();
        }
    }

    static void numericalTriangle(){
        System.out.print("enter r: ");
        int r = sc.nextInt();
        for (int i = 1; i<=r; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void numericalPyramid(){
        System.out.print("enter r: ");
        int r = sc.nextInt();

        for (int i=1; i<=r; i++){
            for (int j= 1; j<=r-i; j++){
                System.out.print(" ");
            }
            for (int k= 1; k<=i; k++){
                System.out.print(k);
            }
//            for (int l=1; l<i; l++){
//                System.out.print(i-l);
//            }
            for (int l=i-1; l>=1; l--){
                System.out.print(l);
            }
            System.out.println();
        }
    }

    static void hollowNumPyramid(){
        System.out.print("enter r: ");
        int r = sc.nextInt();

        for (int i = 1; i<=r; i++){
            for (int j=1; j<=r-i; j++){
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++){
                if (i!=1 && i!=r){
                    if (k==1){
                        System.out.print(i);
                    }
                    else System.out.print(" ");
                }
                else System.out.print(i);
            }
            for (int l=2; l<=i; l++){
                if (i!=r){
                    if (l==i){
                        System.out.print(i);
                    }
                    else System.out.print(" ");
                }
                else System.out.print(i);
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
//        pyramidWithUserInput();
//        numericalRectangleLooping();
//        numericalRectangleIncreasingRepetitive();
//        oneTwo_onRepeat_rectangle();
//        numericalTriangle();
//        numericalPyramid();
        hollowNumPyramid();
    }
}
