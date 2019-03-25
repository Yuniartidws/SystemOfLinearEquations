public class JordanGaussMethod  {
    Matrix matrix;
    private double[] roots;
    Matrix helpMatrix;

    JordanGaussMethod() {
        this.matrix = new Matrix();
        this.helpMatrix = new Matrix();
        roots = new double[matrix.getNumRows()];
    }

//    void columnReplacement( int numRow){
//        for(int i=0;i<helpMatrix.getNumColumns();i++){
//            helpMatrix.setElemMatrix(numRow,i,matrix.getElemMatrix(numRow+1,i+1));
//        }
//    }

    void method() {
        double s = 0;
        for (int k = 0; k < matrix.getNumRows(); k++) {
            double d = matrix.getElemMatrix(k, k);
            matrix.setElemMatrix(k, k, 1);
            for (int j = k + 1; j < matrix.getNumRows(); j++) {
                matrix.setElemMatrix(k, j, (matrix.getElemMatrix(k, j) / d));
            }
            matrix.setElemMatrixRes(k, matrix.getElemMatrixRes(k) / d);
            for (int i = 0; i < matrix.getNumRows(); i++) {
                if (i != k) {
                    s = matrix.getElemMatrix(i, k);
                    matrix.setElemMatrix(i, k, 0);
                    for (int j = k + 1; j < matrix.getNumRows(); j++)
                        matrix.setElemMatrix(i, j, (matrix.getElemMatrix(i, j) - s * matrix.getElemMatrix(k, j)));
                    matrix.setElemMatrixRes(i, (matrix.getElemMatrixRes(i) - s * matrix.getElemMatrixRes(k)));
                }
            }
        }
    }

//       for (int k = 0; k < matrix.getNumRows(); k++) {
//          for (int i = 0; i < matrix.getNumRows(); i++) {
//                for (int j = 0; j < matrix.getNumColumns(); j++) {
//                    if ((i != k) && (j != k))
//                        matrix.setElemMatrix( i,j, (matrix.getElemMatrix( i,j) - matrix.getElemMatrix( i,k) * matrix.getElemMatrix( k,j) / matrix.getElemMatrix(k, k)));
//                }
//            }
//            for (int i = 0; i < matrix.getNumColumns(); i++) {
//                if (i != k){
//                    matrix.setElemMatrix( k,i, (matrix.getElemMatrix( k,i) / matrix.getElemMatrix(k, k)));
//                    for (i = 0; i < matrix.getNumRows(); i++) {
//                        if (i == k)
//                            matrix.setElemMatrix( i,k, 1);
//                        else matrix.setElemMatrix( i,k, 0);}
//                }
//
//            }
//        }
//    }

    void printResult(){
        System.out.println("Решение методом Жордана-Гаусса: "+matrix.getElemMatrixRes(0)+", "+matrix.getElemMatrixRes(1)+", "+matrix.getElemMatrixRes(2)+", "+matrix.getElemMatrixRes(3));
    }
}


