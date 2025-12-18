package intermediate.arrays.twoDimensionalMatrices;

public class AddMatrices {
    public static int[][] addMatrices(int A[][], int B[][]) {
        int n = A.length;
        int m = A[0].length;
        int matrixSum[][] = new int[n][m];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                matrixSum[i][j] = A[i][j] + B[i][j];
            }
        }
        return matrixSum;
    }
}
