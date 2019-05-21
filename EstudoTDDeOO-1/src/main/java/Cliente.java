public class Cliente implements Conta {
    private String nome;
    private String preferencia;
    private Double valorDoPedido;

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
        TabelaDePreferencias tabela = new TabelaDePreferencias();
        return getValorDoPedidoEPreferencia(getPreferencia(), tabela.getValorDaPreferencia(getPreferencia()));
    }

    private double getValorDoPedidoEPreferencia(String tipoDaPreferencia, double valor) {
        if (getPreferencia() == tipoDaPreferencia)
            return getValorDoPedido() + valor;
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

