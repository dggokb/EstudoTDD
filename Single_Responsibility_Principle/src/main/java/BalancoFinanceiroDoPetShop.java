import java.util.List;

public class BalancoFinanceiroDoPetShop {
    private List<Funcionario> funcionario;
    private TipoDeProfissaoDoFuncionario tipoDeProfissaoDoFuncionario;
    private AnimalASerAtendido animalASerAtendido;

    public BalancoFinanceiroDoPetShop(List<Funcionario> funcionario,
                                      AnimalASerAtendido animalASerAtendido) {
        this.funcionario = funcionario;
        this.animalASerAtendido = animalASerAtendido;
    }

    public double totalDeSalariosPagosPeloPetShopAosFuncionarios() {
        CalculoComOsSomatorioDosSalariosDosFuncionarios calculoComOsSomatorioDosSalariosDosFuncionarios = new CalculoComOsSomatorioDosSalariosDosFuncionarios();
        return calculoComOsSomatorioDosSalariosDosFuncionarios.somatorioDeTodosOsSalarios(funcionario);
    }

    private double totalAReceberPelosAnimaisAtendidos() {
        return 0;
    }

    public double totalFinanceiroDoPetShop() {
        return totalDeSalariosPagosPeloPetShopAosFuncionarios() - totalAReceberPelosAnimaisAtendidos();
    }
}
