public class Cheff extends Funcionario {
    private String linhaDeCozinha;

    public Cheff(String nome, Double salario, String linhaDeCozinha) {
        super(nome, salario);
        this.linhaDeCozinha = linhaDeCozinha;
    }

    public Cheff(String nome, Double salario) {
        super(nome, salario);
    }

    public static Cheff criar(String nome, Double salario) {
        return new Cheff(nome, salario);
    }

    public static Cheff criar(String nome, Double salario, String linhaDeCozinha) {
        return new Cheff(nome, salario, linhaDeCozinha);
    }

    public String getLinhaDeCozinha() {
        return linhaDeCozinha;
    }

    @Override
    public Double getSalario() {
        TabelaDePreferencias tabela = new TabelaDePreferencias();
        getPreferencia(getLinhaDeCozinha(), tabela.getValorDaPreferencia(getLinhaDeCozinha()));
        return salario;
    }

    private void getPreferencia(String linhaDeCozinha, double v) {
        if (getLinhaDeCozinha() == linhaDeCozinha)
            salario = salario + v;
    }
}
