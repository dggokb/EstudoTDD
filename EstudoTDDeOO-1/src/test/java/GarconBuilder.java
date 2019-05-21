public class GarconBuilder {
    private String nome;
    private Double salario;

    public GarconBuilder() {
        this.nome = "Antonio";
        this.salario = 500.00;
    }

    public GarconBuilder comNome(String nome) {
        this.nome = nome;
        return this;
    }

    public GarconBuilder comSalario(Double salario) {
        this.salario = salario;
        return this;
    }

    public Garcon criar() {
        return Garcon.criar(nome, salario);
    }
}
