public abstract class Method {
    Matrix matrix;
    double[] roots;
    Matrix helpMatrix;

    Method(){
        this.matrix=new Matrix();
        this.helpMatrix=new Matrix();
        roots=new double[matrix.getNumRows()];
    }
    abstract void method();
    abstract void printResult();
}
