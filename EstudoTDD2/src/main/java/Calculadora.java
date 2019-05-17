public class Calculadora {

    private int a;
    private int b;

    public Calculadora(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getSoma(int a, int b) {
        return a+b;
    }

    public int getSubtracao(int a, int b) {
        return a-b;
    }

    public int getDivisao(int a, int b) {
        return a/b;
    }

    public int getMultiplicacao(int a, int b) {

        return a*b;
    }
}
