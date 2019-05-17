import java.util.List;

public class Restaurante {

    List<Cheff> cheff;
    List<Garcon> garcon;
    List<Cliente> cliente;
    Double valorEmCaixa;
    Double faturamento;

    public Restaurante(List<Cheff> cheff, List<Garcon> garcon, List<Cliente> cliente, Double valorEmCaixa) {
        this.cheff = cheff;
        this.garcon = garcon;
        this.cliente = cliente;
        this.valorEmCaixa = valorEmCaixa;
        this.faturamento = faturamento;
    }

    public static Restaurante criar(List<Cheff> cheff, List<Garcon> garcon, List<Cliente> cliente, Double valorEmCaixa) {
        return new Restaurante(cheff, garcon, cliente, valorEmCaixa);
    }

    public static Cheff contratar(String nome, Double salario, String linhaDeCozinha) {
        return new Cheff(nome, salario, linhaDeCozinha);
    }

    public static Cheff contratar(String nome, Double salario) {
        return new Cheff(nome, salario);
    }

    private Double getReceitaTotalDoCliente(List<Cliente> cliente) {
        double receita = 0;
        for (Cliente c : cliente) {
            receita += c.getValorDaConta();
        }
        return receita;
    }

    private Double getSomatorioDosSalarios(List<Garcon> garcon, List<Cheff> cheff) {
        double salario = 0;
        for (Garcon g : garcon) {
            salario += g.getSalario();
        }
        for (Cheff c: cheff){
            salario += c.getSalario();
        }
        return salario;
    }

    public Double getFaturamento() {
        faturamento = getValorEmCaixa() + getReceitaTotalDoCliente(cliente) - getSomatorioDosSalarios(garcon, cheff);
        return faturamento;
    }

    public List<Cheff> getCheff() {
        return cheff;
    }

    public List<Garcon> getGarcon() {
        return garcon;
    }

    public List<Cliente> getCliente() {
        return cliente;
    }

    public Double getValorEmCaixa() {
        return valorEmCaixa;
    }
}
