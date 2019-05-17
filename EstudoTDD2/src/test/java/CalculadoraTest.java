import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {
    private int a = 2;
    private int b = 2;
    private Calculadora calculadora;

    @Before
    public void setUp() throws Exception {
        calculadora = new Calculadora(a, b);
    }


    @Test
    public void deveConseguirRealizarUmaSoma() {
        int soma = a + b;

        int resultado = calculadora.getSoma(a, b);

        Assert.assertEquals(resultado, soma);
    }

    @Test
    public void deveConseguirRealizarUmaSubtracao() {
        int subtracao = a - b;


        int resultado = calculadora.getSubtracao(a, b);

        Assert.assertEquals(resultado, subtracao);
    }

    @Test
    public void deveCOnseguirRealizarUmaDivisao() {
        int resultado = a / b;
        calculadora = new Calculadora(a, b);

        int divisao = calculadora.getDivisao(a, b);

        Assert.assertEquals(resultado, divisao);
    }

    @Test
    public void deveConseguirRealizarUmaMultiplicacao() {
        int multiplicacao = a*b;

        int resultado = calculadora.getMultiplicacao (a,b);

        Assert.assertEquals(resultado, multiplicacao);
    }
}
