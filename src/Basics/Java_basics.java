package Basics;

import java.util.Scanner;

public class Java_basics {

    public static Scanner sc= new Scanner(System.in);

    static void inputTaking(){
        System.out.println("enter something");
        int b= sc.nextInt();
    }

    static void swapNumUsingTemp(){
        System.out.println("enter a: ");
        int a= sc.nextInt();
        System.out.println("enter b: ");
        int b= sc.nextInt();

        int temp = a;
        a=b;
        b=temp;
        System.out.println("swapped numbers: \n a = "+a+", b = "+b);
    }

    public static void main(String[] args) {
        /* default/boilerplate code -->done */
        System.out.println("hello");

//        variables and data types
        /*
        whole numbers - byte, short, int, long
        floating numbers = float, double
        char, boo;ean, Strong (Non-primitive)
        */
        int a = 5, b = 7;
        System.out.println(a + b);
        System.out.println(3 + 5);

        System.out.println("sum is: " + a + b); // no answer, just string
        System.out.println("sum is: " + (a + b)); // this will give answer

        int sum = a + b;
        System.out.println("sum is: " + sum);

        /*
        1. Case Sensitivity:
            - PascalCase: Used for class names and interface names. Example: `MyClass`, `MyInterface`.
            - camelCase: Used for **variable names and method names. Example: `myVariable`, `myMethod`.

        2. Game of Brackets:
            - Parentheses `()` are used for methods.
            - Curly Brackets `{}` define scope or body of a class, method, or loop.
            - Square Brackets `[]` are used for arrays.
            - Angular Brackets `<>` are used for generics. //in java mainly

        Remember these conventions when writing code! They help maintain consistency and readability. 😊

        */

//        inputTaking();
//        swapNumUsingTemp();

        /*
        ---------operators---------

        Arithmetic operators
        Assignment operators
        Comparison operators
        Logical operators
        Bitwise operators
        ---------------------------
        --i -> change and use
        i-- -> use then change
        */
    }
    /* check1 -->done */
}
