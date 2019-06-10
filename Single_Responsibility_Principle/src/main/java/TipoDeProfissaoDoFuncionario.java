public enum TipoDeProfissaoDoFuncionario {

    TOSADOR("Tosador", 2.000),
    VETERINARIO("Funcionario", 5.000);

    private String profissao;
    private double salario;

    TipoDeProfissaoDoFuncionario(String profissao, double Salario) {

        this.profissao = profissao;
        salario = Salario;
    }

    public String tipoDeProfissao() {
        return profissao;
    }

    public double valorDoSalario() {
        return salario;
    }
}
