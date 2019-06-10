import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class BalancoFinanceiroDoPetShopTeste {

    @Test
    public void teste() {
        List<Funcionario> funcionario = new ArrayList<Funcionario>();
        TipoDeProfissaoDoFuncionario tipoDeProfissaoDoFuncionario = TipoDeProfissaoDoFuncionario.TOSADOR;
        TipoDeProfissaoDoFuncionario tipoDeProfissaoDoFuncionario2 = TipoDeProfissaoDoFuncionario.VETERINARIO;
        Funcionario funcionarioDoTipoTosador = new Funcionario(tipoDeProfissaoDoFuncionario);
        Funcionario funcionarioDoTipoTosador2 = new Funcionario(tipoDeProfissaoDoFuncionario2);
        funcionario.add(funcionarioDoTipoTosador);
        funcionario.add(funcionarioDoTipoTosador2);
        AnimalASerAtendido animal = new AnimalASerAtendido();

        BalancoFinanceiroDoPetShop balancoFinanceiroDoPetShop = new BalancoFinanceiroDoPetShop(funcionario,animal);
        double valor = 2.000;


        Assertions.assertEquals(valor, balancoFinanceiroDoPetShop.totalDeSalariosPagosPeloPetShopAosFuncionarios());

    }
}