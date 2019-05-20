import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GarconTest {

    @Test
    public void deveConseguirTerUmSalario() {
        String nomeDoGarcon = "Alfredo";
        Double salarioDoGarcon = 1000.00;
        Double salarioASerRecebido = 1000.00;
        Funcionario garcon = new Garcon(nomeDoGarcon, salarioDoGarcon);

        Double salario = garcon.getSalario();

        Assertions.assertEquals(salarioASerRecebido, salario);
    }
}