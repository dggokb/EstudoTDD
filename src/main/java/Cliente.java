import java.util.List;

public class Cliente implements Conta{
    String nome;
    String preferencia;
    Double valorDoPedido;

    public Cliente(String nome, Double valorDoPedido, String preferencia) {
        this.nome = nome;
        this.valorDoPedido = valorDoPedido;
        this.preferencia = preferencia;
    }

    public Cliente(String nome, Double valorDoPedido) {
        this.nome = nome;
        this.valorDoPedido = valorDoPedido;
    }

    public static Cliente criar(String nomeDoCliente, Double valorDaConta, String preferenciaDoCliente) {
        return new Cliente(nomeDoCliente, valorDaConta, preferenciaDoCliente);
    }

    public static Cliente criar(String nomeDoCliente, Double valorDaConta  ) {
        return new Cliente(nomeDoCliente, valorDaConta);
    }

    public Double getValorDaConta() {
        double conta = 0.00;
        if (getPreferencia() == "Vegetariano")
            conta = getValorDoPedido() + 100.00;
        if (getPreferencia() == "Oriental")
            conta = getValorDoPedido() + 150.00;
        if (getPreferencia() == "Francesa")
            conta = getValorDoPedido() + 250.00;

        return conta;
    }

    public Double getValorDoPedido() {
        return valorDoPedido;
    }

    public String getPreferencia() {
        return preferencia;
    }

    public String getNome() {
        return nome;
    }
}

