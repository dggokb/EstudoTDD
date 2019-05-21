public class CheffBuilder {
    String nome;
    Double salario;
    String linhaDeCozinha;

    public CheffBuilder() {
        this.nome = "Joao";
        this.salario = 2000.00;
        this.linhaDeCozinha = "Vegetariano";
    }

    public CheffBuilder comNome(String nome){
        this.nome = nome;
        return this;
    }

    public CheffBuilder comSalario (Double salario){
        this.salario = salario;
        return this;
    }

    public CheffBuilder comLinhaDeCozinha (String nome){
        this.linhaDeCozinha = linhaDeCozinha;
        return this;
    }

    public Cheff criar() {
        return Cheff.criar(nome, salario);
    }

    public Cheff criarComLinhaDeCozinha(){
        return Cheff.criar(nome, salario, linhaDeCozinha);
    }
}
