public class ClienteBuilder {
    private String nome;
    private Double valorDoPedido;
    private String preferencia;

    public ClienteBuilder() {
        this.nome = "Jorge";
        this.valorDoPedido = 1000.00;
        this.preferencia = "Vegetariano";
    }

    public ClienteBuilder comNome(String nome) {
        this.nome = nome;
        return this;
    }

    public ClienteBuilder comValorDoPedido(Double valorDoPedido) {
        this.valorDoPedido = valorDoPedido;
        return this;
    }

    public ClienteBuilder comPreferencia(String preferencia) {
        this.preferencia = preferencia;
        return this;
    }

    public Cliente criar() {
        return Cliente.criar(nome, valorDoPedido);
    }

    public Cliente criarComPreferencia(){
        return Cliente.criar(nome,valorDoPedido,preferencia);
    }
}
