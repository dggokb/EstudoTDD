public class Funcionario {
    private TipoDeProfissaoDoFuncionario profissaoDoFuncionario;
    private Double salario;

    public Funcionario(TipoDeProfissaoDoFuncionario profissaoDoFuncionario) {
        this.profissaoDoFuncionario = profissaoDoFuncionario;
    }

    public TipoDeProfissaoDoFuncionario profissaoDoFuncionario() {
        return profissaoDoFuncionario;
    }

    public double salarioDoFuncionario(TipoDeProfissaoDoFuncionario profissao) {
       if (profissaoDoFuncionario().equals(profissao.tipoDeProfissao()))
            return salario = profissao.valorDoSalario();
       return 0;
    }

}
