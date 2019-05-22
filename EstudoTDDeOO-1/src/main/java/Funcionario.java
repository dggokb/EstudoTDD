public abstract class Funcionario {
    private String nome;

    protected Double salario;

    public Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    public Double getSalario() {
        return salario;
    }
}
