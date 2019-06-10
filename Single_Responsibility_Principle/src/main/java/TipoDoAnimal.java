public enum TipoDoAnimal {
    CACHORRO("Cachorro", new TipoDeAtendimento()),
    GATO("Gato", new TipoDeAtendimento());


    private String tipoDoAnimal;
    private TipoDeAtendimento tipoDeAtendimento;

    TipoDoAnimal(String tipoDoAnimal, TipoDeAtendimento tipoDeAtendimento) {

        this.tipoDoAnimal = tipoDoAnimal;
        this.tipoDeAtendimento = tipoDeAtendimento;
    }

    public String tipoDoAnimal() {
        return tipoDoAnimal;
    }

    public TipoDeAtendimento tipoDeAtendimento() {
        return tipoDeAtendimento;
    }
}
