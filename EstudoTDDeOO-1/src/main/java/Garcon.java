public class Garcon extends Funcionario{
    Double extraDeHorasTrabalhas;

    public Garcon(String nome, Double salario, Double extraDeHorasTrabalhas) {
        super(nome, salario);
        this.extraDeHorasTrabalhas = extraDeHorasTrabalhas;
    }

    public Garcon(String nome, Double salario) {
        super(nome, salario);
        this.extraDeHorasTrabalhas = extraDeHorasTrabalhas;
    }

    public Double getExtraDeHorasTrabalhas() {
        return extraDeHorasTrabalhas;
    }

    public void setExtraDeHorasTrabalhas(Double extraDeHorasTrabalhas) {
        this.extraDeHorasTrabalhas = extraDeHorasTrabalhas;
    }
}
