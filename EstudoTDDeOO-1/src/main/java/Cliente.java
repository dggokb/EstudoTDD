public class Cliente {
    String nome;
    String preferencia;
    Double valorDaConta;

    public Cliente(String nome, Double valorDaConta, String preferencia) {
        this.nome = nome;
        this.valorDaConta = valorDaConta;

        this.preferencia = preferencia;
    }

    public Cliente(String nome, Double valorDaConta) {
        this.nome = nome;
        this.valorDaConta = valorDaConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPreferencia() {
        return preferencia;
    }

    public void setPreferencia(String preferencia) {
        this.preferencia = preferencia;
    }

    public Double getValorDaConta() {
        if (getPreferencia() == "Vegetariano")
            valorDaConta = valorDaConta + 150.00;

        return valorDaConta;
    }
}

