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
        if(getLinhaDeCozinha() == "Vegetariano")
            salario += 100;

        return salario;
    }
}
