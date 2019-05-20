public class Cheff extends Funcionario {
    String linhaDeCozinha;

    public Cheff(String nome, Double salario, String linhaDeCozinha) {
        super(nome, salario);
        this.linhaDeCozinha = linhaDeCozinha;
    }

    public Cheff(String nome, Double salario) {
        super(nome, salario);
    }

    public String getLinhaDeCozinha() {
        return linhaDeCozinha;
    }

    @Override
    public Double getSalario() {
        if (getLinhaDeCozinha() == "Vegetariano")
            salario = salario + 100.00;
        if (getLinhaDeCozinha() == "Oriental")
            salario = salario + 150.00;
        if (getLinhaDeCozinha() == "Francesa")
            salario = salario + 250.00;
        return salario;
    }
}
