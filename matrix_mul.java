public class matrix_mul {
    public static void main(String s[]){
        int A[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int B[][] = {{1,0,0},{0,1,0},{0,0,1}};
        int C[][] = new int[3][3];

        int i,j;

        //Code for Matrix Multiplication
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                C[i][j] = 0;
                for(int k=0;k<3;k++){
                    C[i][j] += (A[i][k]*B[k][j]);
                }
            }
        }

        //Printing Resultant Matrix
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }

    }
}
