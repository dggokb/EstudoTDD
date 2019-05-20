import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GarconTest {

    @Test
    public void deveConseguirTerUmSalario() {
        String nomeDoGarcon = "Alfredo";
        Double salarioDoGarcon = 1000.00;
        Double salario = 1000.00;
        Funcionario garcon = new Garcon(nomeDoGarcon, salarioDoGarcon);

        Double salarioASerRecebido = garcon.getSalario();

        Assertions.assertEquals(salarioASerRecebido, salario);
    }
}