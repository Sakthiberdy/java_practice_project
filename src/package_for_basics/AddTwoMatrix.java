package package_for_basics;

public class AddTwoMatrix {

    public static void main(String[] args){
        int rows = 2, columns = 4;
        // Declaring the two matrices as multi-dimensional arrays
        int[][] matrixA = {{1,2,3,4},{1,1,1,1}};
        int[][] matrixB = {{1,1,1,1},{1,2,3,4}};

        /* Declaring a matrix sum, that will be the sum of MatrixA
         * and MatrixB, the sum matrix will have the same rows and
         * columns as the given matrices.
         */
        int[][] sum = new int[rows][columns];
        for (int i=0; i<rows; i++){
            for (int j=0; j<columns; j++){
                sum[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        // Displaying the sum matrix
        System.out.println("Sum of the matrices is: ");
        for (int i=0; i<rows; i++){
            for (int j=0; j<columns; j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }

}
