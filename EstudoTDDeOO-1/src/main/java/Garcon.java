public class Garcon extends Funcionario {

    public Garcon(String nome, Double salario) {
        super(nome, salario);
    }

    public static Garcon criar(String nome, Double salario) {
        return new Garcon(nome, salario);
    }

    public Double getSalario() {
        return salario;
    }
}
