package loops;

class conversions {
    void binToDec() {
        int bin = loop_printPatterns.sc.nextInt();
        int num = 0;
        int poweredValue = 1;
        while (bin > 0) {
            int unit_digit = bin%10;
            num+= unit_digit*poweredValue;
            bin/=10;
            poweredValue*=2;
        }
        System.out.println(num);
    }
    void decToBin() {
        int n = loop_printPatterns.sc.nextInt();
        int binary=0;
        int powered10=1;
        while(n>0){
            int parity= n%2;
            binary = binary+(parity*powered10);
            powered10*=10;
            n=n/2;
        }
        System.out.println(binary);
//        while(n>=1){
//            int p= n%2;
//            System.out.print(p);
//            n=n/2;
//        }
//        System.out.println();

    }
}

public class bitwiseOperators {
    public static void main(String[] args) {
        conversions one = new conversions();
//        one.binToDec();
        one.decToBin();
        System.out.println("bitwise OR: " + (9 | 10));
        System.out.println("bitwise AND: " + (9 & 10));

        System.out.println("bitwise XOR: " + (9 ^ 10));
        System.out.println("complement: " + (~9));

        System.out.println("left shift: " + (9 << 1));
        System.out.println("right shift: " + (9 >> 1));
    }
}
