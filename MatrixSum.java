import java.util.Scanner;

class MatrixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int rows, cols;
        System.out.print("Enter number of rows: ");
        rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        cols = sc.nextInt();

        int[][] mat1 = new int[rows][cols];
        int[][] mat2 = new int[rows][cols];
        int[][] mat3 = new int[rows][cols];
        int[][] sum = new int[rows][cols];

        // Input for Matrix 1
        System.out.println("\nEnter elements of Matrix 1:");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }

        // Input for Matrix 2
        System.out.println("\nEnter elements of Matrix 2:");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }

        // Input for Matrix 3
        System.out.println("\nEnter elements of Matrix 3:");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                mat3[i][j] = sc.nextInt();
            }
        }

        // Calculating sum
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                sum[i][j] = mat1[i][j] + mat2[i][j] + mat3[i][j];
            }
        }

        // Printing the result
        System.out.println("\nSum of the three matrices is:");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
