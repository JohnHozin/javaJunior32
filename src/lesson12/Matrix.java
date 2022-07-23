package lesson12;

public class Matrix implements IMatrix{
    private double[][] matrix;

    public Matrix() {
        this.matrix = new double[DEFAULT_MATRIX_SIZE][DEFAULT_MATRIX_SIZE];
    }

    public Matrix(int rows, int columns) {
        this.matrix = new double[rows][columns];
    }

    @Override
    public int getRows() {
        return matrix.length;
    }

    @Override
    public int getColumns() {
        return matrix[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        if (rowIndex > matrix.length || rowIndex < 0) {
            System.out.println("Неверный индекс строки");
            return -1;
        }
        if (colIndex > matrix[0].length || colIndex < 0) {
            System.out.println("Неверный индекс столбца");
            return -1;
        }
        return this.matrix[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        if (rowIndex > matrix.length || rowIndex < 0) {
            System.out.println("Неверный индекс строки");
        } else if (colIndex > matrix[0].length || colIndex < 0) {
            System.out.println("Неверный индекс столбца");
        } else {
            this.matrix[rowIndex][colIndex] = value;
        }
    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getRows() != otherMatrix.getRows()) {
            throw new IllegalArgumentException("Неверное количество строк ");
        }
        if (this.getColumns() != otherMatrix.getColumns()) {
            throw new IllegalArgumentException("Неверное количество столбцов ");
        }
        Matrix resultAdd = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                resultAdd.setValueAt(i, j, this.getValueAt(i, j) + otherMatrix.getValueAt(i, j));
            }
        }
        return resultAdd;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getRows() != otherMatrix.getRows()) {
            throw new IllegalArgumentException("Неверное количество строк ");
        }
        if (this.getColumns() != otherMatrix.getColumns()) {
            throw new IllegalArgumentException("Неверное количество столбцов ");
        }
        Matrix resultSub = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                resultSub.setValueAt(i, j, this.getValueAt(i, j) - otherMatrix.getValueAt(i, j));
            }
        }
        return resultSub;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getColumns() != otherMatrix.getRows()) {
            throw new IllegalArgumentException("Матрицы нельзя перемножить ");
        }
        Matrix resultMul = new Matrix(this.getRows(), otherMatrix.getColumns());
        double mul = 0;
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < otherMatrix.getColumns(); j++) {
                for (int k = 0; k < this.getColumns(); k++) {
                    mul += this.getValueAt(i, k) * otherMatrix.getValueAt(k, j);
                }
                resultMul.setValueAt(i, j, mul);
                mul = 0;
            }
        }
        return resultMul;
    }

    @Override
    public IMatrix mul(double value) {
        Matrix resultMulNumber = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                resultMulNumber.setValueAt(i, j, this.getValueAt(i, j) * value);
            }
        }
        return resultMulNumber;
    }

    @Override
    public IMatrix transpose() {
        Matrix resultTranspose = new Matrix(this.getColumns(), this.getRows());
        for (int i = 0; i < this.getColumns(); i++) {
            for (int j = 0; j < this.getRows(); j++) {
                resultTranspose.setValueAt(i, j, this.getValueAt(j, i));
            }
        }
        return resultTranspose;
    }

    @Override
    public void fillMatrix(double value) {
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[0].length; j++) {
                this.setValueAt(i, j, value += 1);        //    заменить value+=1 на value
            }
        }
    }

    @Override
    public double determinant() {
        return det(this.matrix);
    }

    public static double det(double mat[][]){
        int n = mat.length;
        if(n==1)
            return mat[0][0];
        if(n==2)
            return mat[0][0]*mat[1][1] - (mat[0][1]*mat[1][0]);

        double[][] m11 = reduce(0,0,mat);
        double[][] m1n = reduce(0,n-1,mat);
        double[][] mn1 = reduce(n-1 , 0 , mat);
        double[][] mnn = reduce(n-1,n-1,mat);
        double[][] m11nn = reduce(0,0,reduce(n-1,n-1,mat));
        return (det(m11)*det(mnn) - det(m1n)*det(mn1))/det(m11nn);
    }

    public static double[][] reduce(int row , int column , double[][] mat){
        int n=mat.length;
        double[][] res = new double[n- 1][n- 1];
        int r=0,c=0;
        for (int i = 0; i < n; i++) {
            c=0;
            if(i==row)
                continue;
            for (int j = 0; j < n; j++) {
                if(j==column)
                    continue;
                res[r][c] = mat[i][j];

                c++;
            }
            r++;
        }
        return res;
    }

    @Override
    public boolean isNullMatrix() {
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[0].length; j++) {
                if (this.getValueAt(i, j) != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean isIdentityMatrix() {
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[0].length; j++) {
                if (this.getValueAt(i, j) == 0 && i != j || this.getValueAt(i, j) == 1 && i == j) {

                } else  {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean isSquareMatrix() {
        if (this.matrix.length == this.matrix[0].length) {
            return true;
        }
        return false;
    }

    @Override
    public void printToConsole() {
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[0].length; j++) {
                System.out.print(this.getValueAt(i, j) + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
