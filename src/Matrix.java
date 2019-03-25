public class Matrix {
    private int numOfColumns = 0;
    private int numOfRows = 0;
    private double[][] matrixArr;
    private double[] matrixRes;
    Matrix(){
        setNumColumns(4);
        setNumRows(4);
        matrixArr = new double[numOfColumns][numOfRows];
        matrixArr[0][0]=2;matrixArr[0][1]=0;matrixArr[0][2]=7;matrixArr[0][3]=1;
        matrixArr[1][0]=1;matrixArr[1][1]=2;matrixArr[1][2]=-1;matrixArr[1][3]=-1;
        matrixArr[2][0]=-1;matrixArr[2][1]=-2;matrixArr[2][2]=1;matrixArr[2][3]=2;
        matrixArr[3][0]=0;matrixArr[3][1]=2;matrixArr[3][2]=0;matrixArr[3][3]=1;
        matrixRes = new double[numOfRows];
        matrixRes[0]=11;
        matrixRes[1]=2;
        matrixRes[2]=0;
        matrixRes[3]=6;

    }

    Matrix(int x){
        setNumColumns(5);
        setNumRows(4);
        matrixArr = new double[numOfRows][numOfColumns];
        matrixArr[0][0]=2;matrixArr[0][1]=0;matrixArr[0][2]=7;matrixArr[0][3]=1;matrixArr[0][4]=11;
        matrixArr[1][0]=1;matrixArr[1][1]=2;matrixArr[1][2]=-1;matrixArr[1][3]=-1;matrixArr[1][4]=2;
        matrixArr[2][0]=-1;matrixArr[2][1]=-2;matrixArr[2][2]=1;matrixArr[2][3]=2;matrixArr[2][4]=0;
        matrixArr[3][0]=0;matrixArr[3][1]=2;matrixArr[3][2]=0;matrixArr[3][3]=1;matrixArr[3][4]=6;
    }

    void setNumRows(int numOfRows) {
        this.numOfRows = numOfRows;
    }
    void setNumColumns(int numOfColumns) {
        this.numOfColumns = numOfColumns;
    }
    int getNumRows() {
        return numOfRows;
    }
    int getNumColumns() {
        return numOfColumns;
    }

    double getElemMatrix( int indexOfRows,int indexOfColumns) {
        return matrixArr[indexOfRows][indexOfColumns];
    }

    void setElemMatrix(int indexOfRows,int indexOfColumns, double value) {
        matrixArr[indexOfRows][indexOfColumns] = value;
    }

    double getElemMatrixRes(int indexOfRows) {
        return matrixRes[indexOfRows];
    }

    void setElemMatrixRes(int indexOfRows, double value) {
        matrixRes[indexOfRows] = value;
    }
}
