import java.util.List;

public class Cliente implements Conta {
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

    public static Cliente criar(String nomeDoCliente, Double valorDaConta) {
        return new Cliente(nomeDoCliente, valorDaConta);
    }

    public Double getValorDaConta() {
        if (getPreferencia() == "Vegetariano")
            return getValorDoPedido() + 100.00;
        if (getPreferencia() == "Oriental")
            return getValorDoPedido() + 150.00;
        if (getPreferencia() == "Francesa")
            return getValorDoPedido() + 250.00;
        else
            return getValorDoPedido();
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

