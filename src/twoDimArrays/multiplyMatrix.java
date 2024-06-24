package twoDimArrays;

public class multiplyMatrix {
    static int[][] matrixMulti(int[][] nums1, int r1, int c1, int[][] nums2, int r2, int c2){
        int[][] product = new int[r1][c2];

        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c2; j++){
                product[i][j] = nums1[i][j];
            }
        }
        return product;
    }
}
