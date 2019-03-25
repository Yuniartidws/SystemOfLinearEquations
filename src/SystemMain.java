public class SystemMain {

    public static void main(String[] args) {
        KramerMethod k = new KramerMethod();
        k.method();
        k.printResult();
        JordanGaussMethod j= new JordanGaussMethod();
        j.method();
        j.printResult();
    }
}
