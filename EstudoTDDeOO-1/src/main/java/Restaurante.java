import java.util.List;

public class Restaurante {
    private List<Funcionario> cheff;
    private List<Funcionario> garcon;
    private List<Cliente> cliente;
    private Double valorEmCaixa;

    public Restaurante(List<Funcionario> cheff, List<Funcionario> garcon, List<Cliente> cliente, Double valorEmCaixa) {
        this.cheff = cheff;
        this.garcon = garcon;
        this.cliente = cliente;
        this.valorEmCaixa = valorEmCaixa;
    }

    public static Restaurante criar(List<Funcionario> cheff, List<Funcionario> garcon, List<Cliente> cliente, Double valorEmCaixa) {
        return new Restaurante(cheff, garcon, cliente, valorEmCaixa);
    }

    public boolean contratarUmCheff(String nome, Double salario, String linhaDeCozinha) {
        return cheff.add(new Cheff(nome, salario, linhaDeCozinha));
    }

    public boolean contratarUmCheff(String nome, Double salario) {
        return cheff.add(new Cheff(nome, salario));
    }

    public boolean contratarUmGarcon(String nomeDoGarconAContratar, Double salarioDoGarconAContratar) {
        return garcon.add(new Garcon(nomeDoGarconAContratar, salarioDoGarconAContratar));
    }

    public boolean receberUmCliente(List<Cliente> cliente, String nomeDoNovoCliente, Double valorDoPedido) {
        return cliente.add(Cliente.criar(nomeDoNovoCliente, valorDoPedido));
    }

    private Double getReceitaTotalDoCliente(List<Cliente> cliente) {
        double receita = 0;
        for (Cliente c : cliente) {
            receita += c.getValorDaConta();
        }
        return receita;
    }

    private Double getSomatorioDosSalarios(List<Funcionario> garcon, List<Funcionario> cheff) {
        double salario = 0;
        salario = somaDosSalariosDeUmDeterminadoFuncionario(cheff, salario);
        salario = somaDosSalariosDeUmDeterminadoFuncionario(garcon, salario);

        return salario;
    }

    private double somaDosSalariosDeUmDeterminadoFuncionario(List<Funcionario> funcionario, double salario) {
        for (Funcionario c : funcionario) {
            salario += c.getSalario();
        }
        return salario;
    }

    public Double getFaturamento() {
        return getValorEmCaixa() + getReceitaTotalDoCliente(cliente) - getSomatorioDosSalarios(garcon, cheff);
    }

    public List<Funcionario> getCheff() {
        return cheff;
    }

    public List<Funcionario> getGarcon() {
        return garcon;
    }

    public List<Cliente> getCliente() {
        return cliente;
    }

    public Double getValorEmCaixa() {
        return valorEmCaixa;
    }
}
