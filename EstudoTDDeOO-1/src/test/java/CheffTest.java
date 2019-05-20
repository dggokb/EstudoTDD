import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CheffTest {
    String nomeDoCheff;
    Double salarioDoCheff;

    @BeforeEach
    void setUp() {
        nomeDoCheff = "Joao";
        salarioDoCheff = 2000.00;
    }

    @Test
    void deveConseguirTerUmSalarioTendoUmaLinhaDeCozinha() {
        String linhaDeCozinhaDoCheff = "Vegetariano";
        Double salarioDoCheffASerRecebido = 2100.00;
        Cheff cheff = new Cheff(nomeDoCheff, salarioDoCheff, linhaDeCozinhaDoCheff);

        Double salario = cheff.getSalario();

        Assertions.assertEquals(salario, salarioDoCheffASerRecebido);
    }

    @Test
    void deveConseguirTerUmSalarioNaoTendoUmaLinhaDeCozinha() {
        Double salarioDoCheffASerRecebido = 2000.00;
        Cheff cheff = new Cheff(nomeDoCheff, salarioDoCheff);

        Double salario = cheff.getSalario();

        Assertions.assertEquals(salario, salarioDoCheffASerRecebido);
    }
}
