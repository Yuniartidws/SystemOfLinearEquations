public class KramerMethod extends  Method {



    double countDeterm(Matrix matrix){
        double determMain=1, determSub=1;
        int num=matrix.getNumRows();
        for (int index=0; index<num;index++){
            determMain*=matrix.getElemMatrix(index,index);
        }
        for (int index=0; index<num;index++){
            determSub*=matrix.getElemMatrix(index,num-1-index);
        }
        return determMain-determSub;
    }

    void columnReplacement( int numColumn){
        for(int i=0;i<helpMatrix.getNumRows();i++){
            helpMatrix.setElemMatrix(i,numColumn,matrix.getElemMatrixRes(i));
        }
    }

    void columnReturnPlace(int numColumn){
        for(int i=0;i<helpMatrix.getNumRows();i++){
            helpMatrix.setElemMatrix(i,numColumn,matrix.getElemMatrix( i,numColumn));
        }
    }

    void method(){
        double mainDeterm=countDeterm(matrix);
        for (int i=0;i<matrix.getNumRows();i++){
            columnReplacement(i);
            roots[i]=countDeterm(helpMatrix)/mainDeterm;
            columnReturnPlace(i);
        }
    }

    void printResult(){
        System.out.println("Результат методом Крамера: "+roots[0]+", "+roots[1]+", "+roots[2]+", "+roots[3]);
    }
}
