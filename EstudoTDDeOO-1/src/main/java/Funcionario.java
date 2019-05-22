public abstract class Funcionario implements SalarioDoFuncionario {
    private String nome;

    protected Double salario;

    public Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }
}
