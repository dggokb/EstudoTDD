import java.util.List;

public class CalculoComOsSomatorioDosSalariosDosFuncionarios {

    public double somatorioDeTodosOsSalarios(List<Funcionario> funcionario) {
        double valorTotalDosSalarios = 0;
        for (Funcionario f : funcionario)
            valorTotalDosSalarios += f.salarioDoFuncionario(f.profissaoDoFuncionario());

        return valorTotalDosSalarios;
    }
}
