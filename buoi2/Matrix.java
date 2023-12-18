import java.util.Scanner;

class Matrix {
    private int row;
    private int col;
    private int[][] data;

    public Matrix() {
        this.row = 0;
        this.col = 0;
        this.data = new int[0][0];
    }

    public Matrix(int row, int col) {
        this.row = row;
        this.col = col;
        this.data = new int[row][col];
    }

    public void input() {
        Scanner obj = new Scanner(System.in);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Nhap phan tu [" + i + "][" + j + "]: ");
                this.data[i][j] = obj.nextInt();
            }
        }
    }

    public void input(int [][] data) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                this.data[i][j] = data[i][j];
            }
        }
    }

    public void output() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int[][] add(int [][] otherMatrix) {
        int [][] result = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[i][j] = otherMatrix[i][j] + this.data[i][j];
            }
        }
        return result;
    }

    public int[][] subtract(int [][] otherMatrix) {
        int [][] result = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[i][j] = otherMatrix[i][j] - this.data[i][j];
            }
        }
        return result;
    }

    public int[][] multiply(int [][] otherMatrix, int otherCol) {
        int [][] result = new int[row][otherCol];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                for (int k = 0; k < col; k++) {
                    result[i][j] += otherMatrix[i][k] * this.data[k][j];
                }
            }
        }
        return result;
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public int[][] getData() {
        return this.data;
    }
}

class bai3 {
    public static void main(String[] args) {
        Matrix matrixA = new Matrix(3, 3);
        Matrix matrixB = new Matrix(3, 3);
        Matrix matrixC = new Matrix(3, 3);

        System.out.println("nhap ma tran A");
        matrixA.input();
        System.out.println("nhap ma tran B");
        matrixB.input();

        System.out.println("cong ma tran: ");
        int [][] result = matrixA.add(matrixB.getData());
        matrixC.input(result);
        matrixC.output();

        System.out.println("tru ma tran: ");
        result = matrixA.subtract(matrixB.getData());
        matrixC.input(result);
        matrixC.output();

        System.out.println("nhan ma tran: ");
        result = matrixA.multiply(matrixB.getData(), matrixB.getCol());
        matrixC.input(result);
        matrixC.output();
    }
}