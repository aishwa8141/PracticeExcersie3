import java.util.Scanner;

public class MatrixAddition {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" Input number of rows of matrix");
        int row=input.nextInt();
        System.out.println(" Input number of columns of matrix");
        int col=input.nextInt();
        System.out.println("Input elements of first matrix");
         int[][] matA = new int[row][col];
         for(int i=0;i<row;i++){
             for (int j=0;j<col;j++){
                 matA[i][j]=input.nextInt();
             }
         }
        System.out.println("Input elements of Second matrix");
        int[][] matB = new int[row][col];
        for(int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                matB[i][j]=input.nextInt();
            }
        }

        int[][] sum;
        sum=add(matA,matB,row,col);

        System.out.println("Sum of the matrices:-");
        for (int i=0;i<row;i++) {
            System.out.println();
            for (int j = 0; j < col; j++) {
                System.out.print(sum[i][j]+"\t");

            }
        }



    }

    public static int[][] add(int[][] a,int[][] b,int r,int c){

        int[][] sum=new int[r][c];
        for(int i=0;i<r;i++)
            for (int j=0;j<c;j++){
                sum[i][j]=a[i][j]+b[i][j];

            }
            return sum;
    }



}
